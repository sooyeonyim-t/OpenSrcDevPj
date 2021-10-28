package OpenDevPj_2021.EX.cha02;
/**
 * 소스파일 : CircleArea
 * 학번/이름 : 2020039017 임수연
 * 소스코드: 2장 예제 2-2
 * 변수, 리터럴, 상수 활용
 * 원의 면적을 구하는 프로그램을 작성
 */

public class CircleArea {
    public static void main(String[] args) {
        final  double PI=3.14;  //원주율을 상수로 선언

        double radius =10.0;    //원의 반지름
        double circleArea=radius*radius*PI; //원의 면적 계산

        //원의 면적을 화면에 출력한다.
        System.out.println("원의 면적 = "+circleArea);
    }
}


