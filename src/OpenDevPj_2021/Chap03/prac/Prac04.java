package OpenDevPj_2021.Chap03.prac;
/**
 * 문제: 3장 8번, 배열과 반복문, 랜덤 및 중복, 범위 조건 연습하는 프로그램
 * 학번/이름 : 2020039017 임수연
 */
import java.util.Scanner;
public class Prac04 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int[] intArray;


        while (true){
            System.out.print("정수 몇개?");
            int num= scanner.nextInt();

            if(num<100&&num>0){
                intArray=new int[num];  //1~100 사이로 입력받은 개수만큼 배열 생성
                int Arr[]=new int[num];
                break;
            }
            else
                System.out.print("1~100범위로 다시 입력하세요.");
        }

        int Arr[]=new int[intArray.length];

        for(int a=0;a<intArray.length;a++){
            Arr[a] =(int) (Math.random()*100+1);  //1~100가지 범위의 점수를 램덤하게 생성

            for(int b=0;b<a;b++){   //중복 검사해서 중복되면 다시 램던값 생성해서 저장
                if(Arr[a]==Arr[b]){
                    a--;
                }
            }
        }
        for(int a=0;a<intArray.length;a++) {//10개씩 출력
            System.out.print(Arr[a] + " ");
            if ((a + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }
}
