package OpenDevPj_2021.Chap04.EX;   //예제[4-10]

class Sample{
    public int a;
    private  int b;
    int c;
}
public class AccessEx_10 {
    public static void main(String[] args) {
        Sample aClass=new Sample();
        aClass.a=10;
        //aClass.b=10;    //private으로 선언 본 클래스에서 접근 불가능
        aClass.c=10;

    }
}
