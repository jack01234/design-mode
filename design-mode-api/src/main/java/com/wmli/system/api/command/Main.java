package com.wmli.system.api.command;

import javax.swing.*;
import java.awt.event.*;

/**
 * @author yingmuhuadao
 * @version 1.0.0
 * @date 2020/1/16 14:03
 */
public class Main extends JFrame implements ActionListener, MouseListener, WindowListener {

    private MacroCommand history = new MacroCommand();

    private JButton btnClear = new JButton("清除");
    private JButton btnRePaint = new JButton("重现");

    private DrawCanvas canvas = new DrawCanvas(400,400,history);

    public static void main(String[] args) {
        new Main("命令模式");
    }

    public Main(String title){
        super(title);
        this.addWindowListener(this);
        canvas.addMouseListener(this);
        btnClear.addActionListener(this);
        btnRePaint.addActionListener(this);

        Box btnBox = new Box(BoxLayout.X_AXIS);
        btnBox.add(btnClear);
        btnBox.add(btnRePaint);

        Box mainBox = new Box(BoxLayout.Y_AXIS);
        mainBox.add(btnBox);
        mainBox.add(canvas);

        getContentPane().add(mainBox);

        pack();
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnClear) {
            history.clear();
            canvas.repaint();
        } else if (e.getSource()==btnRePaint) {
            canvas.repaint();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Command command = new DrawCommand(canvas,e.getPoint());
        history.append(command);
        command.execute();
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

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
