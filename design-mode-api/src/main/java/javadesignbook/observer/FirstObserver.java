package javadesignbook.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author yingmuhuadao
 * @version 1.0.0
 * @date 2020/6/9 21:40
 */
public class FirstObserver implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        Subject<String> subject = (Subject<String>) o;
        System.out.println("this data is "+ subject.getData());
    }
}
