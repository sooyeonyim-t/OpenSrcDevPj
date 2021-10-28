package OpenDevPj_2021.prac.chap02;
import java.util.Scanner;

public class Prac01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("2자리 수(10~99) 정수를 입력하세요 >>");
        int num=in.nextInt();
        int a,b;
        a=num/10;
        b=num%10;
        if(a==b) {
            System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
        }
        else {
            System.out.println("No! 10의 자리와 1의 자리가 같지 않습니다.");
        }
        in.close();
    }

}