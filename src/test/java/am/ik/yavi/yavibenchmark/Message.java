package am.ik.yavi.yavibenchmark;

import am.ik.yavi.builder.ValidatorBuilder;
import am.ik.yavi.core.Validator;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;

public class Message implements Serializable {

    @NotBlank
    @Size(max = 8)
    private String text;

    Message() {
    }

    public Message(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return this.text;
    }

    public static Validator<Message> validator = ValidatorBuilder.of(Message.class)
        .constraint(Message::getText, "text", c -> c.notBlank().lessThanOrEqual(8))
        .build();
}
