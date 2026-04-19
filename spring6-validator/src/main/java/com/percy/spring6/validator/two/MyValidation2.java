package com.percy.spring6.validator.two;

import jakarta.validation.ConstraintViolation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.validation.Validator;

import java.util.List;
import java.util.Set;

@Service
public class MyValidation2 {

    @Autowired
    Validator validator;


    public boolean validatorByUserTwo(User user){
        BindException bindException =new BindException(user,user.getName());
        validator.validate(user,bindException);
        List<ObjectError> allErrors = bindException.getAllErrors();
        System.out.println(allErrors);


        return bindException.hasErrors();

    }
}
