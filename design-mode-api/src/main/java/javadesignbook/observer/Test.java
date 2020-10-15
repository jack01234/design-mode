package javadesignbook.observer;

import java.util.Observer;

/**
 * @author yingmuhuadao
 * @version 1.0.0
 * @date 2020/6/9 21:43
 */
public class Test {
    public static void main(String[] args) {
        Observer o = new FirstObserver();
        SecondObserver o1 = new SecondObserver();
        Subject<String> subject = new Subject<>();
        subject.setCondition("hello");
        subject.addObserver(o);
        subject.addObserver(o1);
        subject.setData("this test");
        subject.setData("hello");
        subject.setData("hello1");
        subject.setData("hello");

        System.out.println(o1.getC());
    }
}
