package OpenDevPj_2021.Chap04.Prac;

import java.util.Scanner;

import java.util.Scanner;

class Reserve{

    Scanner scanner=new Scanner(System.in);
    public Reserve(String S[], String A[], String B[]){
        while(true){
            System.out.print("좌석구분 S(1), A(2), B(3)>>");
            int seatmenu= scanner.nextInt();

            if(seatmenu==1){
                System.out.print("S>> ");
                for(int i=0;i<10;i++){
                    System.out.print(" "+S[i]);
                }
                System.out.println();
                System.out.print("이름>>");
                String name= scanner.next();
                System.out.print("번호>>");
                int num= scanner.nextInt();
                num=num-1;
                if((num>=0)&&(num<=9)){
                    if(S[num].equals("---"))
                        S[num]=name;
                    else
                        System.out.println("다른 좌석으로 예약하십시오.");

                    break;
                }
                else{
                    System.out.println("좌석 번호는 1~10까지 입니다.");

                }

            }
            else if(seatmenu==3){
                System.out.print("B>> ");
                for(int i=0;i<10;i++){
                    System.out.print(" "+B[i]);
                }
                System.out.println();
                System.out.print("이름>>");
                String name= scanner.next();
                System.out.print("번호>>");
                int num= scanner.nextInt();
                num=num-1;
                if((num>=0)&&(num<=9)){
                    if(B[num].equals("---"))
                        B[num]=name;
                    else
                        System.out.println("다른 좌석으로 예약하십시오.");

                    break;
                }
                else{
                    System.out.println("좌석 번호는 1~10까지 입니다.");

                }

            }

            else if(seatmenu==2){
                System.out.print("A>> ");
                for(int i=0;i<10;i++){
                    System.out.print(" "+A[i]);
                }
                System.out.println();
                System.out.print("이름>>");
                String name= scanner.next();
                System.out.print("번호>>");
                int num= scanner.nextInt();
                num=num-1;
                if(num>=0&&num<=9){
                    if(A[num].equals("---"))
                        A[num]=name;
                    else
                        System.out.println("다른 좌석으로 예약하십시오.");

                    break;
                }
                else{
                    System.out.println("좌석 번호는 1~10까지 입니다.");

                }

            }

            else{
                System.out.println("잘못된 좌석 선택(1~3)입니다. 다시 선택하세요.");

            }

        }



    }
}
class Search{
    public Search(String S[],String A[], String B[]){
        System.out.print("S>> ");
        for(int i=0;i<10;i++){
            System.out.print(" "+S[i]);
        }
        System.out.println();

        System.out.print("A>> ");
        for(int i=0;i<10;i++){
            System.out.print(" "+A[i]);
        }
        System.out.println();

        System.out.print("B>> ");
        for(int i=0;i<10;i++){
            System.out.print(" "+B[i]);
        }
        System.out.println();
        System.out.println("<<조회를 완료하였습니다.>>");
    }

}
class Cancle {
    public Cancle(String S[], String A[], String B[]) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("좌석구분 S:1, A:2, B:3 >>");
            int seatmenu = scanner.nextInt();
            if (seatmenu == 1) {
                System.out.print("S>> ");
                for(int i=0;i<10;i++){
                    System.out.print(" "+S[i]);
                }
                System.out.println();
                System.out.print("이름>>");
                String name = scanner.next();
                for (int i = 0; i < 10; i++) {
                    if (name.equals(S[i])) {
                        S[i] = "---";
                        break;
                    }
                    else if (i == 9) {
                        System.out.println("예약되지 않은 이름입니다.");
                        continue;
                    }
                }


            }
            else if (seatmenu == 2) {
                System.out.print("A>> ");
                for(int i=0;i<10;i++){
                    System.out.print(" "+A[i]);
                }
                System.out.println();
                System.out.print("이름>>");
                String name = scanner.next();
                for (int i = 0; i < 10; i++) {
                    if (name.equals(A[i])) {
                        A[i] = "---";
                        break;
                    }
                    else if (i == 9) {
                        System.out.println("예약되지 않은 이름입니다.");
                        continue;
                    }
                }

            }
            else if (seatmenu == 3) {
                System.out.print("B>> ");
                for(int i=0;i<10;i++){
                    System.out.print(" "+B[i]);
                }
                System.out.println();
                System.out.print("이름>>");
                String name = scanner.next();
                for (int i = 0; i < 10; i++) {
                    if (name.equals(B[i])) {
                        B[i] = "---";
                        break;
                    }
                    else if (i == 9) {
                        System.out.println("예약되지 않은 이름입니다.");
                        continue;
                    }
                }


            }
            else {
                System.out.println("잘못된 좌석 선택(1~3)입니다. 다시 선택하세요.");
                continue;
            }
            break;
        }
    }
}


public class Concert_12 {
    static String S[]=new String[10];
    static String A[]=new String[10];
    static String B[]=new String[10];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            S[i] = "---";
            A[i] = "---";
            B[i] = "---";
        }

        System.out.println("명품콘서트홀 예약 시스템입니다.");

        while (true) {
            System.out.print("예약:1, 조희:2, 취소:3, 끝내기:4>>");
            int menu = scanner.nextInt();

            if (menu == 1) {
                Reserve r = new Reserve(S, A, B);
            }

            else if (menu == 2) {
                Search s = new Search(S, A, B);
            }

            else if (menu == 3) {
                Cancle c = new Cancle(S, A, B);
            }

            else if (menu == 4) {
                break;
            }

            else {
                System.out.println("다시시도하세요.");
            }
        }
    }
}





