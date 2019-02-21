package com.wmli.system.api.shengchengqi.demo1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 学生界面生成器
 */
public class StudentBuilder extends UIBuilder implements ActionListener {
    String user;
    //姓名
    JTextField studName = new JTextField(10);
    //年龄
    JTextField stuAge = new JTextField(10);
    //专业
    JTextField studMajor = new JTextField(10);
    //学院
    JTextField stuDepart = new JTextField(10);

    //更新
    JButton updateBtn = new JButton("更新");

    @Override
    public void addUI() {
        //界面生成方法
        JPanel center = new JPanel();
        JPanel south = new JPanel();
        //第一列垂直Box对象B

        Box b = Box.createVerticalBox();
        b.add(new JLabel("姓名"));
        b.add(Box.createVerticalStrut(8));
        b.add(new JLabel("年龄"));
        b.add(Box.createVerticalStrut(8));
        b.add(new JLabel("专业"));
        b.add(Box.createVerticalStrut(8));
        b.add(new JLabel("学院"));
        b.add(Box.createVerticalStrut(8));
    }

    @Override
    public void registerMsg() {

    }

    @Override
    public void initialData(String user) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
