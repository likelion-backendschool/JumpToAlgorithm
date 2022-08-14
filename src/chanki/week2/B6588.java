// 골드바흐의 추측
package chanki.week2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class B6588 {
    public static void main(String[] args) throws Exception {
        int num;
        boolean wrong = true;
        ArrayList<Integer> nonPrime = new ArrayList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            num = Integer.parseInt(br.readLine());
            if(num == 0) {
                break;
            }
            for(int i = 3; i <= num / 2; i+=2) {
                if(isPrime(i)) {
                    if(isPrime(num-i)) {
                        bw.write(num + " = " + i + " + " + (num - i) + "\n");
                        wrong = false;
                        break;
                    }
                }
            }
            if(wrong) {
                bw.write("Goldbach's conjecture is wrong.\n");
            }
            wrong = true;
        }

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
