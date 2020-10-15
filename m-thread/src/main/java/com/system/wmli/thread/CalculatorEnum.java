package com.system.wmli.thread;

/**
 * @author yingmuhuadao
 * @version 1.0.0
 * @date 2020/9/6 14:33
 */
public enum CalculatorEnum {

    ADD("+"){
        @Override
        public int compute(int a, int b) {
            return a+b;
        }
    },

    SUB("-"){
        @Override
        public int compute(int a, int b) {
            return a-b;
        }
    },
    ;
    CalculatorEnum(String value){
        this.value = value;
    }
    private final String value;

    public abstract int compute(int a, int b);
}
