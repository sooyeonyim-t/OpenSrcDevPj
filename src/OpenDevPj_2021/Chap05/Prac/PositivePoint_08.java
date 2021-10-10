package OpenDevPj_2021.Chap05.Prac;
class Point1{
    private int x,y;
    public Point1(int x, int y){
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



public class PositivePoint_08 extends Point1{
    PositivePoint_08(){
        super(0,0);
    }
    PositivePoint_08(int x, int y){
        super(0,0);
        move(x,y);
    }
    public String toString(){
        int x=getX();
        int y=getY();
        String s="("+x+","+y+")의 점";
        return s;
    }

    @Override
    protected void move(int x, int y){
        if(x>0&&y>0){
            super.move(x,y);
        }
    }

    public static void main(String[] args) {
        PositivePoint_08 p=new PositivePoint_08();
        p.move(10,10);
        System.out.println(p.toString()+"입니다.");

        p.move(-5,5);
        System.out.println(p.toString()+"입니다.");

        PositivePoint_08 p2=new PositivePoint_08(10,-10);
        System.out.println(p2.toString()+"입니다.");
    }
}
