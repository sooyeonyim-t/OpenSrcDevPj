package OpenDevPj_2021.Chap04.Prac;
import java.util.Scanner;

class Circle {
    private double x,y;
    private int radius;
    public Circle(double x, double y, int radius){
        this.x=x;
        this.y=y;
        this.radius=radius;
    }
    public int getr(){
        return radius;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
}

public class CircleManager_06 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Circle c[]=new Circle[3];
        for(int i=0;i<c.length;i++) {
            System.out.print("x, y radius >>");
            double x=scanner.nextDouble();
            double y=scanner.nextDouble();
            int radius=scanner.nextInt();
            c[i]=new Circle(x,y,radius);
        }
        int max=c[1].getr();
        int num=0;
        for(int i=0;i<2;i++) {
            if(c[i].getr()<=c[i+1].getr()){
                max=c[i+1].getr();
            }
        }
        for(int i=0;i<c.length;i++){
            if(max==c[i].getr()){
                num=i;
                break;
            }
        }
        System.out.println("가장 면적이 큰 원은"+"("+c[num].getX()+","+c[num].getY()+")"+max);


        scanner.close();
    }

}
