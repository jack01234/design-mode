package javadesignbook.abs_and_interface;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 流程处理
 *
 * @author: yingmuhuadao
 * @date: Created in 16:04 2018/12/14
 */
@Data
@AllArgsConstructor
public class ShapePro {

    private IShape iShape;

    public float process(){
        //1.输入数据
        iShape.input();
        //2.计算面积
        return iShape.getArea();
    }
}
