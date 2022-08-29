package chanki.week7;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {

    static Integer Indexarr[];
    static Integer arr[];

    // 배열 셋팅 부분 , 건들지 마세요 !!
    static void init() {
        Indexarr = new Integer[50];
        arr = new Integer[50];
        Random random = new Random();
        //index배열에 랜덤으로 숫자 집어넣기
        for(int i = 0; i < Indexarr.length; i++) {
            Indexarr[i] = random.nextInt(100) + 1;
        }
        // arr 배열 생성
        System.arraycopy(Indexarr, 0, arr, 0, Indexarr.length);
        // 정답 배열로 바꾸기
        Arrays.sort(Indexarr);
    }

    static void print() {
        for(var x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    // arr 배열에 버블 소트를 구현해보세요
    static void bubbleSort(){
        int temp;
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        init();
        bubbleSort();
        print();

        System.out.println(Arrays.deepEquals(Indexarr, arr)? "정답입니다 !" : "다시 정렬해보세요 !");

    }
}
