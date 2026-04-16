package com.percy.spring6.aop.example.reflect;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestCar {

    //1獲取class對象多種方法
    @Test
    public void Test1() throws Exception{
        //1 類名.class
        Class  clazz1 = Car.class;


        //2 對象.getClass
        Class clazz2 = new Car().getClass();


        //3.Class.forName("全路徑")
        Class clazz3 = Class.forName("com.percy.spring6.aop.example.reflect.Car");

        //實體化
        Car car =(Car) clazz3.getDeclaredConstructor().newInstance();
        System.out.println(car);
    }

    //2 構造構造方法
    @Test
    public void Test2() throws Exception{
        Class  clazz1 = Car.class;
        //獲取所有構造
        //getConstructors獲取所有public 的構造方法
        //Constructor[] constructors = clazz1.getConstructors();
        //getDeclaredConstructors獲取所有 的構造方法 public private
        Constructor[] constructors = clazz1.getDeclaredConstructors();
        for(Constructor c :constructors){
            System.out.println("構造名稱："+c.getName()+"-參數個數："+c.getParameterCount());
        }

        //指定有參數構造創建對象
        //1構造public
//        Constructor c1 = clazz1.getConstructor(String.class, int.class, String.class);
//        Car car1= (Car)c1.newInstance("賓士",23,"白");
//        System.out.println(car1);

        //2構造private
        Constructor c2 = clazz1.getDeclaredConstructor(String.class, int.class, String.class);
        c2.setAccessible(true);
        Car car2= (Car)c2.newInstance("賓利",3,"黑");
        System.out.println(car2);

    }


    //3 獲取屬性
    @Test
    public void Test3() throws Exception{
        Class  clazz1 = Car.class;
        Car car1 = (Car)clazz1.getDeclaredConstructor().newInstance();
        //獲取所有public 屬性
//        Field[] fields =clazz1.getFields();
        //獲取所有屬性(including private)
        Field[] fields = clazz1.getDeclaredFields();
        for(Field field:fields){


            if(field.getName().equals("name")){
                //設置允許訪問
                field.setAccessible(true);
                field.set(car1,"發拉利");

            }
            System.out.println(field.getName());
        }
        System.out.println(car1);


    }

    //4 獲取方法
    @Test
    public void Test4() throws Exception{
        Car car =new Car("賓士",20,"green");
        Class clazz= car.getClass();
        //1 public method
        Method[] methods = clazz.getMethods();
        for(Method method:methods){
            System.out.println(method.getName());
            //執行某個方法 toString
            if(method.getName().equals("toString")){
                String invoke = (String) method.invoke(car);
                System.out.println("toString執行了："+invoke);
            }
        }

        //2 private method
        Method[] methods2 = clazz.getDeclaredMethods();
        for(Method method:methods2){
            System.out.println(method.getName());
            //執行某個方法 run 私有方法
            if(method.getName().equals("run")){
                method.setAccessible(true);
                method.invoke(car);

            }
        }
    }

}
