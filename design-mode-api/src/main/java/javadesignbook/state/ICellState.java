package javadesignbook.state;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 *
 * 抽象状态接口
 * @author yingmuhuadao
 * @version 1.0.0
 * @date 2020/6/12 14:30
 */
public interface ICellState {
    public float NORMAL_LIMIT = 0;
    public float STOP_LIMIT = -1;

    public float COST_MINUTE = 0.2F;

    public boolean phone(CellContext ct);
}
