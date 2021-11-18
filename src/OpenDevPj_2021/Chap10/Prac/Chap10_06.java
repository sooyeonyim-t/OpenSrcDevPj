package OpenDevPj_2021.Chap10.Prac;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Chap10_06 extends JFrame {
    private JLabel la=new JLabel("c");

    public Chap10_06(){
        setTitle("클릭 연습 용 응용프로그램");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c=getContentPane();
        c.setLayout(null);

        la.setBounds(100,100,10,10);
        la.addMouseListener(new MyMouseAdapter());
        c.add(la);

        setSize(300,300);
        setVisible(true);
    }

    class MyMouseAdapter extends MouseAdapter{
        public void mouseClicked(MouseEvent e){
            if(e.getClickCount()==1){
                int x=(int)(Math.random()*300);
                int y=(int)(Math.random()*300);
                la.setLocation(x,y);
            }

        }
    }
    public static void main(String[] args) {
        new Chap10_06();
    }
}
