package javadesignbook.simple_factory;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

/**
 * pc 端 api
 *
 * @author: yingmuhuadao
 * @date: Created in 16:34 2018/12/21
 */
public class ImageRead implements IRead<ImageInfo> {
    @Override
    public ImageInfo read(String... in) {
        BufferedImage bi = null;
        File f = new File(in[0]);
        try {
            bi = ImageIO.read(f);
        } catch (Exception e) {
            e.printStackTrace();
        }
        int width = bi.getWidth();
        int height = bi.getHeight();
        int rgb[] = new int[width*height];
        //将数据图像读到缓冲区
        bi.getRGB(0,0,width,height,rgb,width,height);
        //设置图像信息
        ImageInfo obj = new ImageInfo();
        //设置宽度
        obj.setWidth(width);
        //设置高度
        obj.setHeight(height);
        //设置rgb三基色颜色
        obj.setRGB(rgb);
        return obj;
    }
}
