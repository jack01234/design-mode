package javadesignbook.qiaojie;

import java.io.InputStream;

/**
 *
 * 抽象基流类
 *
 * @author yingmuhuadao
 * @version 1.0.0
 * @date 2020/6/11 19:41
 */
public abstract class AbstractStream {

    protected InputStream in;

    protected int size;

    protected byte[] readBytes() throws Exception{
        byte buf[] = new byte[size];
        in.read(buf);
        return buf;
    }

    public void close()throws Exception {
        in.close();
    }
}
