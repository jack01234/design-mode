package com.wmli.system.api.command;

import java.util.Iterator;
import java.util.Stack;

/**
 * @author yingmuhuadao
 * @version 1.0.0
 * @date 2020/1/16 13:48
 */
public class MacroCommand implements Command{

    Stack commands = new Stack();

    @Override
    public void execute() {
        Iterator it = commands.iterator();
        if (it.hasNext()) {
            Command command= (Command) it.next();
            command.execute();
        }
    }

    public void append(Command command){
        if (command!=this) {
            commands.add(command);
        }
    }

    public void clear(){
        commands.clear();
    }

    public void undo(){
        if (!commands.isEmpty()) {
            commands.pop();
        }
    }
}
