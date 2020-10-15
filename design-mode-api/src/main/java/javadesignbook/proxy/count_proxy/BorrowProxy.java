package javadesignbook.proxy.count_proxy;

import java.util.HashMap;
import java.util.Map;

/**
 * 借阅代理类
 *
 * @author yingmuhuadao
 * @version 1.0.0
 * @date 2020/6/12 10:44
 */
public class BorrowProxy implements IBorrow{
    private Borrow obj;

    private Map<String, Integer> map;

    public BorrowProxy(Borrow obj){
        this.obj = obj;
        map = new HashMap<>();
    }
    @Override
    public boolean borrow() {
        if (!obj.borrow()) {
            return false;
        }
        Book book = obj.getBook();
        Integer integer = map.get(book.getNo());
        integer = (integer == null)?1:integer+1;
        map.put(book.getNo(),integer);
        System.out.println(map.get(book.getNo()));
        return true;
    }

    public void log(){
        //日志记录逻辑
    }
}
