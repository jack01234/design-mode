package com.wmli.system.api.chain;

/**
 * @author yingmuhuadao
 * @version 1.0.0
 * @date 2020/1/16 15:47
 */
public class DirectLeaderLeaveHandler extends AbstractLeaveHandler {

    public DirectLeaderLeaveHandler(String name){
        this.handlerName = name;
    }

    @Override
    public void handlerRequest(LeaveRequest request) {
        if (request.getLeaveDays() <= this.MIN) {
            System.out.println("直接主管："+handlerName+",已经处理；流程结束！");
            return;
        }
        if (null != this.nextHandler) {
            this.nextHandler.handlerRequest(request);
        } else {
            System.out.println("审批拒绝！");
        }
    }
}
