package com.atguigu.huawei.test;

import java.util.Scanner;

import static java.lang.System.out;

public class MIanshiTi {

    public static void main(String[] args) {
        out.println("请输入一个字符串");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        out.println(str);
        int op = op(str);
        out.println(op);


    }


    static int op(String str){
        if(str.length()> 0 && str.length() <= 5000){
            int i  = str.lastIndexOf(" ");
            out.println(str.substring(i+1,str.length()).length());

        }
        return -1;

    }

}
