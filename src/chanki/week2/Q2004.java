// 조합 0의 갯수
package chanki.week2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2004 {
    public static void main(String[] args) throws Exception{
        int n, m;
        int cnt2 = 0;
        int cnt5 = 0;
        String[] input;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        input = br.readLine().split(" ");
        n = Integer.parseInt(input[0]);
        m = Integer.parseInt(input[1]);

        for(long i = 2; i <= n; i *= 2) {
            cnt2 += n / i;
        }
        for(long i = 2; i <= n - m; i *= 2) {
            cnt2 -= (n-m) / i;
        }
        for(long i = 2; i <= m; i *= 2) {
            cnt2 -= m / i;
        }
        for(long i = 5; i <= n; i *= 5) {
            cnt5 += n / i;
        }
        for(long i = 5; i <= n - m; i *= 5) {
            cnt5 -= (n-m) / i;
        }
        for(long i = 5; i <= m; i *= 5) {
            cnt5 -= m / i;
        }

        if(cnt2 > cnt5) {
            bw.write(cnt5 + "");
        } else {
            bw.write(cnt2 + "");
        }

        bw.flush();
        bw.close();
    }
}
