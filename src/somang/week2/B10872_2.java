package somang.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10872_2 {
    /*
        [Baekjoon-10872]팩토리얼
        ⏰ 76ms

        반복문 사용
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        System.out.println(factorial(N));
    }

    static int factorial(int N) {
        int sum = 1;
        while(N != 0) {
            sum *= N;
            N--;
        }
        return sum;
    }

}
