package javadesignbook.qiaojie;

/**
 * 抽象功能类
 *
 * @author yingmuhuadao
 * @version 1.0.0
 * @date 2020/6/11 19:40
 */
public interface IRead<T> {

    T read() throws Exception;
}
