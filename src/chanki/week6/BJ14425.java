package chanki.week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BJ14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = br.readLine().split(" ");

        int n = Integer.parseInt(inputs[0]);
        int m = Integer.parseInt(inputs[1]);

        ArrayList<String> set = new ArrayList<>();
        String input;
        int sum = 0;

        for(int i = 0; i < n; i++) {
            input = br.readLine();
            set.add(input);
        }

        for(int i = 0; i < m; i++) {
            input = br.readLine();
            if(set.contains(input)) {
                sum++;
            }
        }

        System.out.println(sum);
    }
}
