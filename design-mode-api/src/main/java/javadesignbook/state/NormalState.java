package javadesignbook.state;

/**
 * @author yingmuhuadao
 * @version 1.0.0
 * @date 2020/6/12 14:48
 */
public class NormalState implements ICellState {

    @Override
    public boolean phone(CellContext ct) {
        System.out.println(ct.name+":手机处于正常状态");
        int minute = (int) (Math.random()*10+1);
        ct.cost(minute);
        //重新设置打电话后的状态
        ct.setState();
        //………………
        return true;
    }
}
