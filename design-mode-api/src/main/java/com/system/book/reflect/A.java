package com.system.book.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @author yingmuhuadao
 * @version 1.0.0
 * @date 2020/6/4 15:34
 */
public class A {

    public A(){
        System.out.println("This is A");
    }

    public A(int m){
        System.out.println("This is "+m);
    }

    public A(Integer m, String s){
        System.out.println(s+":"+m);
    }

    public A(String s){
        System.out.println(s);
    }
    public void func1(Integer m){
        System.out.println("this is func1 "+m);
    }
    public void func2(String str){
        System.out.println("this is func2 "+str);
    }
}
