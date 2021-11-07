package OpenDevPj_2021.Chap08.Prac;
import java.io.*;
import java.util.*;
public class Prac08_12 {
    public static void main(String[] args) {
        FileReader fr=null;
        Vector<String> v;
        Scanner fscanner,scanner;
        try {
            scanner=new Scanner(System.in);
            System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
            System.out.print("대상 파일명 입력>> ");
            String fileN=scanner.next();

            fr=new FileReader(new File(fileN));
            v=new Vector<String>();
            fscanner=new Scanner(fr);
            String line="";

            while(fscanner.hasNext()) {
                line=fscanner.nextLine();
                v.add(line);
            }

            while(true) {
                System.out.print("검색할 단어나 문장>> ");
                String findN=scanner.next();
                boolean find=false;
                if(findN.equals("그만")) break;
                for(int i=0;i<v.size();i++) {
                    String temp=v.get(i);
                    if(temp.indexOf(findN)!=-1) {
                        find=true;
                        System.out.println(i+": "+temp);
                    }
                }
                if(!find) {
                    System.out.println("발견할 수 없음.");
                }
            }
            System.out.println("프로그램을 종료합니다.");
            scanner.close();
            fr.close();
            fscanner.close();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
