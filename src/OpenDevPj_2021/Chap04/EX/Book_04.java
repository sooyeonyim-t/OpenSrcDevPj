package OpenDevPj_2021.Chap04.EX;

public class Book_04 {
    String title;
    String author;

    public Book_04(String t){
        title=t;
        author="작자미상";
    }
    public Book_04(String t, String a){
        title=t;
        author=a;
    }

    public static void main(String[] args) {
        Book_04 littlePrince=new Book_04("어린왕자","생택쥐페리");
        Book_04 loveStory=new Book_04("춘향전");
        System.out.println(littlePrince.title+" "+littlePrince.author);
        System.out.println(loveStory.title+" "+loveStory.author);
    }
}
