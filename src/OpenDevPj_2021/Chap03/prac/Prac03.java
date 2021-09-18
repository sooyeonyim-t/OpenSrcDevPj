package OpenDevPj_2021.Chap03.prac;
/**
 * 문제: 3장 6번,배열과 반복문을 이용한 프로그램
 * 학번/이름 : 2020039017 임수연
 */
import java.util.Scanner;
public class Prac03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.printf("금액을 입력하시오>>");
        int money= scanner.nextInt();

        int[]unit={50000,10000,1000,500,100,10,1};  //환산할 돈의 종류

        for(int i=0;i<unit.length;i++){//돈 단위 종류 만큼 반복
            System.out.println(unit[i]+"원 짜리 : "+money/unit[i]+"개");    //몫 값으로 각 단위의 돈의 개수 계산
            money=money%unit[i];    //돈은 나머지 값으로 바꾸어서 남은 단위를 계산
        }
        scanner.close();
    }
}
