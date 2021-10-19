package OpenDevPj_2021.Chap06.Prac;
import java.util.Scanner;

public class Gambling_12 {
    Scanner scanner=new Scanner(System.in);
    private String name;

    Gambling_12(String name){
        this.name=name;
    }

    boolean run(){
        System.out.print("["+name+"]:<Enter>");
        scanner.nextLine();
        System.out.print("\t");
        int arr[]=new int[3];

        for(int i=0;i<3;i++){
            arr[i]=(int)(Math.random()*3+1);
            System.out.print(arr[i]+"\t");
        }

        if((arr[0]==arr[1])&&arr[0]==arr[2]){
            return true;
        }
        else{
            return false;
        }
    }
    String getName(){
        return name;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("갬블링 게임에 참여할 선수 숫자>>");
        int a=scanner.nextInt();
        Gambling_12 G[]=new Gambling_12[a];

        for(int i=0;i<a;i++){
            int k=i+1;
            System.out.print(k+"번째 선수 이름>>");
            G[i]=new Gambling_12(scanner.next());
        }

        int val=1;
        while (val==1){
            for(int j=0;j<a;j++){
                if(G[j].run()){
                    System.out.println(G[j].getName()+"님이 이겼습니다!");
                    val=0;
                    break;
                }
                else{
                    System.out.println("아쉽군요!");
                }
            }
        }

    }
}
