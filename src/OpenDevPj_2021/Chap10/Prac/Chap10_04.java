package OpenDevPj_2021.Chap10.Prac;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Chap10_04 extends JFrame {
    private JLabel la=new JLabel("Love Java");
    public Chap10_04(){
        setTitle("Left 키로 문자열 이동");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c=getContentPane();
        c.setLayout(new FlowLayout());

        c.add(la);
        c.setFocusable(true);
        c.requestFocus();
        c.addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent e){
                if(e.getKeyCode()==KeyEvent.VK_LEFT){
                    String text=la.getText();
                    la.setText(text.substring(1)+text.charAt(0));
                }
            }
        });

        setSize(350,350);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Chap10_04();
    }
}
