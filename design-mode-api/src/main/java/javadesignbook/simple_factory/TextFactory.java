package javadesignbook.simple_factory;

/**
 * pc 端 api
 *
 * @author: yingmuhuadao
 * @date: Created in 16:57 2018/12/21
 */
public class TextFactory extends ReadAbstractFactory {
    @Override
    public IRead create() {
        return new TextRead();
    }
}
