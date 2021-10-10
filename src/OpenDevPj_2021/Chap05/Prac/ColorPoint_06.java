package OpenDevPj_2021.Chap05.Prac;
class Point{
    private int x,y;
    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    protected void move(int x,int y){
        this.x=x;
        this.y=y;
    }
}
public class ColorPoint_06 extends Point {
    private String Color;

    ColorPoint_06(){
        super(0,0);
        this.Color="BLACK";
    }
    ColorPoint_06(int x,int y){
        super(10,10);
        this.Color="BLACK";
    }
    void setXnY(int x, int y){
        move(x,y);
    }
    public String toString(){
        return (Color+"색의 ("+getX()+","+getY()+")의 점");

    }
    void setColor(String Color){
        this.Color=Color;
    }

    public static void main(String[] args) {
        ColorPoint_06 zeroPoint=new ColorPoint_06();
        System.out.println(zeroPoint.toString()+"입니다.");

        ColorPoint_06 cp=new ColorPoint_06(10,10);
        cp.setXnY(5,5);
        cp.setColor("RED");
        System.out.println(cp.toString()+"입니다.");
    }
}
