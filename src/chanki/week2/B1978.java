// 나머지
package chanki.week2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1978 {
    public static void main(String[] args) throws Exception {
        int test;
        int cnt = 0;
        String[] input;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        test = Integer.parseInt(br.readLine());
        input = br.readLine().split(" ");

        for(int i = 0; i < test; i++) {
            if(isPrime(Integer.parseInt(input[i]))) {
                cnt++;
            }
        }

        bw.write(cnt + "");

        bw.flush();
        bw.close();
    }

    static boolean isPrime(int num) {
        if(num == 1)
            return false;
        for(int i = 2; i <= Math.pow(num, 0.5); i++) {
            if(num % i == 0)
                return false;
        }
        return true;
    }
}
