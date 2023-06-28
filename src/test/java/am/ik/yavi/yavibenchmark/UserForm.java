package am.ik.yavi.yavibenchmark;

import am.ik.yavi.builder.ValidatorBuilder;
import am.ik.yavi.core.Validator;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.io.Serializable;

public class UserForm implements Serializable {

    private static final long serialVersionUID = 1L;

    public UserForm() {
    }

    public UserForm(String name, String email, Integer age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    @NotNull
    @Size(min = 1, max = 20)
    private String name;

    @NotNull
    @Size(min = 1, max = 50)
    private String email;

    @NotNull
    @Min(0)
    @Max(200)
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public static Validator<UserForm> validator = ValidatorBuilder.of(UserForm.class)
        .constraint(UserForm::getName, "name", c -> c.notNull().greaterThan(1).lessThan(20))
        .constraint(UserForm::getEmail, "email", c -> c.notNull().greaterThan(1).lessThan(50))
        .constraint(UserForm::getAge, "age", c -> c.notNull().greaterThan(0).lessThan(200))
        .build();
}
