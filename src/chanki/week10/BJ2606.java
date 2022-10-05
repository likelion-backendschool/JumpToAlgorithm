package chanki.week10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BJ2606 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int connectionNum = Integer.parseInt(br.readLine());

        List<Integer>[] graph = new List[n + 1];
        for(int i = 1; i < n + 1; i++) {
            graph[i] = new ArrayList<>();
        }

        String[] network;
        int firstValue, secondValue;
        for(int i = 0; i < connectionNum; i++) {
            network = br.readLine().split(" ");

            firstValue = Integer.parseInt(network[0]);
            secondValue = Integer.parseInt(network[1]);

            graph[firstValue].add(secondValue);
            graph[secondValue].add(firstValue);
        }

        int cnt = 0;
        Boolean[] visited = new Boolean[n + 1];
        for(int i = 1; i <= n; i++) {
            visited[i] = false;
            graph[i].sort(Comparator.comparingInt(o -> o));
        }
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        int pop;
        while(!queue.isEmpty()) {
            pop = queue.poll();
            if(!visited[pop]) {
                visited[pop] = true;
                cnt++;
            }

            graph[pop].stream()
                    .filter(v -> !visited[v])
                    .forEach(v -> queue.add(v));
        }

        System.out.println(cnt - 1);
    }
}
