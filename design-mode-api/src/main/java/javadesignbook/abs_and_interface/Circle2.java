package javadesignbook.abs_and_interface;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * pc 端 api
 *
 * @author: yingmuhuadao
 * @date: Created in 16:45 2018/12/14
 */
@AllArgsConstructor
@Data
public class Circle2 implements IShape2 {

    float r;
    /**
     * 多态方法
     *
     * @param nId
     * @param in
     * @return
     */
    @Override
    public Object dispatch(int nId, Object in) {
        Object obj = null;
        switch (nId){
            case 0:
                obj = getArea();
                break;
            case 1:
                obj = getPerimeter();
                break;
        }
        return obj;
    }

    //非多态方法
    Object getArea(){
        return Math.PI*r*r;
    }

    Object getPerimeter(){
        return Math.PI*r*2.0f;
    }
}
