package OpenDevPj_2021.Chap04.EX;

public class Circle2_03 {
    int radius;
    String name;

    public Circle2_03(){
        radius=1;
        name="";
    }
    public Circle2_03(int r, String n){
        radius=r;
        name=n;
    }
    public double getArea(){
        return 3.14*radius*radius;
    }

    public static void main(String[] args) {
        Circle2_03 pizza=new Circle2_03(10,"자바피자");

        double area=pizza.getArea();
        System.out.println(pizza.name+"의 면적은"+area);

        Circle2_03 donut=new Circle2_03();
        donut.name="도넛피자";
        area=donut.getArea();
        System.out.println(donut.name+"의 면적은"+area);
    }
}
