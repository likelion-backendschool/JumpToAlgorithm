package somang.week5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Q2164 {

    /*
        [Baekjoon-2164]카드2
        ⏰ 204ms
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();

        for(int i = 1; i <= N; i++) {
            queue.add(i);
        }

        int count = 1;
        while(queue.size() > 1) {
            if(count % 2 == 1) {
                queue.poll();
                count++;
                continue;
            }
            int top = queue.poll();
            queue.add(top);
            count++;
         }

        bw.write(queue.poll() + "");
        bw.flush();
        bw.close();
        br.close();
    }

}
