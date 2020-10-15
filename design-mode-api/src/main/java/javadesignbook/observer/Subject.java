package javadesignbook.observer;

import lombok.extern.slf4j.Slf4j;

import java.util.Observable;

/**
 * 观察者对象
 *
 * @author yingmuhuadao
 * @version 1.0.0
 * @date 2020/6/9 21:34
 */
@Slf4j
public class Subject<T> extends Observable {

    private T data;

    private Object condition;

    public void setCondition(Object condition){
        this.condition = condition;
    }

    public void setData(T data){
        this.data = data;
        setChanged();
        notifyObservers(condition);
    }

    public T getData(){
        return this.data;
    }
}
