package OpenDevPj_2021.Chap06.Prac;
import java.util.Scanner;
public class Person_10 {
    Scanner scanner=new Scanner(System.in);
    private String name;

    Person_10(String name){
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
        System.out.print("1번째 선수 이름>>");
        Person_10 h1=new Person_10((scanner.next()));
        System.out.print("2번째 선수 이름>>");
        Person_10 h2=new Person_10((scanner.next()));

        while(true){
            if(h1.run()){
                System.out.println(h1.getName()+"님이 이겼습니다!");
                break;
            }
            else {
                System.out.println("아쉽군요!");
            }
            if(h2.run()){
                System.out.println(h2.getName()+"님이 이겼습니다!");
                break;
            }
            else {
                System.out.println("아쉽군요!");
            }
        }
    }

}
