package OpenDevPj_2021.Chap05.Prac;

import OpenDevPj_2021.EX.cha02.CircleArea;
import java.util.Scanner;

interface Shape1 {
    final double PI = 3.14;

    void draw();

    double getArea();

    default public void redraw() {
        System.out.print("---다시 그립니다.");
        draw();
    }

}
class Circle implements Shape1{
    private int r;
    private double area;

    Circle(int r){
        this.r=r;
        area=this.r*this.r*PI;
    }
    public void draw(){
        System.out.println("반지름이 "+r+"인 원입니다.");

    }
    public double getArea(){
        return area;
    }

}
class Oval implements Shape1{
    private int r1;
    private int r2;
    private double area;

    Oval(int r1, int r2){
        this.r1=r1;
        this.r2=r2;
        area=r1*r2*PI;
    }
    public void draw(){
        System.out.println(r1+"x"+r2+"에 내접하는 타원입니다.");

    }
    public double getArea(){
        return area;
    }

}

class Rect implements Shape1{
    private int w;
    private int h;
    private double area;

    Rect(int w, int h){
        this.w=w;
        this.h=h;
        area=this.w*this.h;
    }

    public void draw()
    {
        System.out.println(w+"x"+h+"크기의 사각형 입니다.");
    }

    public double getArea(){
        return area;
    }

}


public class ShapeInterFace_14 {
    public static void main(String[] args) {
        Shape1 [] list=new Shape1[3];
        list[0]=new Circle(10);
        list[1]=new Oval(20,30);
        list[2]=new Rect(10,40);

        for(int i=0;i<list.length;i++){
            list[i].redraw();
        }
        for(int i=0;i<list.length;i++){
            System.out.println("면적은 "+list[i].getArea());
        }

    }
}

