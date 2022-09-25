// 요세푸스
package chanki.week1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ1158 {
    public static void main(String[] args) throws IOException {
        String input;
        Queue<Integer> queue = new LinkedList<>();
        int people, index;
        int cnt = 1;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        people = Integer.parseInt(st.nextToken());
        index = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= people; i++) {
            queue.add(i);
        }

        bw.write("<");
        while (!queue.isEmpty()) {
            if (cnt == index) {
                bw.write(queue.poll().toString());
                if (queue.isEmpty())
                    bw.write(">");
                else
                    bw.write(", ");
                cnt = 1;
            } else {
                queue.add(queue.poll());
                cnt++;
            }
        }
        bw.flush();
        bw.close();
    }
}