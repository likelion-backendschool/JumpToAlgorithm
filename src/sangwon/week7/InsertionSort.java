package sangwon.week7;

import java.util.Arrays;
import java.util.Random;

public class InsertionSort {

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
    static void InsertionSort(){
        //2번째 항목부터 정렬한다고 했으므로, i는 1부터
        for(int i = 1; i < arr.length; i++) {
            //현재 index의 값 저장
            int tmp = arr[i];
            //이전의 index들을 검사하므로, j는 i-1로 선언
            int j = i - 1;
            // 배열의 범위 안이면서, 정렬 조건에 맞다면 옮겨서 삽입하기
            while((j >= 0) && (arr[j] > tmp)) {
                arr[j + 1] = arr[j];
                j--;
            }
            //현재 j는 tmp 값보다 작은 index를 가르키고 있으므로, 하나 더한 위치에 tmp 값 삽입하기
            arr[j + 1] = tmp;
        }


    }

    public static void main(String[] args) {

        init();
        InsertionSort();
        /*배열이 어떻게 정렬이 되었는지 확인해 보고 싶다면 주석을 제거해 확인해보세요.
        print();
        */
        System.out.println(Arrays.deepEquals(Indexarr, arr)? "정답입니다 !" : "다시 정렬해보세요 !");

    }
}

