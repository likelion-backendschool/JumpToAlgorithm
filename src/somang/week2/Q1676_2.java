package somang.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1676_2 {
    /*
        [Baekjoon-1676]팩토리얼 0의 개수
        ⏰ 76ms

        뒷자리가 0이 나오는 경우 : 2와 5가 곱해져 있을 떄(10의 배수)
        → 소인수분해를 해서 2와 5가 존재할 경우 뒷자리는 0으로 끝난다.

        뒷자리가 0이 n개 있다. = 2와 5가 n개씩 짝지어 존재한다.
        반복문을 통해 5로 나누면서 누적합한다.
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 0;

        while(N >= 5) {
            count += N / 5;
            N /= 5;
        }

        System.out.println(count);
    }

}
