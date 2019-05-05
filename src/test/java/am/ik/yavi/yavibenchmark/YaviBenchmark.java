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
@Threads(50)
@Warmup(iterations = 10)
@Measurement(iterations = 20)
@Microbenchmark
public class YaviBenchmark {

    @Benchmark
    public void bench(MainState state) throws Exception {
        state.run(new Message(""));
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
                void validate(Message message) {
                    validator.validate(message);
                }
            }, YAVI {
                @Override
                void validate(Message message) {
                    Message.validator.validate(message);
                }
            };

            abstract void validate(Message message);
        }

        @Param
        private ValidatorType validatorType;


        public void run(Message message) {
            validatorType.validate(message);
        }
    }
}
