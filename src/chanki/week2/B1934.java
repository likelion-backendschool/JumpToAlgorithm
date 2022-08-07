// 최소공배수
package chanki.week2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B1934 {
    public static void main(String[] args) throws Exception {
        int a, b, m, n, test, temp;
        int leastCommonMultiple = 1;
        String[] input;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        test = Integer.parseInt(br.readLine());

        for(int i = 0; i < test; i++) {

            input = br.readLine().split(" ");

            a = Integer.parseInt(input[0]);
            b = Integer.parseInt(input[1]);

            if(a > b) {
                m = a;
                n = b;
            } else {
                m = b;
                n = a;
            }

            while(n > 0) {
                temp = n;
                n = m % n;
                m = temp;
            }

            leastCommonMultiple = (a * b) / m;  // 최소공배수 = a * b / 최대공약수

            bw.write(leastCommonMultiple + "\n");
        }

        bw.flush();
        bw.close();
    }
}