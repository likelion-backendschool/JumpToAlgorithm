package chanki.week7;

import java.util.Arrays;
import java.util.Random;

public class InsertSort {

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

    //arr 배열에 삽입 정렬을 구현해보세요
    static void InsertSort(){
        int standard;

        for(int i = 1; i < arr.length; i++) {
            standard = arr[i];
            inner:
            for(int j = i; j > 0; j--) {
                if(arr[j - 1] > standard) {
                    arr[j] = arr[j - 1];
                    arr[j - 1] = standard;
                } else {
                    arr[j] = standard;
                    break inner;
                }
            }
        }
    }

    public static void main(String[] args) {

        init();
        InsertSort();
        print();

        System.out.println(Arrays.deepEquals(Indexarr, arr)? "정답입니다 !" : "다시 정렬해보세요 !");

    }
}
