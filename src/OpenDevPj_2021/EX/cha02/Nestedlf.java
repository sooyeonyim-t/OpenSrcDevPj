package OpenDevPj_2021.EX.cha02;
/**
 * 소스 파일 : ArithmeticOperator
 * 학번/이름 : 2020039017 임수연
 * 소스 코드: 2장 예제 2-13,중첩 if-else문(점수와 학년을 입력 받아 60점 이상이면 합격, 미만이면 불합격을 출력하고 4학년의 경우 70점 이상일 경우 합격 출력하는 프로그램)
 *
 */
import java.util.Scanner;
public class Nestedlf {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.printf("점수를 입력하세요(0~100): ");
        int score= scanner.nextInt();

        System.out.printf("학년을 입력하세요(1~4): ");
        int year= scanner.nextInt();

        if (score>=60) {//60점 이상
            if (year!=4)
                System.out.println("합격!");  //4학년 아니면 합격
            else if (score>=70)
                System.out.println("합격!");  //4학년이 70점 이상이면 합격
            else
                System.out.println("불합격!"); //4학년이 70점 미만이면 불합격

        }
        else //60점 미만 불합격
            System.out.println("불합격!");


        scanner.close();
    }
}
