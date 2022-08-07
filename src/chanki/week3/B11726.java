package chanki.week3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class B11726 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int result;

        ArrayList<Integer> way = new ArrayList<Integer>(List.of(1, 1));

        for(int i = 2; i <= n; i++) {
            result = (way.get(i - 2) + way.get(i - 1)) % 10007;
            way.add(result);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(way.get(n) % 10007 + "");
        bw.flush();
        bw.close();
    }
}
