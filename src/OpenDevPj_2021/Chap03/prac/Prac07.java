package OpenDevPj_2021.Chap03.prac;
/**
 * 문제: 3장 14번, 과목이름을 입력받아 점수를 출력하는 프로그램
 * 학번/이름 : 2020039017 임수연
 */
import java.util.Scanner;
public class Prac07 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String course[]={"Java", "C++","HTML5","컴퓨터구조","안드로이드"};    
        int score []={95,88,76,62,55};

        while(true){
            System.out.print("과목 이름>>");
            String Sub= scanner.next();
            if(Sub.equals("그만")){//그만 입력하면 프로그램 종료
                break;
            }
            for(int i=0; i<5;i++) {
                if (Sub.equals(course[i])){//코스 이름 같으면 점수 출력
                    System.out.println(course[i]+"의 점수는 "+score[i]);
                    break;
                }
                else if(i==4)//코스이름 같은거 없으면 없는 과목이라고 출력
                    System.out.println("없는 과목입니다.");

            }

        }
    }
}
