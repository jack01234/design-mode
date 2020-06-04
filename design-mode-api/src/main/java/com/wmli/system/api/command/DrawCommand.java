package com.wmli.system.api.command;

import java.awt.*;

/**
 * @author yingmuhuadao
 * @version 1.0.0
 * @date 2020/1/16 14:44
 */
public class DrawCommand implements Command {
    private Drawable drawable;
    private Point position;

    public DrawCommand(Drawable drawable, Point position){
        this.drawable = drawable;
        this.position = position;
    }

    @Override
    public void execute() {
        drawable.draw(position.x,position.y);
    }
}
