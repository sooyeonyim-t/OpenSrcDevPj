package OpenDevPj_2021.Chap03.prac;
/**
 * 문제: 3장 10번, 배열과 반복문, 랜덤 및 중복, 범위 조건 연습하는 프로그램
 * 학번/이름 : 2020039017 임수연
 */
public class Prac05 {
    public static void main(String[] args) {
        int intArray[][]=new int[4][4]; //4x4행렬 선언

        for(int c=0;c<4;c++){   //배열을 0으로 초기화
            for(int d=0;d<4;d++){
                intArray[c][d]=0;
            }
        }

        int arr[][] = new int[10][2];   //임의의 10개의 위치를 저장하는 배열 
        
        for(int i=0;i<10;i++) {// 10개의 위치를 중복없이 랜덤으로 만들어 arr배열에 저장
            int a = (int) (Math.random() * 4);  //임의의a 위치(4*4행렬)
            int b = (int) (Math.random() * 4);  //임의의 b 위치(0~3)
            arr[i][0] = a;
            arr[i][1] = b;
            for (int w = 0; w < i; w++) {// 위치 중복 제거
                if (arr[i][0] == arr[w][0]) {
                    if(arr[i][1]==arr[w][1]){
                        i--;
                    }
                }
            }
        }
        
        for(int z=0;z<10;z++){//10개의 위치에 1~10 중 랜덤으로 중복있이 저장
            int h=arr[z][0];
            int e=arr[z][1];
            intArray[h][e]= (int) (Math.random() * 10 + 1);
        }
        
        for(int c=0;c<4;c++){//4x4행렬 출력, 한줄에 4개씩
            for(int d=0;d<4;d++){
                System.out.print(intArray[c][d]+" ");
            }
            System.out.println();
        }

    }
}