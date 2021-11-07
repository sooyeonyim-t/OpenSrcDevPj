package OpenDevPj_2021.Chap09.Prac;

import OpenDevPj_2021.Chap09.EX.GridLayoutEx_05;

import javax.swing.*;
import java.awt.*;

public class Prac09_02 extends JFrame {
    public Prac09_02() {
        setTitle("BorderLayout Practice");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c=getContentPane();
        c.setLayout(new BorderLayout(5,7));
        c.add(new JButton("North"),BorderLayout.NORTH);
        c.add(new JButton("West"),BorderLayout.WEST);
        c.add(new JButton("Center"),BorderLayout.CENTER);
        c.add(new JButton("East"),BorderLayout.EAST);
        c.add(new JButton("South"),BorderLayout.SOUTH);

        setSize(300,200);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Prac09_02();
    }
}
