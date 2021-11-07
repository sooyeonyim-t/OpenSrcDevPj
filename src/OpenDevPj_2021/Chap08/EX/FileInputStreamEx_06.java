package OpenDevPj_2021.Chap08.EX;

import java.io.*;

public class FileInputStreamEx_06 {
    public static void main(String[] args) {
        FileInputStream fins = null;
        byte[] b = new byte[6];
        try {
            fins = new FileInputStream("c:\\Temp\\test.out");
            int n=0,c;
            while((c = fins.read())!=-1) {
                b[n] = (byte) c;
                n++;
            }
            System.out.println("c:\\Temp\\test.out에서 읽은 배열을 출력합니다.");
            for(int i=0;i<b.length;i++) {
                System.out.print(b[i]+" ");
            }
            fins.close();
        }catch(IOException e) {
            System.out.println("c:\\Temp\\test.out에서 읽지 못했습니다. 경로명을 체크해보세요");
        }
    }
}
