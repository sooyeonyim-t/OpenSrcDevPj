package OpenDevPj_2021.Chap04.EX;   //예제[4-9]

import java.util.Scanner;

public class GarbageEx_09 {
    public static void main(String[] args) {
        String a=new String("Good");    //a,b,c에 각 할당
        String b=new String("Bad");
        String c=new String("Normal");
        String d,e;
        a=null; //good 객체 가비지 됨.
        d=c;
        c=null;

    }
}
