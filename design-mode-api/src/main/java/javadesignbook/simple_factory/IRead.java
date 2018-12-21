package javadesignbook.simple_factory;

/**
 * pc 端 api
 *
 * @author: yingmuhuadao
 * @date: Created in 16:24 2018/12/21
 */
public interface IRead<T> {
    T read(String ... in);
}
