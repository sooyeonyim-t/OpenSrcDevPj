package OpenDevPj_2021.Chap04.Prac;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
class Phone{
    private String name;
    private String tel;

    public Phone(String name, String tel){
        this.name=name;
        this.tel=tel;
    }
    String Getname(){
        return name;
    }
    String Gettel(){
        return tel;
    }


}
public class PhoneBook_08 {
     public PhoneBook_08(){

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("인원수>>");
        int HeadCount= scanner.nextInt();
        Phone p[]=new Phone[HeadCount];

        for(int i=0;i<HeadCount;i++){
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
            String n= scanner.next();
            String pnum= scanner.next();
            p[i]=new Phone(n,pnum);
        }
        System.out.println("저장되어습니다...");
     
        String a;
        do{
            System.out.print("검색할 이름>>");
            a= scanner.next();
            for(int i=0;i<HeadCount;i++){
                if(a.equals(p[i].Getname())){
                    System.out.println(a+"의 번호는 "+p[i].Gettel()+"입니다.");
                    break;
                }
                else if(i==(HeadCount-1)&&(!a.equals("그만"))){
                    System.out.println(a+" 이 없습니다.");
                }
            }

        } while(!(a.equals("그만")));


        scanner.close();
    }
}
