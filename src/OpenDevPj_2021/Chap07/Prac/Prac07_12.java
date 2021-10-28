package OpenDevPj_2021.Chap07.Prac;
import java.util.*;

class quiz{
    private HashMap<String,String>h =new HashMap<String,String>();
    Scanner scanner=new Scanner(System.in);
    public quiz() {
    }

    public void run() {
        System.out.println("**** 영어 단어 테스트 프로그램 \"명품영어\" 입니다. ****");
        while(true) {
            System.out.print("단어 테스트:1, 단어 삽입:2, 종료:3>> ");
            int num=scanner.nextInt();
            if(num==1) {
                quizgame();
            }
            else if(num==2) {
                input();
            }
            else {
                break;
            }
        }
    }

    public void input() {
        System.out.println("영어 단어에 그만을 입력하면 입력을 종료합니다.");
        while(true) {
            System.out.print("영어 한글 입력 >> ");
            String eng=scanner.next();
            if(eng.equals("그만")) {
                break;
            }
            String kor=scanner.next();
            h.put(eng,kor);
        }
    }
    public void quizgame() {
        while(true) {
            System.out.println("현재 "+h.size()+"개의 단어가 들어 있습니다. -1을 입력하면 테스트를 종료합니다.");
            int index=(int)(Math.random()*h.size());

            Set<String> keys=h.keySet();
            Object[] arr=keys.toArray();

            String question=(String)arr[index];
            String answer=h.get(question);
            int answeri=(int)(Math.random()*4)+1;
            System.out.println(question+"?");
            for(int i=1;i<=4;i++) {
                if(i==answeri) {
                    System.out.print("("+i+")"+h.get((String)arr[index])+" ");
                    continue;
                }
                int randomi=(int)(Math.random()*h.size());
                if(randomi==index) {
                    i--;
                    continue;
                }
                else {
                    System.out.print("("+i+")"+h.get((String)arr[randomi])+" ");
                }
            }

            int reply=scanner.nextInt();

            if(reply==-1) {
                break;
            }

            if(reply==answeri) {
                System.out.println("Excellent !!");
            }
            else {
                System.out.println("No. !!");
            }
        }
    }
}


public class Prac07_12 {
    public static void main(String[] args) {
        quiz q=new quiz();
        q.run();
    }
}
