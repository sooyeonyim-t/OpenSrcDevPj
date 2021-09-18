package OpenDevPj_2021.Chap03.prac;
/**
 * 문제: 3장 12번, main()의 매개변수 처리와 NumberFormatException
 * 학번/이름 : 2020039017 임수연
 */
import java.util.Scanner;
public class Prac06 {
    public static void main(String[] args) {
        double sum=0.0;

        for(int i=0;i<args.length;i++){// 인자의 개수만큼 반복
            try{
                sum=sum+Double.parseDouble(args[i]);    //문자열을 실수로 변환해 총합 구한다.
            }
            catch(NumberFormatException e){

            }
        }
        System.out.println(sum);
    }
}
