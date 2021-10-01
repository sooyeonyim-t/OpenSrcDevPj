package OpenDevPj_2021.Chap04.Prac;

import java.util.Scanner;

public class Grade_02 {
    private int math;
    private int science;
    private int english;

    public Grade_02(int m, int s, int e){
        math=m;
        science=s;
        english=e;

    }
    int average(){
        int sum=math+english+science;
        return sum/3;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("수학,과학, 영어 순으로 3개의 점수 입력>>");
        int math=scanner.nextInt();
        int science=scanner.nextInt();
        int english=scanner.nextInt();

        Grade_02 me=new Grade_02(math,science,english);

        System.out.println("평균은 "+me.average());

        scanner.close();


    }


}
