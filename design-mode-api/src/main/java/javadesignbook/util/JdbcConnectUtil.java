package javadesignbook.util;

import lombok.extern.slf4j.Slf4j;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

/**
 * 数据库连接工具类
 *
 * @author yingmuhuadao
 * @version 1.0.0
 * @date 2020/6/10 10:03
 */
@Slf4j
public class JdbcConnectUtil {

    private static ThreadLocal<Connection> threadLocal = new ThreadLocal<>();

    /**
     * 获取jdbc连接
     *
     * @return 返回结果
     * @throws Exception
     */
    public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=Asia/Shanghai";
        return DriverManager.getConnection(url, "root", "123456");
    }


}
