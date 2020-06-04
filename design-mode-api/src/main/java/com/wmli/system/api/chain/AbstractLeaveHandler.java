package com.wmli.system.api.chain;

/**
 * 责任链处理类
 *
 * @author yingmuhuadao
 * @version 1.0.0
 * @date 2020/1/16 15:39
 */
public abstract class AbstractLeaveHandler {

    protected int MIN = 1;
    protected int MIDDLE = 3;
    protected int MAX = 30;

    protected String handlerName;

    /**
     * 下一个处理节点
     */
    protected AbstractLeaveHandler nextHandler;

    protected void setNextHandler(AbstractLeaveHandler handler){
        this.nextHandler = handler;
    }

    public abstract void handlerRequest(LeaveRequest request);
}
