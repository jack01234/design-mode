package javadesignbook.abs_and_interface;

/**
 * pc 端 api
 *
 * @author: yingmuhuadao
 * @date: Created in 17:15 2018/12/14
 */
public class Arithmetic<T> {
    IComparator cmp;

    public Arithmetic (IComparator cmp) {
        this.cmp = cmp;
    }

    public T median(T x, T y, T z){
        if (cmp.less(x,y)) {
            return cmp.less(y,z)?y:cmp.less(x,z)?z:x;
        }else {
            return cmp.less(x,z)?x:cmp.less(y,z)?z:y;
        }
    }
}
