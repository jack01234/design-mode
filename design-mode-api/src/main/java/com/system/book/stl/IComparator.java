package com.system.book.stl;

/**
 * @author yingmuhuadao
 * @version 1.0.0
 * @date 2020/6/4 15:20
 */
public interface IComparator<T> {

    boolean less(T x, T y);

    boolean equal(T x,T y);
}
