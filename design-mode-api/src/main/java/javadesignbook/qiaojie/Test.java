package javadesignbook.qiaojie;

/**
 * @author yingmuhuadao
 * @version 1.0.0
 * @date 2020/6/11 19:50
 */
public class Test {

    public static void main(String[] args)throws Exception {
        //打开本地文件流
        AbstractStream in = new NativeStream("D:\\usr\\upload\\1911192058049804.jpg");

        ImageRead read = new ImageRead(in);

        AbstractThing thing = new NativeFile(read);

        Object read1 = thing.read();
        in.close();
        System.out.println("success");

    }
}
