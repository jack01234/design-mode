package javadesignbook.qiaojie;

/**
 * 抽象事物类
 *
 * @author yingmuhuadao
 * @version 1.0.0
 * @date 2020/6/11 19:47
 */
public abstract class AbstractThing {
    IRead iRead;

    public AbstractThing(IRead iRead){
        this.iRead = iRead;
    }

    Object read()throws Exception{
        return iRead.read();
    }
}
