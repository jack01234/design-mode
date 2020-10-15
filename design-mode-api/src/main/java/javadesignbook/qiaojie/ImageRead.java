package javadesignbook.qiaojie;

/**
 * @author yingmuhuadao
 * @version 1.0.0
 * @date 2020/6/11 19:54
 */
public class ImageRead implements IRead<byte[]>{
    AbstractStream stream;
    public ImageRead(AbstractStream stream) {
        this.stream = stream;
    }
    @Override
    public byte[] read() throws Exception {
        return stream.readBytes();
    }
}
