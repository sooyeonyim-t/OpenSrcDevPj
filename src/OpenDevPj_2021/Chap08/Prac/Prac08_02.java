package OpenDevPj_2021.Chap08.Prac;
import java.io.*;

public class Prac08_02 {

    public static void main(String[] args) {
        File f=null;
        FileReader fr=null;
        BufferedReader br=null;

        try {
            f=new File("c:\\Temp\\phone.txt");
            fr=new FileReader(f);
            System.out.println(f.getPath()+"를 출력합니다.");
            br=new BufferedReader(fr,30);
            String temp="";
            while(true) {
                temp=br.readLine();
                if(temp==null) {
                    break;
                }
                System.out.println(temp);
            }
            fr.close();

        } catch (IOException e) {
        }
    }

}
