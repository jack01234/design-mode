package javadesignbook.state;

/**
 * 透支状态下打电话类
 *
 * @author yingmuhuadao
 * @version 1.0.0
 * @date 2020/6/12 14:56
 */
public class OverDrawState implements ICellState{

    @Override
    public boolean phone(CellContext ct) {
        System.out.println(ct.name+":已处于欠费状态，请及时缴费");
        int minute = (int) (Math.random()*10+1);
        ct.cost(minute);
        ct.setState();
        return true;
    }
}
