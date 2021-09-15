package OpenDevPj_2021.EX.cha02;
/**
 * 소스 파일 : ArithmeticOperator
 * 학번/이름 : 2020039017 임수연
 * 소스 코드: 2장 예제 2-7, 비교 연산자와 논리 연산자
 *
 */
public class LogicalOperator {
    public static void main(String[] args) {
        //비교연산
        System.out.println('a'>'b');
        System.out.println(3>=2);
        System.out.println(-1<0);
        System.out.println(3.45<=2);
        System.out.println(3==2);
        System.out.println(3!=2);
        System.out.println(!(3!=2));

        //비교 연산과 논리 연산 복합
        System.out.println((3>2)&&(3>4));
        System.out.println((3!=2)||(-1>0));

    }
}
