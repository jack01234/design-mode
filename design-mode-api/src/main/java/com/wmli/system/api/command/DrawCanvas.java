package com.wmli.system.api.command;

import java.awt.*;
import java.util.Random;

/**
 * @author yingmuhuadao
 * @version 1.0.0
 * @date 2020/1/16 13:56
 */
public class DrawCanvas extends Canvas implements Drawable{

    private static final long serialVersionUID = 1972130370393242746L;

    private MacroCommand history;

    private int radius=8;

    public DrawCanvas(int width,int height, MacroCommand history) {
        setSize(width, height);
        setBackground(Color.white);
        this.history = history;
    }


    @Override
    public void draw(int x, int y) {
        Random random = new Random();
        Graphics g = getGraphics();
        g.setColor((random.nextBoolean())? Color.yellow : Color.MAGENTA);
        g.fillOval(x-radius,y-radius,radius*2,radius*2);
    }

    @Override
    public void paint(Graphics g) {
        System.out.println("执行一次刷新！"+System.currentTimeMillis());
        history.execute();
    }
}
