package OpenDevPj_2021.Chap08.Prac;

import java.io.*;

public class Prac08_04 {

    public static void main(String[] args) {
        File f=null;
        BufferedReader b=null;

        try {
            f=new File("c:\\windows\\system.ini");
            b=new BufferedReader(new FileReader(f));

            String s="";
            int i=1;
            System.out.println(f.getPath()+" 파일을 읽어 출력합니다.");
            while(true) {

                s=b.readLine();
                if(s==null) {
                    break;
                }
                System.out.println("\t"+i+" : "+s);
                i++;
            }
        }catch(IOException e) {
            e.printStackTrace();
        }
    }

}
