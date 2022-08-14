package chanki.week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BJ2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();

        for(int i = 1; i <= num; i++) {
            queue.add(i);
        }

        int out = 1;
        while(!queue.isEmpty()) {
            out = queue.remove();
            if(queue.isEmpty())
                break;
            queue.add(queue.remove());
        }
        System.out.println(out);
    }
}
