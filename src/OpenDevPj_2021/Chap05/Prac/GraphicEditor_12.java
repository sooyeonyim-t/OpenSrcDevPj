//package OpenDevPj_2021.Chap05.Prac;
//import java.util.Scanner;
//
//abstract class Shape{
//    private Shape next;
//    public Shape(){
//        next=null;
//    }
//
//    public void setNext(Shape obj) {
//        next = obj;
//    }
//    public Shape getNext(){
//        return next;
//    }
//    public abstract void draw();
//}
//class Line extends Shape{
//    public void draw(){
//        System.out.println("Line");
//    }
//}
//class Rect extends Shape{
//    public void draw(){
//        System.out.println("Rect");
//    }
//}
//class Circle extends Shape{
//    public void draw(){
//        System.out.println("Circle");
//    }
//}
//
//public class GraphicEditor_12 {
//    static int counter=0;
//    Shape start,last,obj,next_obj;
//
//    void insert(){
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Line(1), Rect(2),Circle(3)>>");
//        int menu=sc.nextInt();
//
//        if(counter==0){
//            if(menu==1){
//                start=new Line();
//            }
//            else if(menu==2){
//                start=new Rect();
//            }
//            else{
//                start=new Circle();
//            }
//            last=start;
//        }
//        else{
//            if(menu==1){
//                obj=new Line();
//            }
//            else if(menu==2){
//                obj=new Rect();
//            }
//            else{
//                obj=new Circle();
//            }
//            last.setNext(obj);
//            last=obj;
//        }
//        counter++;
//    }
//
//    void delete() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("삭제할 도형의 위치>>");
//        int num = sc.nextInt();
//
//        if (num > counter) {
//            System.out.println("삭제할 수 없습니다.");
//        } else {
//            if (num == 1) {
//                if (last == start) {
//                    last = null;
//                    start = null;
//                } else {
//                    start = start.getNext();
//                }
//            } else if (num == counter) {
//                obj = start;
//                next_obj = obj.getNext();
//                for (int i = 2; i < num; i++) {
//                    obj = next_obj;
//                    next_obj = next_obj.getNext();
//                }
//                obj.setNext(null);
//            } else {
//                obj = start;
//                next_obj = obj.getNext();
//                for (int j = 2; j < num; j++) {
//                    obj = next_obj;
//                    next_obj = next_obj.getNext();
//                }
//                obj.setNext(next_obj.getNext());
//            }
//            counter--;
//        }
//    }
//
//        void printAll(){
//            if(counter==0){
//                System.out.println("대상이 존재하지 않습니다.");
//
//            }
//            else if(counter==1){
//                start.draw();
//            }
//            else{
//                start.draw();
//                obj=start.getNext();
//                for(int i=2;i<counter;i++)
//                {
//                    obj.draw();
//                    obj=obj.getNext();
//                }
//                obj.draw();
//            }
//        }
//
//
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int menunum=0;
//
//        System.out.println("그래픽 에디터 beauty을 실행합니다.");
//        GraphicEditor_12 g=new GraphicEditor_12();
//
//        while(true){
//            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
//            menunum=sc.nextInt();
//
//            if(menunum==1){
//                g.insert();
//
//            }
//            else if(menunum==2){
//                g.delete();
//
//            }
//            else if(menunum==3){
//                g.printAll();
//
//            }
//            else if(menunum==4){
//                System.out.println("beauty을 종료합니다.");
//                break;
//            }
//
//
//        }
//    }
//}
//
