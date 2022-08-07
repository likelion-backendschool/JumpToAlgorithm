package chanki.week4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B17436 {

    public int recursion(int[] primes, int lastIndex, int m) {
        int sum = 0;
        if(lastIndex == primes.length - 1) {

        }
        for(int i = lastIndex; i < primes.length; i++) {
            recursion(primes, lastIndex + 1, m);
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int sum = 0;

        String[] primeInput = br.readLine().split(" ");
        int[] primes = new int[n];
        for(int i = 0; i < n; i++) {
            primes[i] = Integer.parseInt(primeInput[i]);
        }

        for(int i = 0; i < n; i++) {
            sum += new B17436().recursion(primes, i, m);
        }

        bw.write(sum + "");


        bw.flush();
        bw.close();
    }
}
