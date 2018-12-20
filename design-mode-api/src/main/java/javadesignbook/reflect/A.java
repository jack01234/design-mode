package javadesignbook.reflect;

/**
 * pc 端 api
 *
 * @author: yingmuhuadao
 * @date: Created in 18:11 2018/12/14
 */
public class A {

//    public A(){
//        System.out.println("func1");
//    }
//
//    public A(Integer m){
//        System.out.println("func1 val "+m);
//    }
//
//    public A(String s,Integer m){
//        System.out.println("func1 val "+s + m);
//    }

    public static void main(String[] args) {
        try {
            Class info = Class.forName("javadesignbook.reflect.A");
            //调用无参构造函数，生成新的示例对象
            Object o = info.getConstructor().newInstance();
            System.out.println(o);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
