package OpenDevPj_2021.Chap05.Prac;
import java.util.Scanner;
abstract class Converter{
    abstract protected double convert(double src);
    abstract protected String getSrcString();
    abstract protected String getDestString();
    protected double ratio;

    public void run(){
        Scanner scanner=new Scanner(System.in);
        System.out.println(getSrcString()+"을"+getDestString()+"로 바꿉니다.");
        System.out.print(getSrcString()+"을 입력하세요>> ");
        double val=scanner.nextDouble();
        double res=convert(val);
        System.out.println("변환결과: "+res+getDestString()+"입니다.");
        scanner.close();

    }
}
public class Km2Mile_04 extends Converter{
    @Override
    public  double convert(double src){
        return  src/ratio;

    }
    @Override
    public String getSrcString(){
        return "Km";
    }
    @Override
    public String getDestString(){
        return "mile";
    }
    Km2Mile_04(double ratio)
    {
        this.ratio=ratio;
    }
    public static void main(String[] args) {
        Km2Mile_04 toMile=new Km2Mile_04(1.6);
        toMile.run();
    }


}
