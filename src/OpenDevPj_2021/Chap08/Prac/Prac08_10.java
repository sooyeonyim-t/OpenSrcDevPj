package OpenDevPj_2021.Chap08.Prac;
import java.io.*;
import java.util.*;
public class Prac08_10 {
    public static void main(String[] args) {
        File f=null;
        FileReader fr=null;
        HashMap<String,String> phone;
        Scanner scanner;
        try {
            phone=new HashMap<String,String>();
            f=new File("c:\\Temp\\phone.txt");
            fr=new FileReader(f);
            scanner=new Scanner(fr);

            while(scanner.hasNext()) {
                String n=scanner.next();
                String t=scanner.next();
                phone.put(n,t);
                System.out.println("이름>> "+n+"\n"+phone.get(n));
            }
            System.out.println("총 "+phone.size()+"개의 전화번호를 읽었습니다.");
            scanner.close();
            scanner=new Scanner(System.in);
            String temp="";
            while(true) {
                System.out.print("이름>>");
                temp=scanner.next();
                if(temp.equals("그만")) {
                    break;
                }
                String tel=phone.get(temp);
                if(tel==null) {
                    System.out.println("찾는 이름이 없습니다.");
                }
                else {
                    System.out.println(tel);
                }
            }
        } catch (Exception e) {
        }
    }

}
