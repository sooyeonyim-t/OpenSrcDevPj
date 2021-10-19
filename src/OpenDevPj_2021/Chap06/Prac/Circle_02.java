package OpenDevPj_2021.Chap06.Prac;

public class Circle_02 {
    int x; int y; int radius;

    Circle_02(int x, int y, int radius) {
        this.x=x;
        this.y=y;
        this.radius=radius;
    }
    public String toString(){
        return "Circle("+x+","+y+")반지름"+radius;
    }
    public boolean equals(Circle_02 c){
        if(x==c.x&&y==c.y){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Circle_02 a=new Circle_02(2,3,5);
        Circle_02 b=new Circle_02(2,3,30);
        System.out.println("원 a : " + a);
        System.out.println("원 b : " + b);
        if(a.equals(b)) {
            System.out.println("같은 원");
        }
        else {
            System.out.println("서로 다른 원");

        }
    }
}

