package am.ik.yavi.yavibenchmark;

import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import jmh.mbr.junit5.Microbenchmark;
import org.hibernate.validator.HibernateValidator;
import org.hibernate.validator.HibernateValidatorConfiguration;
import org.hibernate.validator.cfg.ConstraintMapping;
import org.hibernate.validator.cfg.defs.MaxDef;
import org.hibernate.validator.cfg.defs.MinDef;
import org.hibernate.validator.cfg.defs.NotNullDef;
import org.hibernate.validator.cfg.defs.SizeDef;
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

import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.Throughput)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@Fork(value = 1)
@Threads(1)
@Warmup(iterations = 5, time = 5)
@Measurement(iterations = 5, time = 5)
@Microbenchmark
public class YaviBenchmark {

  static UserForm simpleEmptyData = new UserForm("", "", 0);

  static UserForm simpleValidData = new UserForm("John Doe", "john@example.com", 30);

  static UserForm simpleInvalidData = new UserForm("012345678901234567890123456789", "0123456789@0123456789012345678901234567890123456789", 300);

  @Benchmark
  public void simpleEmpty(MainState state) throws Exception {
    state.run(simpleEmptyData);
  }

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

    public static Validator annotationValidator;
    public static Validator programmaticValidator;

    {
      ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
      annotationValidator = factory.getValidator();

      HibernateValidatorConfiguration config = Validation.byProvider(HibernateValidator.class).configure();

      ConstraintMapping mapping =
              config.createConstraintMapping();

      mapping.type(UserForm.class)
              .field("name")
              .constraint(new NotNullDef())
              .constraint(new SizeDef().min(1).max(20))
              .field("email")
              .constraint(new NotNullDef())
              .constraint(new SizeDef().min(1).max(50))
              .field("age")
              .constraint(new NotNullDef())
              .constraint(new MinDef().value(0))
              .constraint(new MaxDef().value(200));

      programmaticValidator = config.addMapping(mapping)
              .buildValidatorFactory()
              .getValidator();
    }

    public enum ValidatorType {
      BV {
        @Override
        void validate(UserForm userForm) {
          annotationValidator.validate(userForm);
        }
      }, PHV {
        @Override
        void validate(UserForm userForm) {
          programmaticValidator.validate(userForm);
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
