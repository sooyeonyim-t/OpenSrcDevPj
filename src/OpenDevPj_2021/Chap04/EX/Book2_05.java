package OpenDevPj_2021.Chap04.EX;

public class Book2_05 {
    String title;
    String author;
    void show(){
        System.out.println(title+""+author);

    }
    public Book2_05(){
        this("","");
        System.out.println("생성자 호출됨");
    }

    public Book2_05(String title){
        this(title,"작자미상");
    }
    public Book2_05(String title, String author){
        this.title=title;
        this.author=author;
    }

    public static void main(String[] args) {
        Book2_05 littlePrince=new Book2_05("어린왕자","생텍쥐페리");
        Book2_05 bible=new Book2_05("Bible");
        Book2_05 emptyBook=new Book2_05();
        bible.show();
    }
}
