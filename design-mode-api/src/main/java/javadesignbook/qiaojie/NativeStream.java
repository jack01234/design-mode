package javadesignbook.qiaojie;

import java.io.File;
import java.io.FileInputStream;

/**
 * @author yingmuhuadao
 * @version 1.0.0
 * @date 2020/6/11 19:44
 */
public class NativeStream extends AbstractStream{
    public NativeStream(String strFile) throws Exception{
        File file = new File(strFile);
        size = (int) file.length();
        in = new FileInputStream(file);
    }

}