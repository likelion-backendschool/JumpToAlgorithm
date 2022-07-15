package somang.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9095 {

    /*
        [Baekjoon-9095]1, 2, 3 더하기
        ⏰ 72ms
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());

            int[] dp = new int[x + 3];
            dp[1] = 1;
            dp[2] = 2;
            dp[3] = 4;

            for(int j = 4; j <= x; j++) {
                dp[j] = dp[j - 1] + dp[j - 2] + dp[j - 3];
            }

            sb.append(dp[x]).append("\n");
        }

        System.out.println(sb);
    }

}
