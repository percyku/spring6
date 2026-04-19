package com.percy.spring6.validator.four;


import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CannotBlankValidator implements ConstraintValidator<CannotBlank,String> {
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if(value!=null && value.contains(" ")){
            //獲取默認訊息
            String defaultConstraintMessageTemplate = context.getDefaultConstraintMessageTemplate();
            System.out.println("default message:"+defaultConstraintMessageTemplate);

            context.disableDefaultConstraintViolation();

            //設立提示語
            context.buildConstraintViolationWithTemplate("cannot contains blank").addConstraintViolation();
            return false;
        }

        return true;
    }
}
