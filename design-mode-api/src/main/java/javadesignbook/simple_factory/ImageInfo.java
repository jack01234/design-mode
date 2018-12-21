package javadesignbook.simple_factory;

import lombok.Data;

/**
 * pc 端 api
 *
 * @author: yingmuhuadao
 * @date: Created in 16:35 2018/12/21
 */
@Data
public class ImageInfo {
    /**
     * 图像宽度
     */
    private int width;

    /**
     * 图像高度
     */
    private int height;

    /**
     * 红色分量
     */
    private int r[][];

    /**
     * 绿色分量
     */
    private int g[][];

    /**
     * 蓝色分量
     */
    private int b[][];

    public void setRGB(int rgb[]){
        r = new int[height][width];
        g = new int[height][width];
        b = new int[height][width];

        int pos = 0;
        for (int i=0;i<height;i++) {
            pos = width*i;
            for (int j=0;j<width;j++) {
                r[i][j] = (rgb[pos+j]&0xfff0000)>>16;
                g[i][j] = (rgb[pos+j]&0x00ff00)>>8;
                b[i][j] = rgb[pos+j]&0x0000ff;
            }
        }
    }
}
