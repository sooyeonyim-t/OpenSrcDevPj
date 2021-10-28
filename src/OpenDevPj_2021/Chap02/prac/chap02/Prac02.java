package OpenDevPj_2021.prac.chap02;

import java.util.Scanner;
public class Prac02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 3개 입력>>");
        int data[]=new int[3];
        data[0] =scanner.nextInt();
        data[1]= scanner.nextInt();
        data[2]=scanner.nextInt();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2 - i; j++) {
                if (data[j] > data[j + 1]) {	// 버블 정렬 사용
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }

        System.out.println("중간 값은" +data[1]);

        scanner.close();

    }

}
