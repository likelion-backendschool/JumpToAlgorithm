package somang.week6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class B14425 {

    /*
        [Baekjoon-14425]문자열 집합
        ⏰ 400ms
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int setSize = Integer.parseInt(st.nextToken());
        int testSize = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < setSize; i++) {
            map.put(br.readLine(), 0);
        }

        int count = 0;
        for(int i = 0; i < testSize; i++) {
            if (map.containsKey(br.readLine())) count++;
        }

        System.out.println(count);
    }

}
