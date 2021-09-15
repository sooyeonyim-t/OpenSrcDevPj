package OpenDevPj_2021.prac.chap02;
import java.util.Scanner;
public class Prac03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.printf("1~99 사이의 정수를 입력하시오>>");
        int num= scanner.nextInt();
        int ten=num/10;
        int one=num%10;
        
        if(ten==3|ten==6|ten==9){
            if(one==3|one==6|one==9)
                System.out.printf("박수짝짝");
            else
                System.out.printf("박수짝");
        }
        else if (one==3|one==6|one==9)
            System.out.printf("박수짝");
            
        scanner.close();
    }
}
