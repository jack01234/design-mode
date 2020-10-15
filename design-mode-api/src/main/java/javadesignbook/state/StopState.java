package javadesignbook.state;

/**
 * 停机状态类
 *
 * @author yingmuhuadao
 * @version 1.0.0
 * @date 2020/6/12 14:58
 */
public class StopState implements ICellState{
    @Override
    public boolean phone(CellContext ct) {
        System.out.println(ct.name+":已处于欠费状态，请及时缴费");
        return false;
    }
}
