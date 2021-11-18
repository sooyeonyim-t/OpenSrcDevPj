package OpenDevPj_2021.Chap10.Prac;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Chap10_02 extends JFrame {
    public Chap10_02(){
        setTitle("드래깅동안 YELLOW...");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c=getContentPane();
        c.setLayout(new FlowLayout());
        c.setBackground(Color.GREEN);

        c.addMouseListener(new MyMouseListener());
        c.addMouseMotionListener(new MyMotionListener());
        setSize(250,250);
        setVisible(true);
    }
    class MyMotionListener extends MouseMotionAdapter {
        public void mouseDragged(MouseEvent e){
            Component c=(Component) e.getSource();
            c.setBackground(Color.yellow);
        }
    }

    public class MyMouseListener extends MouseAdapter{
        public void mouseRelease(MouseEvent e){
            Component c=(Component) e.getSource();
            c.setBackground(Color.GREEN);
        }
    }

    public static void main(String[] args) {
        new Chap10_02();
    }
}