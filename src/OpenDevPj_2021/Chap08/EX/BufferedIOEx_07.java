package OpenDevPj_2021.Chap08.EX;
import java.io.*;
import java.util.Scanner;

public class BufferedIOEx_07 {
    public static void main(String[] args) {
        FileReader fin = null;
        BufferedOutputStream bouts = null;
        int c;
        try {
            fin = new FileReader("c:\\Temp\\test2.txt");
            bouts = new BufferedOutputStream(System.out, 5);
            while((c=fin.read())!=-1) {
                bouts.write(c);
            }
            new Scanner(System.in).nextLine();
            bouts.flush();
            fin.close();
            bouts.close();
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
