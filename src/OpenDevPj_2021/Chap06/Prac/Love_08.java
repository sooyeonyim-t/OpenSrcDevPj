package OpenDevPj_2021.Chap06.Prac;

import java.util.Scanner;

public class Love_08 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("문자열을 입력하세요. 빈칸이나 있어도 되고 영어 한글 모두 됩니다.");
        String s=scanner.nextLine();
        for(int i=1;i<s.length();i++){
            System.out.println(s.substring(i)+s.substring(0,i));
        }
        System.out.println(s);
    }
}
