package OpenDevPj_2021.Chap07.EX;
import java.util.*;
public class ArrayListEx_03 {
    public static void main(String[] args) {
        ArrayList<String>a=new ArrayList<String>();

        Scanner sc=new Scanner(System.in);
        for(int i=0;i<4;i++){
            System.out.printf("이름을 입력하세요>> ");
            String s=sc.next();
            a.add(s);
        }

        for(int i=0;i<a.size();i++){
            String name=a.get(i);
            System.out.print(name+" ");
        }
        int longestIndex=0;
        for(int i=0;i<a.size();i++){
            if(a.get(longestIndex).length()<a.get(i).length()){
                longestIndex=i;
            }
            System.out.println("\n가장 긴 이름은 : "+a.get(longestIndex));

        }
        sc.close();
    }
}
