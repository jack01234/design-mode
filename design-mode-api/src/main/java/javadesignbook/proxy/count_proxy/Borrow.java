package javadesignbook.proxy.count_proxy;

import lombok.Getter;
import lombok.Setter;

/**
 * @author yingmuhuadao
 * @version 1.0.0
 * @date 2020/6/12 10:43
 */
public class Borrow implements IBorrow{
    @Getter
    @Setter
    private Book book;

    @Override
    public boolean borrow() {
        return true;
    }
}
