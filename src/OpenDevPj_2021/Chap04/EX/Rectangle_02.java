package OpenDevPj_2021.Chap04.EX;
import java.util.Scanner;
public class Rectangle_02 {
    int width;
    int height;

    public int getArea(){
        return width*height;
    }

    public static void main(String[] args) {
        Rectangle_02 rect=new Rectangle_02();
        Scanner scanner=new Scanner(System.in);
        System.out.print(">>");

        rect.width= scanner.nextInt();
        rect.height= scanner.nextInt();

        System.out.println("사각형의 면적은"+rect.getArea());

        scanner.close();

    }
}
