package javadesignbook.simple_factory;

/**
 * pc 端 api
 *
 * @author: yingmuhuadao
 * @date: Created in 16:58 2018/12/21
 */
public class ImageFactory extends ReadAbstractFactory {
    @Override
    public IRead create() {
        return new ImageRead();
    }
}
