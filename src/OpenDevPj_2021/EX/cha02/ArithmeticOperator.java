package OpenDevPj_2021.EX.cha02;
/**
 * 소스 파일 : ArithmeticOperator
 * 학번/이름 : 2020039017 임수연
 * 소스 코드: 2장 예제 2-5, /와 % 산술연산
 *
 */
import java.util.Scanner;
public class ArithmeticOperator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int time = scanner.nextInt();   //정수 입력
        int second=time%60;     //60으로 나눈 나머지는 초
        int minute=(time/60)%60;    //60으로 나눈 몫을 다시 60으로 나눈 나머지는 분
        int hour=(time/60)/60;  //60으로 나눈 몱을 다시 60으로 나눈 몫은 시간

        System.out.printf(time +"초는 ");
        System.out.printf(hour +"시간, ");
        System.out.printf(minute +"분, " );
        System.out.println(second+"초입니다.");

        scanner.close();

    }
}
