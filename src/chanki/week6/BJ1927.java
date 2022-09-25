package chanki.week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;

public class BJ1927 {
    public static void main(String[] args) throws IOException {
        Queue<Integer> queue = new PriorityQueue<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        int input;

        for(int i = 0; i < num; i++) {
            input = Integer.parseInt(br.readLine());

            if(input == 0) {
                try {
                    sb.append(queue.remove() + "\n");
                } catch (NoSuchElementException e) {
                    sb.append(0 + "\n");
                }
                continue;
            }

            queue.add(input);
        }

        System.out.println(sb);
    }
}
