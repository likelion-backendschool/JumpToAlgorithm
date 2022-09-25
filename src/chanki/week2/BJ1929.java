// 소수 구하기
package chanki.week2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ1929 {
    public static void main(String[] args) throws Exception {
        String[] input;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        input = br.readLine().split(" ");

        for(int i = Integer.parseInt(input[0]); i <= Integer.parseInt(input[1]); i++) {
            if(isPrime(i)) {
                sb.append(i + "\n");
            }
        }
        System.out.println(sb);
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