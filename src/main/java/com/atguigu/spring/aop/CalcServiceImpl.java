package com.atguigu.spring.aop;

import org.springframework.stereotype.Service;

import static java.lang.System.out;

@Service
public class CalcServiceImpl implements CalcService {

    @Override
    public int div(int x, int y) {
        int i = x / y;
        out.println("模仿业务逻辑.......");
        return i;
    }
}
