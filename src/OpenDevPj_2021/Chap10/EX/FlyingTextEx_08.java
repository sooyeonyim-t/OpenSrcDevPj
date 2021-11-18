package OpenDevPj_2021.Chap10.EX;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FlyingTextEx_08 extends JFrame {
    private final int FLYING_UNIT=10;
    private JLabel la=new JLabel("HELLO");
    public FlyingTextEx_08(){
        setTitle("상,하,좌,우 키를 이용하여 텍스트 움직이기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c=getContentPane();
        c.setLayout(null);
        c.addKeyListener(new MyKeyListener_08());

        la.setLocation(50,20);
        la.setSize(100,20);
        c.add(la);
        setSize(300,300);
        setVisible(true);
        c.setFocusable(true);
        c.requestFocus();

        c.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Component com=(Component) e.getSource();
                com.setFocusable(true);
                com.requestFocus();

            }
        });

    }
    class MyKeyListener_08 extends KeyAdapter{
        public void keyPressed(KeyEvent e){
            int keyCode = e.getKeyCode();
            switch(keyCode) {
                case KeyEvent.VK_UP:
                    la.setLocation(la.getX(), la.getY() - FLYING_UNIT);
                    break;
                case KeyEvent.VK_DOWN:
                    la.setLocation(la.getX(), la.getY() + FLYING_UNIT);
                    break;
                case KeyEvent.VK_LEFT:
                    la.setLocation(la.getX() - FLYING_UNIT, la.getY());
                    break;
                case KeyEvent.VK_RIGHT:
                    la.setLocation(la.getX() + FLYING_UNIT, la.getY());
                    break;
            }
        }
    }

    public static void main(String [] args) {
        new FlyingTextEx_08();
    }
}
