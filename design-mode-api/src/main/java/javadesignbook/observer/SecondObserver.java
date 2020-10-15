package javadesignbook.observer;

import lombok.Getter;

import java.util.Observable;
import java.util.Observer;

/**
 * @author yingmuhuadao
 * @version 1.0.0
 * @date 2020/6/9 21:54
 */
public class SecondObserver implements Observer {
    @Getter
    private int c;

    @Override
    public void update(Observable o, Object arg) {
        Subject<String> subject = (Subject<String>) o;
        if (subject.getData().equals(arg))
            c++;
    }
}
