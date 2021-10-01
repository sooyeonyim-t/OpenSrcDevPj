package OpenDevPj_2021.Chap04.Prac;
import java.util.Scanner;
class Dictionary{
    private static String [] kor={"사랑","아기","돈","미래","희망"};
    private static String [] eng={"love","baby","money","future","hope"};
    public static String kor2Eng(String word){
        for (int i = 0; i < 5; i++) {
            if (word.equals(kor[i])) {
                return (word + "은 " + eng[i]);
            }
            else if(word.equals("그만")){
                return "그만";
            }
        }
        return (word + "는 저의 사전에 없습니다.");
    }
}
public class DicApp_10 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("한영 단어 검색 프로그램입니다.");
        String w="";
        while(!w.equals("그만")) {
            System.out.print("한글 단어?");
            w=scanner.next();
            w=Dictionary.kor2Eng(w);
            if(!w.equals("그만")) {
                System.out.println(w);
            }
        }
    }

}
