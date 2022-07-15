package somang.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2609_2 {
    /*
        [Baekjoon-2609]최대공약수와 최소공배수
        ⏰ 320ms
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int min = Math.min(x, y);
        int max = Math.max(x, y);

        for(int i = min; i > 0; i--) {
            if(x % i == 0 && y % i == 0) {
                sb.append(i).append("\n");
                break;
            }
        }

        for(int i = max; i <= x * y; i++) {
            if(i % x == 0 && i % y == 0) {
                sb.append(i).append("\n");
                break;
            }
        }

        System.out.println(sb);
    }

}
