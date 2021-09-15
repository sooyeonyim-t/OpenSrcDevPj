package OpenDevPj_2021.EX.cha02;

/**
 * 소스파일 :Hello.java
 * 학번/이름 : 2020039017 임수연
 * 소스코드: 2장 예제 2-1, 자바 프로그램의 기본 구조
 */

public class Hello {
    //메소드
    public static int sum(int n, int m){
        return n+m;
    }
    //메소드
    //main() 메소드에서 실행 시작
    public static void main(String[] args) {
        int i=20;
        int s;
        char a;

        s=sum(i,10);    //sum() 메소드 호출
        a='?';
        System.out.println(a);  //문자'?'화면 출력
        System.out.println("Hello");    //"Hello"문자열 화면 출력
        System.out.println(s);  //정수 s값 화면 출력
    }
}
