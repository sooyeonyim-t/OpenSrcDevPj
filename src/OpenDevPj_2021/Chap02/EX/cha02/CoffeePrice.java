package OpenDevPj_2021.EX.cha02;
/**
 * 소스 파일 : ArithmeticOperator
 * 학번/이름 : 2020039017 임수연
 * 소스 코드: 2장 예제 2-15,switch문 활용(스위치문을 이용하여 커피메뉴의 가격을 알려주는 프로그램으로 에스프레소, 카푸치노, 카페라떼는 3500원이고, 아메리카노는 2000원이다.)
 *
 */
import java.util.Scanner;
public class CoffeePrice {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.printf("무슨 커피 드릴까요?");
        String order= scanner.next();
        int price=0;
        switch (order){
            case "에스프레소":
            case "카푸치노":
            case "카페라떼":
                price=3500;
                break;
            case "아메리카노":
                price=2000;
                break;
            default:
                System.out.println("메뉴에 없습니다!");


        }
        if (price!=0)
            System.out.printf(order+ "는 "+price+"원입니다.");
        scanner.close();
        
    }
}
