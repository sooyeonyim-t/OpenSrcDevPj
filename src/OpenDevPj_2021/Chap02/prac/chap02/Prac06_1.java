package OpenDevPj_2021.prac.chap02;
import java.util.Scanner;
public class Prac06_1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("연산>>");
        double a= scanner.nextDouble();
        String Op= scanner.next();
        double b= scanner.nextDouble();
        double result;
        if(Op.equals("+")){
            result=a+b;
            System.out.println("a+b의 계산 결과는"+ result);
        }
        else if(Op.equals("-")){
            result=a-b;
            System.out.println("a-b의 계산 결과는"+ result);
        }
        else if(Op.equals("*")){
            result=a*b;
            System.out.println("a*b의 계산 결과는"+ result);
        }
        else if(Op.equals("/")){
            result=a/b;
            if(b==0)
                System.out.println("0으로 나눌 수 없습니다.");
            else
                System.out.println("a/b의 계산 결과는" + result);
        }

        scanner.close();
    }
}
