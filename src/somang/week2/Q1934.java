package somang.week2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1934 {
    /*
        [Baekjoon-1934]최소공배수
        ⏰ 96ms

        유클리드 호제법을 사용해서 최대공배수를 구한 후, 공식대로 계산한다.
        최소공배수 : A * B / R(최대공배수)
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        // 테스트 케이스 개수
        int T = Integer.parseInt(br.readLine());


        for(int i = 0 ; i < T; i++) {
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            // 메서드 바로 호출 & 저장
            sb.append(x * y / GCD(Math.max(x, y), Math.min(x, y))).append("\n");
        }
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
