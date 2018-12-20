package javadesignbook.abs_and_interface;

/**
 * pc 端 api
 *
 * @author: yingmuhuadao
 * @date: Created in 17:11 2018/12/14
 */
public interface IComparator<T> {
    boolean equals(T x, T y);
    boolean less(T x, T y);
}
