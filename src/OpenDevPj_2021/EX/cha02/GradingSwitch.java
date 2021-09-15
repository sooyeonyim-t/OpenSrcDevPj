package OpenDevPj_2021.EX.cha02;
/**
 * 소스 파일 : ArithmeticOperator
 * 학번/이름 : 2020039017 임수연
 * 소스 코드: 2장 예제 2-13,switch문으로 학점 매기는 프로그램
 *
 */
import java.util.Scanner;
public class GradingSwitch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        char grade;
        System.out.printf("점수를 입력하세요(0~100): ");
        int score= scanner.nextInt();
        switch (score/10){
            case 10:    //score=100
            case 9: //score는 90~99
                grade='A';
                break;
            case 8: //score는 80~89
                grade='B';
                break;
            case 7: //score는 70~79
                grade='C';
                break;
            case 6: //score는 60~69
                grade='D';
                break;
            default://score는 59이하
                grade='F';

        }
        System.out.println("학점은 "+grade+"입니다");
        scanner.close();



    }
}
