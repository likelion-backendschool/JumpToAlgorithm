package jongsoo.week4;

import java.io.*;

public class Q1912 {
    static int arr[];
    static int dp[];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        dp = new int[n];

        String line[] = br.readLine().split(" ");

        // 기저 상태 지정
        dp[0] = Integer.parseInt(line[0]);

        // 최대 연속값 미리 지정
        int max_val = dp[0];

        for(int i=1; i < n; i++){
            arr[i] = Integer.parseInt(line[i]);
            dp[i] = Math.max(dp[i-1] + arr[i], arr[i]);
            max_val = Math.max(max_val, dp[i]);
        }
        bw.write(String.valueOf(max_val));
        br.close();
        bw.flush();
    }
}
