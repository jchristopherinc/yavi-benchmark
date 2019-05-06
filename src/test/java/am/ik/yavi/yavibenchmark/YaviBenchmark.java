package am.ik.yavi.yavibenchmark;

import jmh.mbr.junit5.Microbenchmark;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Threads;
import org.openjdk.jmh.annotations.Warmup;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.Throughput)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@Fork(value = 1)
@Threads(8)
@Warmup(iterations = 5, time = 5)
@Measurement(iterations = 5, time = 5)
@Microbenchmark
public class YaviBenchmark {

    static UserForm simpleValidData = new UserForm("John Doe", "john@example.com", 30);

    static UserForm simpleInvalidData = new UserForm("", "", 0);

    @Benchmark
    public void simpleValid(MainState state) throws Exception {
        state.run(simpleValidData);
    }

    @Benchmark
    public void simpleInvalid(MainState state) throws Exception {
        state.run(simpleInvalidData);
    }

    @State(Scope.Benchmark)
    public static class MainState {

        public static Validator validator;

        {
            ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
            validator = factory.getValidator();
        }

        public enum ValidatorType {
            BV {
                @Override
                void validate(UserForm userForm) {
                    validator.validate(userForm);
                }
            }, YAVI {
                @Override
                void validate(UserForm userForm) {
                    UserForm.validator.validate(userForm);
                }
            };

            abstract void validate(UserForm userForm);
        }

        @Param
        private ValidatorType validatorType;


        public void run(UserForm userForm) {
            validatorType.validate(userForm);
        }
    }
}
