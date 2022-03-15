package com.aykan.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({
        ElementType.TYPE, ElementType.ANNOTATION_TYPE, ElementType.FIELD
})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = EmailValidator.class)
@Documented
public @interface PasswordMatches {

    String message() default "Password doesn`t match!";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
