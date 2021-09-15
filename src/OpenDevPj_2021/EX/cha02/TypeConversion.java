package OpenDevPj_2021.EX.cha02;
/**
 * 소스 파일 : TypeConversion
 * 학번/이름 : 2020039017 임수연
 * 소스 코드: 2장 예제 2-3, 타입 변환 -자동 타입 변환과 강제 타입 변환
 *
 */

public class TypeConversion {
    public static void main(String[] args) {
        byte b=127;
        int i =100;

        System.out.println(b+i);
        System.out.println(10/4);
        System.out.println(10.0/4);
        System.out.println((char)0x12340041);   //강제 타입 변환 결과 0x41이 되며, 문자 A의 코드
        System.out.println((byte)(b+i));    //byte, 8비트, 257(0,128개의 음수 127개의 양수로 -127~128)
        System.out.println((int)2.9+1.8);
        System.out.println((int)(2.9+1.8));
        System.out.println((int)2.9+(int)1.8);
    }
}
