package OpenDevPj_2021.Chap06.Prac;
import java.util.Calendar;
import java.util.Scanner;

public class Calendar_06 {
    Scanner scanner=new Scanner(System.in);
    private int time;
    private String name;

    Calendar_06(String name){
        this.name=name;
        System.out.print(name+" 시작 <Enter>키>>");
        scanner.nextLine();
        Calendar st=Calendar.getInstance();
        int stsecond=st.get(Calendar.SECOND);
        System.out.println(" 현재 초 시간="+stsecond);
        System.out.print("10초 예상 후 <Enter>키>>");
        scanner.nextLine();
        Calendar en=Calendar.getInstance();
        int ensecond=en.get(Calendar.SECOND);
        System.out.println(" 현재 초 시간 = "+ensecond);
        if(ensecond>stsecond){
            time=ensecond-stsecond;
        }
        else {
            time=60+ensecond-stsecond;
        }
    }
    int getTime(){
        return time;
    }
    String getName(){
        return name;
    }

    public static void main(String[] args) {
        System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
        Calendar_06 c1=new Calendar_06("황기태");
        Calendar_06 c2=new Calendar_06("이재문");

        System.out.print(c1.getName()+"의 결과 "+c1.getTime()+", "+c2.getName()+"의 결과 "+c2.getTime());
        if(Math.abs(c1.getTime()-10)<Math.abs(c2.getTime()-10)){
            System.out.println(", 승자는 황기태");
        }
        else if(Math.abs(c1.getTime()-10)<Math.abs(c2.getTime()-10)){
            System.out.println(", 승자는 이재문");
        }
        else{
            System.out.println(", 비겼습니다.");
        }
    }

}
