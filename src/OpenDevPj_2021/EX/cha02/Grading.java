package OpenDevPj_2021.EX.cha02;
/**
 * 소스 파일 : ArithmeticOperator
 * 학번/이름 : 2020039017 임수연
 * 소스 코드: 2장 예제 2-12,다중 if-else로 학점 매기기
 *
 */
import java.util.Scanner;
public class Grading {
    public static void main(String[] args) {
        char grade;
        Scanner scanner=new Scanner(System.in);

        System.out.printf("점수를 입력하세요(0~100): ");
        int score= scanner.nextInt();   //점수 읽기
        if (score>=90)  //score가 90 이상
            grade='A';
        else  if (score>=80)    //score가 80이상 90미만
            grade='B';
        else  if (score>=70)    //score가 70이상 80미만
            grade='C';
        else  if (score>=60)    //score가 60이상 70미만
            grade='D';
        else      //score가 60미만
            grade='F';
        System.out.println("학점은 "+grade+"입니다.");

        scanner.close();
    }
}
