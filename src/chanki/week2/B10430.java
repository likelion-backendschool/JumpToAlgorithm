// 나머지
package chanki.week2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B10430 {
    public static void main(String[] args) throws Exception {
        int a, b, c;
        String[] input;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        input = br.readLine().split(" ");

        a = Integer.parseInt(input[0]);
        b = Integer.parseInt(input[1]);
        c = Integer.parseInt(input[2]);

        bw.write((a + b) % c + "\n");
        bw.write(((a % c) + (b % c)) % c + "\n");
        bw.write((a * b) % c + "\n");
        bw.write(((a % c) * (b % c)) % c + "\n");

        bw.flush();
        bw.close();
    }
}
