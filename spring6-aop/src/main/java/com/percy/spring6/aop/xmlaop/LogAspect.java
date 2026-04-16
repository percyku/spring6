package com.percy.spring6.aop.xmlaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component // ioc容器
public class LogAspect {

    //前置通知
    public void beforeMethod(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("logger-->前置通知 方法名稱："+methodName+ " 參數:"+ Arrays.toString(args));
    }


    //後置通知
    public void afterMethod(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        System.out.println("logger-->後置通知 方法名稱："+methodName);
    }

    // 返回通知．獲取目標方法的返回值
    public void afterReturningMethod(JoinPoint joinPoint,Object result){
        String methodName = joinPoint.getSignature().getName();

        System.out.println("logger-->返回通知 方法名稱："+methodName +" 返回結果："+result);
    }


    //異常通知
    public void afterThrowingMethod(JoinPoint joinPoint,Throwable ex){
        String methodName = joinPoint.getSignature().getName();
        System.out.println("logger-->異常通知 方法名稱："+methodName+" 異常訊息："+ex);
    }

    // 環繞通知
    public Object aroundMethod(ProceedingJoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        String argsString = Arrays.toString(args);
        Object result =null;
        try{
            System.out.println("環繞通知==目標方法之前執行");

            //調用目標方法
            result = joinPoint.proceed();

            System.out.println("環繞通知==目標方法返回值之後");
        }catch(Throwable throwable){
            throwable.printStackTrace();
            System.out.println("環繞通知==目標方法出現異常執行");
        }finally {
            System.out.println("環繞通知==目標方法執行完畢");
        }


        return result;
    }






}
