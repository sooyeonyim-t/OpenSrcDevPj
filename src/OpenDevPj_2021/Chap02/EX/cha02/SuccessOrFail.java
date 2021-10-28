package OpenDevPj_2021.EX.cha02;
/**
 * 소스 파일 : ArithmeticOperator
 * 학번/이름 : 2020039017 임수연
 * 소스 코드: 2장 예제 2-10, if문 사용하기(시험점수가 80점 이상이면 합격 판별 하는 프로그램)
 *
 */
import java.util.Scanner;

public class SuccessOrFail {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.printf("점수를 입력하시오: ");
        int score= scanner.nextInt();
        if (score>=80)
            System.out.println("축하합니다! 합격입니다.");

        scanner.close();
    }
}
