package javadesignbook.state;

/**
 *
 * 手机上下文类
 *
 * @author yingmuhuadao
 * @version 1.0.0
 * @date 2020/6/12 14:32
 */
public class CellContext {
    public final int NORMAL_STATE = 1;
    public final int OVERDRAM_STATE = 2;
    public final int STOP_STATE = 3;

    String strPhone;
    String name;
    float price;
    //初始化手机状态
    int mark = -100;

    ICellState state;

    public CellContext(String strPhone,String name,float price){
        this.strPhone = strPhone;
        this.name = name;
        this.price = price;
    }
    public int getMark(){
        int mark = 0;
        if (price > ICellState.NORMAL_LIMIT) {
            mark = NORMAL_STATE;
        } else if (price < ICellState.STOP_LIMIT) {
            mark = STOP_STATE;
        } else {
            mark = OVERDRAM_STATE;
        }
        return mark;
    }

    public void setState(){
        int curMark = getMark();
        if (curMark == mark){
            return;
        }

        mark = curMark;

        switch (curMark) {
            case NORMAL_STATE:
                state = new NormalState();
                break;
            case OVERDRAM_STATE:
                state = new OverDrawState();
                break;
            case STOP_STATE:
                state = new StopState();
                break;
        }
    }

    public void cost(int minute){
        this.price = ICellState.COST_MINUTE*minute;
    }

    public boolean call(){
        this.setState();
        state.phone(this);
        return true;
    }

    public void save(float price){
        this.price += price;
    }
}
