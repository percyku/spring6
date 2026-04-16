package com.percy.iocxml.factorybean;

public class User {

    private String name;


    public User() {
        System.out.println("1.調用無參數構造");
    }

    //初始的方法
    public void initMethod(){
        System.out.println("4.bean對象初始化，調用指定方法");
    }

    //銷毀的方話
    public void destroyMethod(){
        System.out.println("7.bean對象銷毀，調用指定的銷毀方法 ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("2.給bean對象設定屬性值");
        this.name = name;
    }
}
