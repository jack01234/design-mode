package javadesignbook.observer;

import javadesignbook.util.JdbcConnectUtil;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.util.Observable;
import java.util.Vector;

/**
 * @author yingmuhuadao
 * @version 1.0.0
 * @date 2020/6/10 9:52
 */
public class Subject1 extends Observable implements MouseListener {

    private String tableName;

    private JTable table;

    public Subject1(JTable table) throws Exception{
        this.table = table;
        Connection connection = JdbcConnectUtil.getConnection();
        DatabaseMetaData metaData = connection.getMetaData();
        String s[] = {"table"};
        ResultSet rs = metaData.getTables(null, null, null, s);
        Vector<String> vec = new Vector<>();
        while (rs.next()) {
            vec.add(rs.getString("TABLE_NAME"));
        }
        connection.close();

        String data[][] = new String[vec.size()][1];

        for (int i=0; i<vec.size(); i++) {
            data[i][0] = vec.get(i);
        }

        String title[] = {"表名称"};
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        dtm.setDataVector(data,title);

        //注册鼠标事件
        table.addMouseListener(this);
    }

    public String getTableName(){
        return this.tableName;
    }

    public void setTableName(String tableName) {
        System.out.println(tableName);
        this.tableName = tableName;

    }


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
