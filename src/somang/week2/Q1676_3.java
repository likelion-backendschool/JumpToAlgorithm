package somang.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1676_3 {
    /*
        [Baekjoon-1676]팩토리얼 0의 개수
        ⏰ 76ms

        0의 개수는 10의 배수이며, 2 * 5의 구성이 나오는 경우이다.
        즉, N!의 과정에서 2와 5로 나누어 떨어지는 경우를 count 한다.
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int twoCnt = 0;
        int fiveCnt = 0;

        for(int i = 1; i <= N; i++) {
            int target = i;

            while((target % 2) == 0) {
                twoCnt++;
                target /= 2;
            }

            while((target % 5) == 0) {
                fiveCnt++;
                target /= 5;
            }
        }

        System.out.println(Math.min(twoCnt, fiveCnt));
    }

}
