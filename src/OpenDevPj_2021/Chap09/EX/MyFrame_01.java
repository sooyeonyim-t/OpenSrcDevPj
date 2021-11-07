package OpenDevPj_2021.Chap09.EX;

import javax.swing.*;
public class MyFrame_01 extends JFrame {
    public MyFrame_01() {
        setTitle("300x300 스윙 프레임 만들기");
        setSize(300,300);
        setVisible(true);
    }
    public static void main(String[] args) {
        MyFrame_01 frame = new MyFrame_01();
    }
}
