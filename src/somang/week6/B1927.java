package somang.week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class B1927 {

    /*
        [Baekjoon-1927]최소 힙
        ⏰ 324ms
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        PriorityQueue<Integer> heap = new PriorityQueue<>();

        int count = Integer.parseInt(br.readLine());

        for(int i = 0; i < count; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                sb.append(heap.size() == 0 ? 0 : heap.poll()).append("\n");
                continue;
            }
            heap.add(num);
        }

        System.out.println(sb.toString());
    }

}
