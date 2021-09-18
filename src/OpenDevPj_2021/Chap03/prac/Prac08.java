package OpenDevPj_2021.Chap03.prac;
/**
 * 문제: 3장 16번, 컴퓨터와 사용자 사이의 가위 바위 보 게임 프로그램 
 * 학번/이름 : 2020039017 임수연
 */
import java.util.Scanner;
public class Prac08 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
        String str[]={"가위","바위","보"};

        while(true) {
            System.out.print("가위 바위 보!>>");
            String input = scanner.next();
            int n=(int) (Math.random()*3);  //n은 0,1,2 중에서 랜덤하게 결정

            if(str[n].equals("바위")){
                switch (input){
                    case "가위":
                        System.out.println("사용자 = "+input+", 컴퓨터 = "+str[n]+", 사용자가 졌습니다.");
                        break;
                    case "바위":
                        System.out.println("사용자 = "+input+", 컴퓨터 = "+str[n]+", 비겼습니다.");
                        break;
                    case "보":
                        System.out.println("사용자 = "+input+", 컴퓨터 = "+str[n]+", 사용자가 이겼습니다.");
                        break;
                    case "그만":
                        break;

                }

            }
            else if(str[n].equals("가위")){
                switch (input) {
                    case "보":
                        System.out.println("사용자 = " + input + ", 컴퓨터 = " + str[n] + ", 사용자가 졌습니다.");
                        break;
                    case "가위":
                        System.out.println("사용자 = " + input + ", 컴퓨터 = " + str[n] + ", 비겼습니다.");
                        break;
                    case "바위":
                        System.out.println("사용자 = " + input + ", 컴퓨터 = " + str[n] + ", 사용자가 이겼습니다.");
                        break;
                    case "그만":
                        break;
                }
            }
            else if(str[n].equals("보")){
                switch (input) {
                    case "바위":
                        System.out.println("사용자 = " + input + ", 컴퓨터 = " + str[n] + ", 사용자가 졌습니다.");
                        break;
                    case "보":
                        System.out.println("사용자 = " + input + ", 컴퓨터 = " + str[n] + ", 비겼습니다.");
                        break;
                    case "가위":
                        System.out.println("사용자 = " + input + ", 컴퓨터 = " + str[n] + ", 사용자가 이겼습니다.");
                        break;
                    case "그만":
                        break;
                }
            }

        }
    }

}
