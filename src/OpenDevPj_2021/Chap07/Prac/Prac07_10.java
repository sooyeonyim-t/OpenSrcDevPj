package OpenDevPj_2021.Chap07.Prac;
import java.util.*;

abstract class Shape{
    public Shape() {
    }
    public abstract void draw();
}

class Line extends Shape{
    public Line() {
        super();
    }
    public void draw() {
        System.out.println("Line");
    }
}

class Rect extends Shape{
    public Rect() {
        super();
    }

    public void draw() {
        System.out.println("Rect");
    }
}

class Circle extends Shape{
    public Circle() {
        super();
    }

    public void draw() {
        System.out.println("Circle");
    }
}

class GraphicEditor{
    private Shape head,tail;
    private Scanner scanner;
    Vector<Shape> vector;

    public GraphicEditor(){
        vector=new Vector<Shape>();
        head=null;
        tail=null;
        scanner=new Scanner(System.in);
    }

    void runEditor() {
        int choice;
        System.out.println("그래픽 에디터 beauty을 실행합니다.");

        do {
            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
            choice=scanner.nextInt();
            switch(choice) {
                case 1:
                    System.out.print("Line(1), Rect(2), Circle(3)>>");
                    int option=scanner.nextInt();
                    put(option);
                    break;
                case 2:
                    System.out.print("삭제할 도형의 위치>>");
                    int index=scanner.nextInt();
                    delete(index);
                    break;
                case 3:
                    print();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("다시 입력해주세요");
                    break;
            }
        }while(choice!=4);
        System.out.println("beauty을 종료합니다.");
    }

    void put(int num) {
        Shape s;
        switch(num) {
            case 1:
                s=new Line();
                break;
            case 2:
                s=new Rect();
                break;
            case 3:
                s=new Circle();
                break;
            default:
                System.out.println("다시입력해주세요");
                return;
        }
        vector.add(s);
        return;
    }
    void delete(int index) {
        if(index>vector.size()) {
            System.out.println("삭제할 수 없습니다.");
            return;
        }
        vector.remove(index);
    }

    void print() {
        for(int i=0;i<vector.size();i++) {
            vector.get(i).draw();
        }
    }
}
public class Prac07_10 {
    public static void main(String[] args) {
        GraphicEditor g=new GraphicEditor();
        g.runEditor();
    }
}
