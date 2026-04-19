package com.percy.spring6.validator.one;


import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;

//校驗測試
public class TestPerson {

    public static void main(String[] args) {
        //創建Person
        Person person =new Person();
        person.setName("Percy");
        person.setAge(2000);

        //創建person對應databinder
        DataBinder binder =new DataBinder(person);

        //設置叫校驗器
        binder.setValidator(new PersonValidator());

        //調用方法校驗
        binder.validate();
        
        //輸出校驗結果
        BindingResult bindingResult = binder.getBindingResult();
        System.out.println(bindingResult);

    }
}
