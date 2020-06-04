package com.wmli.system.api.chain;

/**
 * @author yingmuhuadao
 * @version 1.0.0
 * @date 2020/1/16 16:22
 */
public class GManagerLeaveHandler extends AbstractLeaveHandler{

    public GManagerLeaveHandler(String name){
        this.handlerName = name;
    }

    @Override
    public void handlerRequest(LeaveRequest request) {
        if(request.getLeaveDays() > this.MIDDLE && request.getLeaveDays() <= this.MAX){
            System.out.println("总经理:" + handlerName + ",已经处理;流程结束。");
            return;
        }

        if(null != this.nextHandler){
            this.nextHandler.handlerRequest(request);
        }else{
            System.out.println("审批拒绝！");
        }
    }
}
