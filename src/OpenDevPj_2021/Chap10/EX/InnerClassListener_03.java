package OpenDevPj_2021.Chap10.EX;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerClassListener_03 extends JFrame {
    InnerClassListener_03(){
        setTitle("Action 이벤트 리스터 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c=getContentPane();
        c.setLayout(new FlowLayout());
        JButton btn=new JButton("Action");
        btn.addActionListener(new IndepClassListener_01.MyActionListener());
        c.add(btn);

        setSize(350,150);
        setVisible(true);
    }

    private class MyActionListener implements ActionListener{

        public void actionPerformed(ActionEvent e){
            JButton b=(JButton) e.getSource();
            if(b.getText().equals("Aciton")){
                b.setText("액션");
            }
            else{
                b.setText("Action");
            }
            InnerClassListener_03.this.setTitle(b.getText());
        }


    }

    public static void main(String[] args) {
        new InnerClassListener_03();
    }
}
