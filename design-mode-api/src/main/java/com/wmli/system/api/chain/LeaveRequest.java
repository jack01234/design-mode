package com.wmli.system.api.chain;

import lombok.Builder;
import lombok.Data;

/**
 * 员工请假请求类
 * 责任链模式
 * @author yingmuhuadao
 * @version 1.0.0
 * @date 2020/1/16 15:04
 */
@Data
@Builder//快速使用建造者模式
public class LeaveRequest {
    private String name;
    private int leaveDays;
}
