package OpenDevPj_2021.Chap07.Prac;
import java.util.Scanner;
import java.util.Vector;

public class Prac07_04 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Vector<Integer> vector=new Vector<Integer>();

        while(true) {
            System.out.print("강수량 입력 (0 입력시 종료)>> ");
            int n=scanner.nextInt();
            if(n==0) {
                break;
            }
            vector.add(n);
            int sum=0;
            for(int i=0;i<vector.size();i++) {
                int data=vector.get(i);
                System.out.print(data+" ");
                sum+=data;
            }
            System.out.println();
            System.out.println("현재 평균 "+sum/vector.size());
        }
    }
}
