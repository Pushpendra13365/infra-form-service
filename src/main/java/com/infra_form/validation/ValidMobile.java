package com.infra_form.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = MobileValidator.class)
@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidMobile {

    String message() default "Invalid mobile number. It must be 10 digits and start with 6-9.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}

