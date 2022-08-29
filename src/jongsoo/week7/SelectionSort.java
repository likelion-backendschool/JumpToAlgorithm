package jongsoo.week7;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {

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

        Arrays.sort(Indexarr);
    }
    static void print() {
        for(var x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    //arr 배열에 선택 정렬을 구현해보세요
    int min = 0;
    static void SelectionSort(){
    for(int i=0; i < arr.length-1; i++ ) {
        for(int j=0; j < arr.length; j++ ) {
            if()
        }
    }


    }

    public static void main(String[] args) {

        init();
        SelectionSort();
        /*배열이 어떻게 정렬이 되었는지 확인해 보고 싶다면 주석을 제거해 확인해보세요.
        print();
        */
        System.out.println(Arrays.deepEquals(Indexarr, arr)? "정답입니다 !" : "다시 정렬해보세요 !");

    }
}