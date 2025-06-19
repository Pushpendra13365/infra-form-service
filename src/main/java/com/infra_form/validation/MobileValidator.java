package com.infra_form.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class MobileValidator implements ConstraintValidator<ValidMobile, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value != null && value.matches("^[6-9]\\d{9}$");
    }
}
