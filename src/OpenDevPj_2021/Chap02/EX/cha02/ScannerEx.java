/**
 * 소스 파일 : ScannerEx
 * 학번/이름 : 2020039017 임수연
 * 소스 코드: 2장 예제 2-4, Scanner를 이용하여 이름, 도시, 나이, 체중, 독신 여부를 입력 받고 다시 출력하는 프로그램
 *
 */
package OpenDevPj_2021.EX.cha02;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        System.out.println("이름, 도시, 나이, 체중, 독시 여부를 빈칸으로 분리하여 입력하세요");
        Scanner scanner=new Scanner(System.in);

        String name=scanner.next(); //문자열읽기
        System.out.print("이름은 " + name+",");

        String city= scanner.next(); //문자열 읽기
        System.out.printf("도시는" + city +",");
        
        int age=scanner.nextInt(); //정수 읽기
        System.out.printf("나이는 "+age+"살, ");

        double weight= scanner.nextDouble();    //실수 읽기 
        System.out.printf("체중은 " +weight+"kg, ");
        
        boolean single= scanner.nextBoolean();  //논리값 읽기
        System.out.println("독신 여부는 "+single+ "입니다.");

        scanner.close();    //scanner 닫기
    }


}
