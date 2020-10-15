package javadesignbook.state;

/**
 * @author yingmuhuadao
 * @version 1.0.0
 * @date 2020/6/12 15:04
 */
public class Test {
    public static void main(String[] args) {
        CellContext ct = new CellContext("13798478976","liming",2);
        ct.call();
        ct.call();
        ct.call();
    }
}
