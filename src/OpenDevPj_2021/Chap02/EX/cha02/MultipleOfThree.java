package OpenDevPj_2021.EX.cha02;
import  java.util.Scanner;
/**
 * 소스 파일 : ArithmeticOperator
 * 학번/이름 : 2020039017 임수연
 * 소스 코드: 2장 예제 2-11, if-else 사용하기(입력된 수가 3의 배수인지 판별하는 프로그램)
 *
 */
public class MultipleOfThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("수를 입력하시오: ");
        int number=in.nextInt();

        if(number%3==0)
            System.out.println("3의 배수입니다.");
        else
            System.out.println("3의 배수가 아닙니다.");

        in.close();
    }
}
