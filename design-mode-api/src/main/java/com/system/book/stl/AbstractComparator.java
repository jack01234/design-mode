package com.system.book.stl;

/**
 * @author yingmuhuadao
 * @version 1.0.0
 * @date 2020/6/4 15:21
 */
public abstract class AbstractComparator<T> implements IComparator<T>{

    @Override
    public boolean less(T x, T y) {
        return true;
    }

    @Override
    public boolean equal(T x, T y) {
        return true;
    }
}
