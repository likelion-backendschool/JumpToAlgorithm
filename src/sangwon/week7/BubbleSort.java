package sangwon.week7;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {

    static Integer Indexarr[];
    static Integer arr[];

    //배열 셋팅 부분 , 건들지 마세요 !!
    static void init() {
        Indexarr = new Integer[50];
        arr = new Integer[50];
        Random random = new Random();
        //index배열에 랜덤으로 숫자 집어넣기
        for(int i = 0; i < Indexarr.length; i++) {
            Indexarr[i] = random.nextInt(100) + 1;
        }
        //arr 배열 생성
        System.arraycopy(Indexarr, 0, arr, 0, Indexarr.length);
        //정답 배열로 바꾸기
        Arrays.sort(Indexarr);
    }

    static void print() {
        for(var x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    //arr 배열에 버블 소트를 구현해보세요
    static void bubbleSort(){
        //swap을 위한 변수 설정
        int tmp = 0;
        //첫번 째 항목부터, 회차가 진행 될 수록 마지막 - i 번쨰 항목은 조사하지 않아도 되므로
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j <arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {

        init();
        bubbleSort();
        /*배열이 어떻게 정렬이 되었는지 확인해 보고 싶다면 주석을 제거해 확인해보세요.
        print();
        */


        System.out.println(Arrays.deepEquals(Indexarr, arr)? "정답입니다 !" : "다시 정렬해보세요 !");

    }
}
