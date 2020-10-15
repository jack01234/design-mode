package javadesignbook.qiaojie;

/**
 * @author yingmuhuadao
 * @version 1.0.0
 * @date 2020/6/11 19:52
 */
public class TextRead implements IRead<String>{
    AbstractStream stream;

    public TextRead(AbstractStream stream){
        this.stream = stream;
    }
    @Override
    public String read() throws Exception {
        byte[] bytes = stream.readBytes();
        String s = new String(bytes);
        return s;
    }
}
