package chanki.week3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class BJ9095 {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> way = new ArrayList<>(Arrays.asList(1, 2, 4));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());

        for(int i = 0; i < input; i++) {
            Integer number = Integer.parseInt(br.readLine());

            if(number - 1 < 3) {
                bw.write(way.get(number - 1) + "\n");
            } else {
                for(int j = way.size(); j < number; j++) {
                    way.add(way.get(j - 3) + way.get(j - 2) + way.get(j - 1));
                }
                bw.write(way.get(number - 1) + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
