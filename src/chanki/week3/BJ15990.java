package chanki.week3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class BJ15990 {
    public static void main(String[] args) throws Exception {
        ArrayList<Long> startOne = new ArrayList<Long>(List.of(0l, 1l, 0l, 1l));
        ArrayList<Long> startTwo = new ArrayList<Long>(List.of(0l, 0l, 1l, 1l));
        ArrayList<Long> startThree = new ArrayList<Long>(List.of(0l, 0l, 0l, 1l));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int repeat = Integer.parseInt(br.readLine());
        for(int i = 0; i < repeat; i++) {
            int num = Integer.parseInt(br.readLine());

            for(int j = startOne.size(); j <= num; j++) {
                startOne.add((startTwo.get(j - 1) + startThree.get(j - 1)) % 1000000009);
                startTwo.add((startOne.get(j - 2) + startThree.get(j - 2)) % 1000000009);
                startThree.add((startOne.get(j - 3) + startTwo.get(j - 3)) % 1000000009);
            }

            long result = (startOne.get(num) + startTwo.get(num) + startThree.get(num)) % 1000000009;

            bw.write(result + "\n");
        }

        bw.flush();
        bw.close();
    }
}
