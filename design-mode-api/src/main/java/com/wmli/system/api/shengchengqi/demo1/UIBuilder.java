package com.wmli.system.api.shengchengqi.demo1;

import javax.swing.*;

/**
 * 界面抽象生成器类
 */
public abstract class UIBuilder {
    JPanel jPanel = new JPanel();
    //形成界面
    abstract public void addUI();
    //注册消息
    abstract public void registerMsg();
    //初始化界面数据
    abstract public void initialData(String user);
    //返回界面面板对象
    public JPanel getjPanel(){
        return jPanel;
    }
}
