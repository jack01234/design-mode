package com.system.book.reflect;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

/**
 * @author yingmuhuadao
 * @version 1.0.0
 * @date 2020/9/26 17:41
 */
public class MethodHandleTest {

    public String toString(String str){
        return "hello,"+str+"methodHandle";
    }
    public static void main(String[] args) throws Throwable {

        MethodHandleTest handleTest = new MethodHandleTest();

        MethodType methodType = MethodType.methodType(String.class, String.class);


        MethodHandle mh = MethodHandles.lookup().findVirtual(MethodHandleTest.class, "toString", methodType);

        Object ssss = mh.bindTo(new MethodHandleTest()).invokeWithArguments("ssss");

        Class<IGamePlayer> iGamePlayerClass = IGamePlayer.class;
        System.out.println(iGamePlayerClass.getName());
        System.out.println(ssss);

    }
}
