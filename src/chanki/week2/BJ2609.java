// 최대공약수와 최소공배수
package chanki.week2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class BJ2609 {
    public static void main(String[] args) throws Exception {
        int a, b;
        int num = 2;
        int greatestCommonFactor = 1;
        int leastCommonMultiple;
        HashMap<Integer, Integer> primefactor = new HashMap<Integer, Integer>();
        String[] input;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        input = br.readLine().split(" ");

        a = Integer.parseInt(input[0]);
        b = Integer.parseInt(input[1]);

        while(a >= num && b >= num) {
            if(a % num == 0 && b % num == 0) {
                if(primefactor.containsKey(num)) {
                    primefactor.put(num, primefactor.get(num).intValue() + 1);
                } else {
                    primefactor.put(num, 1);
                }
                a/=num;
                b/=num;
            } else {
                num++;
            }
        }

        for(Integer factor: primefactor.keySet()) {
            greatestCommonFactor *= Math.pow(factor, primefactor.get(factor).intValue());
        }
        leastCommonMultiple = greatestCommonFactor * a * b;

        bw.write(greatestCommonFactor + "\n");
        bw.write(leastCommonMultiple + "\n");

        bw.flush();
        bw.close();
    }
}