package chanki.week3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class BJ1463 {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> arr = new ArrayList(List.of(0, 0, 1, 1, 2));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int minus, mod2, mod3;

        for(int i = 5; i <= input; i ++) {
            minus = arr.get(i - 1);
            if(i % 2 == 0) {
                mod2 = arr.get(i / 2);
            } else {
                mod2 = minus + 1;
            }
            if(i % 3 == 0) {
                mod3 = arr.get(i / 3);
            } else {
                mod3 = minus + 1;
            }
            arr.add(Math.min(minus, Math.min(mod2, mod3)) + 1);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(arr.get(input) + "");

        bw.flush();
        bw.close();
    }
}
