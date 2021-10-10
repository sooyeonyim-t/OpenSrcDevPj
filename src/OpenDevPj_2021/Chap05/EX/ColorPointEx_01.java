package OpenDevPj_2021.Chap05.EX;
class Point{
    private int x,y;
    public void set(int x, int y){
        this.x=x;
        this.y=y;
    }
    public void showPoint(){
        System.out.println("(" +x+","+y+")");
    }
}

class ColorPoint1 extends Point{
    private String color;   //점의 색
    public void setColor(String color){
        this.color=color;
    }
    public void showColorPoint1(){
        System.out.print(color);
        showPoint();
    }
}
public class ColorPointEx_01 {
    public static void main(String[] args) {
        Point p=new Point();
        p.set(1,2);
        p.showPoint();

        ColorPoint1 cp=new ColorPoint1();
        cp.set(3,4);
        cp.setColor("red");
        cp.showColorPoint1();
    }
}
