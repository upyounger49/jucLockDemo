package com.atguigu.spring;

import com.atguigu.spring.aop.entity.A;
import com.atguigu.spring.aop.entity.B;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
@EnableAspectJAutoProxy
public class AopService {

    public static void main(String[] args) {
//        SpringApplication.run(AopService.class,args);

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        applicationContext.getBean("a", A.class);
        applicationContext.getBean("b", B.class);
    }
}
