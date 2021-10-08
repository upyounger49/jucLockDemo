package com.atguigu.spring.aop.entity;

import static java.lang.System.out;

public class B {
    private A a;

    public A getA(){
        return a;
    }

    public void setA(A a){
        this.a=a;
    }

    public B(){
        out.println("B created success");
    }
}
