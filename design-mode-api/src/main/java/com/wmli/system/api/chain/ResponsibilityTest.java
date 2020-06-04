package com.wmli.system.api.chain;

/**
 * 单元测试
 *
 * @author yingmuhuadao
 * @version 1.0.0
 * @date 2020/1/16 16:24
 */
public class ResponsibilityTest {
    public static void main(String[] args) {
        LeaveRequest request = LeaveRequest.builder().leaveDays(10).name("李明").build();

        DirectLeaderLeaveHandler dir = new DirectLeaderLeaveHandler("县令");
        DeptManagerLeaveHandler dept = new DeptManagerLeaveHandler("知府");
        GManagerLeaveHandler gm = new GManagerLeaveHandler("京兆伊");

        dir.setNextHandler(dept);
        dept.setNextHandler(gm);

        dir.handlerRequest(request);
    }
}
