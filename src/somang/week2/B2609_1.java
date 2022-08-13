package somang.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2609_1 {
    /*
        [Baekjoon-2609]최대공약수와 최소공배수
        ⏰ 76ms

        유클리드 호제법
        두 개의 자연수 A, B에 대해서 A를 B로 나눈 나머지를 R이라고 하면,
        A와 B의 최대공약수는 B와 R의 최대공약수와 같다.
        R이 0이면 그 때 B가 최대공약수이다. (단, A > B 일 때)

        ex) 정수 A = 24, 정수 B = 18
        24 % 18 = 6
        18 % 6 = 0
        따라서 24와 18의 최대공약수는 6이다.
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int max = Math.max(A, B);
        int min = Math.min(A, B);

        int gcd = GCD(max, min);

        // 최대공약수
        sb.append(gcd).append("\n");

        // 최소공배수
        sb.append(A * B / gcd).append("\n");

        System.out.println(sb);
    }

    static int GCD(int max, int min) {
        while(min != 0) {
            int num = max % min;

            max = min;
            min = num;
        }
        return max;
    }

}
