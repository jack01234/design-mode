package javadesignbook.qiaojie;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author yingmuhuadao
 * @version 1.0.0
 * @date 2020/6/11 19:45
 */
public class UrlStream extends AbstractStream{

    public UrlStream(String strFile)throws Exception{
        URL url = new URL(strFile);
        in = url.openStream();
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        size = urlConnection.getContentLength();
    }
}
