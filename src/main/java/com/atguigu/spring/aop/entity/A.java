package com.atguigu.spring.aop.entity;

import static java.lang.System.out;

public class A {

    private B b;

    public B getB(){
        return b;
    }

    public void setB(B b){
        this.b=b;
    }

    public A(){
        out.println("A created success");
    }
}
