package javadesignbook.reflect;

import java.lang.reflect.Method;

/**
 * pc 端 api
 *
 * @author: yingmuhuadao
 * @date: Created in 18:11 2018/12/14
 */
public class A {

   public void func1(){
        System.out.println("func1");
    }

    public void func2(Integer m){
        System.out.println("func1 val "+m);
    }

    public void func3(String s,Integer m){
        System.out.println("func1 val "+s + m);
    }

    public static void main(String[] args) {
        try {
            Class info = Class.forName("javadesignbook.reflect.A");
            //调用无参构造函数，生成新的示例对象
            Object o = info.getConstructor().newInstance();
            System.out.println(o);

            //调用无参成员函数
            Method func1 = info.getMethod("func1");
            func1.invoke(o);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
