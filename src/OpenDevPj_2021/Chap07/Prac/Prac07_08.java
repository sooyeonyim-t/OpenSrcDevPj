package OpenDevPj_2021.Chap07.Prac;
import java.util.*;
public class Prac07_08 {public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    HashMap<String, Integer> h=new HashMap<String,Integer>();
    System.out.println("** 포인트 관리 프로그램입니다 **");

    while(true) {
        System.out.print("이름과 포인트 입력>> ");
        String st=scanner.nextLine();
        if(st.equals("그만")) {
            break;
        }
        StringTokenizer t=new StringTokenizer(st," ");
        String name=t.nextToken().trim();
        int point=Integer.parseInt(t.nextToken().trim());
        if(h.get(name)!=null) {
            int temp=h.get(name);
            h.put(name, temp+point);
        }
        else {
            h.put(name,point);
        }
        Set<String> keys=h.keySet();
        Iterator<String> it=keys.iterator();
        while(it.hasNext()) {
            String n=it.next();
            int p=h.get(n);
            System.out.print("("+n+","+p+")");
        }
        System.out.println();
    }
}

}
