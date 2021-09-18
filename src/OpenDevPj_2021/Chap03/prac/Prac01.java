package OpenDevPj_2021.Chap03.prac;
/**
 * 문제: 3장 2번, 2차원 배열 n을 출력하는 프로그램
 * 학번/이름 : 2020039017 임수연
 */

public class Prac01 {
    public static void main(String[] args) {

        int n[][]={{1},{1,2,3},{1},{1,2,3,4},{1,2}};    //2차원 배열 선언

        for(int i=0;i<n.length;i++){    //행마다
            for(int j=0;j<n[i].length;j++){ //각 행의 열마다 출력
                System.out.printf(n[i][j]+" ");
            }
            System.out.println();   //한 행의 출력 끝나고 다음 행 넘어갈 때 개행
        }
    }
}
