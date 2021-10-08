package com.atguigu.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import static java.lang.System.out;

@Component
@Aspect
public class MyAspect {

    @Before("execution(public int com.atguigu.spring.aop.CalcServiceImpl.*(..))")
    public void beforeNotify(){
        out.println("@Before前置通知....");

    }

    @After("execution(public int com.atguigu.spring.aop.CalcServiceImpl.*(..))")
    public void afterNotify(){
        out.println("@After后置通知.....");
    }

    @AfterReturning("execution(public int com.atguigu.spring.aop.CalcServiceImpl.*(..))")
    public void afterReturnNotify(){
        out.println("@AfterReturning返回后通知.....");
    }

    @AfterThrowing("execution(public int com.atguigu.spring.aop.CalcServiceImpl.*(..))")
    public void afterThrowingNotify(){
        out.println("@AfterThrowing异常通知.....");
    }

    /**
     * 环绕通知：
     *   环绕通知非常强大，可以决定目标方法是否执行，什么时候执行，执行时是否需要替换方法参数，执行完毕是否需要替换返回值。
     *   环绕通知第一个参数必须是org.aspectj.lang.ProceedingJoinPoint类型
     */
    @Around("execution(public int com.atguigu.spring.aop.CalcServiceImpl.*(..))")
    public Object aroundNotify(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object retVal = null;
        out.println("环绕通知之前AAA.....");
        retVal = proceedingJoinPoint.proceed();
        out.println("环绕通知之后BBB.....");
        return retVal;
    }


}
