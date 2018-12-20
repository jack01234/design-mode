package javadesignbook.abs_and_interface;

/**
 * pc 端 api
 *
 * @author: yingmuhuadao
 * @date: Created in 17:12 2018/12/14
 */
public class AbstractComparator<T> implements IComparator<T> {
    @Override
    public boolean equals(T x, T y) {
        return true;
    }

    @Override
    public boolean less(T x, T y) {
        return true;
    }
}
