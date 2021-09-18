package OpenDevPj_2021.Chap03.prac;
/**
 * 문제: 3장 4번, 2중 중첩 반복문 이용해 알파벳 입력받아 규칙대로 출력
 * 학번/이름 : 2020039017 임수연
 */
import java.util.Scanner;
public class Prac02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("소문자 알파벳 하나를 입력하시오>>");
        String s= scanner.next();   //문자열 읽기
        char c=s.charAt(0); //문자열 첫번째 문자

        for(char a=c;a>='a';a--){//입력된 값에서 각 줄마다 감소하면서 a까지 출력
            for(char b='a';b<=a;b++){//a의 범위까지 알파벳 출력
                System.out.print(b);
            }
            System.out.println();
        }
        scanner.close();
    }
}
