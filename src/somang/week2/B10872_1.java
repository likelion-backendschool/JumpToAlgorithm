package somang.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10872_1 {
    /*
        [Baekjoon-10872]팩토리얼
        ⏰ 76ms

        재귀함수 사용
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        System.out.println(factorial(N));
    }

    static int factorial(int N) {
        if(N == 0) {
            return N = 1;
        }
        else {
            return N * factorial(N - 1);
        }
    }

}
