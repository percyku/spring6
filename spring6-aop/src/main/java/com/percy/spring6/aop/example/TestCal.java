package com.percy.spring6.aop.example;

import org.junit.jupiter.api.Test;

public class TestCal {

    @Test
    public void Test1(){

        //創建代理對象（動態）
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
        Calculator proxy = (Calculator)proxyFactory.getProxy();
        proxy.add(1,2);
    }
}
