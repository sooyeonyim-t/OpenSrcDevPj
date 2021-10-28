package OpenDevPj_2021.Chap07.Prac;
import java.util.ArrayList;
import java.util.Scanner;
public class Prac07_02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Character> arr=new ArrayList<Character>();
        System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>> ");

        for(int i=0;i<6;i++) {
            char c=scanner.next().charAt(0);
            arr.add(c);
        }

        double sum=0;
        for(int i=0;i<6;i++) {
            switch(arr.get(i)) {
                case 'A':
                    sum+=4.0;
                    break;
                case 'B':
                    sum+=3.0;
                    break;
                case 'C':
                    sum+=2.0;
                    break;
                case 'D':
                    sum+=1.0;
                    break;
                case 'F':
                    sum+=0;
                    break;
            }
        }
        System.out.println(sum/6);
    }
}
