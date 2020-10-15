package javadesignbook.proxy.count_proxy;

import java.lang.reflect.Proxy;

/**
 * @author yingmuhuadao
 * @version 1.0.0
 * @date 2020/6/12 10:49
 */
public class Test {
    public static void main(String[] args) {
        Borrow br = new Borrow();
        BorrowProxy proxy = new BorrowProxy(br);

        Book book = new Book();
        book.setName("aa");
        book.setNo("123456");
        br.setBook(book);
        proxy.borrow();

        Book book1 = new Book();
        book1.setName("aa");
        book1.setNo("123456");

        br.setBook(book1);
        proxy.borrow();


        IRegist email = new FormEmail();
        IRegist post = new FormPost();

        CountInvoke invoke = new CountInvoke(email);
        CountInvoke postInvoke = new CountInvoke(email);

        IRegist emailProxy = (IRegist) GenericProxy.createProxy(email,invoke);

        IRegist postProxy = (IRegist) GenericProxy.createProxy(post,postInvoke);

        emailProxy.regist("email");

        postProxy.regist("post");

        System.out.println(invoke.getCount());

        System.out.println(postInvoke.getCount());
    }
}
