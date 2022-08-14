package somang.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2004 {
    /*
        [Baekjoon-2004]조합 0의 개수
        ⏰ 76ms

        nCm의 끝자리 0의 개수를 출력하라.

        ⭐️ 조합의 끝자리 0의 개수를 구하기 위해서는, 조합의 값을 소인수분해했을 때 10(2 * 5)을 얼마나 많이 가지고 있는지를 구하면 된다.
        example
        50 = 5 * 10 → 0 : 1개
        342000 = 342 * 10 * 10 → 0 : 3개

        nCm = n! / r! * (n - r)!
        n!에서 사용된 2와 5의 개수를 더하고, r!과 (n - r)!에서 사용된 2와 5의 개수를 빼주면 된다.
        ❗️범위가 최대 20억이기 때문에, 팩토리얼값을 직접 구하면 안된다. → 1억 이상인 경우, 시간 초과 발생

        example
        63!의 5의 개수는?
        5의 개수를 구하기 전에 63!에 있는 5의 배수의 개수를 구하자.
        5의 배수의 개수는 = 63 / 5 = 12

        63 전체를 다 조사할 필요 없이, 5의 배수 12개의 숫자만 생각하면 된다.
        다시 5로 나누면 12 / 5 = 2
        따라서 63!의 5의 배수의 개수는 14개이다.

        소인수로 이 문제를 해결할 수 있다.
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        long cnt2 = count2(n) - count2(m) - count2(n-m);
        long cnt5 = count5(n) - count5(m) - count5(n-m);

        System.out.println(Math.min(cnt2, cnt5));
    }

    public static long count5(int num) {
        long temp = 0;
        if(num < 5) return 0;
        for(long i = 5; i <= num; i *= 5) {
            temp = temp + (num / i);
        }
        return temp;
    }

    public static long count2(int num) {
        long temp = 0;
        if(num < 2) return 0;
        for(long i = 2; i <= num; i *= 2) {
            temp = temp + (num / i);
        }
        return temp;
    }
}
