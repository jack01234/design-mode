package javadesignbook.simple_factory;

/**
 * pc 端 api
 *
 * @author: yingmuhuadao
 * @date: Created in 16:53 2018/12/21
 */
public abstract class ReadAbstractFactory {
    public abstract IRead create();

    static ReadAbstractFactory create(String className){
        ReadAbstractFactory readAbstractFactory = null;
        try {
            Class<?> aClass = Class.forName(className);
            readAbstractFactory = (ReadAbstractFactory) aClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return readAbstractFactory;
    }
}
