package com.system.book.stl;

/**
 * @author yingmuhuadao
 * @version 1.0.0
 * @date 2020/6/4 15:25
 */
public class Algorithm<T> {

    IComparator<T> cmp;

    Algorithm (IComparator<T> cmp) {
        this.cmp = cmp;
    }

    public T median(T x, T y, T z){
        if (cmp.less(x,y)) {
            return cmp.less(y,z)?y:cmp.less(x,z)?z:x;
        } else {
            return cmp.less(x,z)?x:cmp.less(y,z)?z:y;
        }
    }
}
