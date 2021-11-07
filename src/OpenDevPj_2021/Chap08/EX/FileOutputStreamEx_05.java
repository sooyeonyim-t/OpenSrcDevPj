package OpenDevPj_2021.Chap08.EX;

import java.io.*;

public class FileOutputStreamEx_05 {
    public static void main(String[] args) {
        FileOutputStream fout = null;
        byte [] b = {7,51,3,4,-1,24};
        try {
            fout = new FileOutputStream("c:\\Temp\\test.out");

            for(int i=0;i<b.length;i++) {
                fout.write(b[i]);
            }
            fout.close();
        }
        catch(IOException e) {
            System.out.println("c:\\\\Temp\\\\test.out에 저장할 수\r\n" + "없었습니다. 경로명을 확인해 주세요");
            return;
        }
        System.out.println("c:\\Temp\\test.out을 저장하였습니다.");
    }
}
