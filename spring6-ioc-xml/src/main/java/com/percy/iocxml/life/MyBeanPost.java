package com.percy.iocxml.life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPost  implements BeanPostProcessor {
   @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

       System.out.println("3 bean 後置處理器 初始化之前執行");
       System.out.println(beanName+"::"+bean);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("5 bean 後置處理器 初始化之后執行");
        System.out.println(beanName+"::"+bean);
        return bean;
    }
}
