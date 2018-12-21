package javadesignbook.simple_factory;

import java.io.File;
import java.io.FileInputStream;

/**
 * pc 端 api
 *
 * @author: yingmuhuadao
 * @date: Created in 16:26 2018/12/21
 */
public class TextRead implements IRead<String> {

    @Override
    public String read(String... in) {
        String result = null;
        try {
            File file = new File(in[0]);
            long len = file.length();
            FileInputStream inputStream = new FileInputStream(in[0]);
            //缓冲区大小等于文件长度
            byte buf[] = new byte[(int) len];
            //一次性读取所有文件
            inputStream.read(buf);
            //按编码格式转换成可见字符串
            result = new String(buf,in[1]);
            inputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
