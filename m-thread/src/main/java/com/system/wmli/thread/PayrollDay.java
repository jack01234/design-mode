package com.system.wmli.thread;

/**
 * 策略枚举
 *
 * @author yingmuhuadao
 * @version 1.0.0
 * @date 2020/9/6 14:46
 */
public enum PayrollDay {

    MONDAY, TUESDAY, FRIDAY, SATURDAY, SUNDAY,
    ;



    private enum PayType {
        WEEKDAY{
            @Override
            int overtimePay(int mins, int payRate) {
                return 0;
            }
        },

        WEEKEND{
            @Override
            int overtimePay(int mins, int payRate) {
                return 0;
            }
        },
        ;

        abstract int overtimePay(int mins, int payRate);

        private static final int MINS_PER_SHIFT = 8 * 60;

        int pay(int minWorked, int payRate){
            int basePay = minWorked * payRate;
            return basePay + overtimePay(minWorked, payRate);
        }
    }
}
