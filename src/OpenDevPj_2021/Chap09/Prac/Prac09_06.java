package OpenDevPj_2021.Chap09.Prac;

import javax.swing.*;
import java.awt.*;

public class Prac09_06 extends JFrame {
    public Prac09_06() {
        setTitle("Random Labels");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c=getContentPane();

        c.setLayout(null);

        for(int i=0;i<20;i++) {
            int x=(int )(Math.random()*200)+50;
            int y=(int )(Math.random()*200)+50;
            JLabel l=new JLabel(" ");
            l.setBounds(x,y,10,10);
            l.setOpaque(true);
            l.setBackground(Color.blue);
            c.add(l);
        }

        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Prac09_06();
    }
}
