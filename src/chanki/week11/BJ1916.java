// 다익스트라 연습

package chanki.week11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class BJ1916 {
    static class Bus implements Comparable<Bus> {
        int city;
        int cost;

        public Bus(int city, int cost) {
            this.city = city;
            this.cost = cost;
        }

        @Override
        public int compareTo(Bus o) {
            return this.cost - o.cost;
        }
    }
    public static void main(String[] args) throws IOException {
        final int MAX = 200000000;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cityNum = Integer.parseInt(br.readLine());
        int busNum = Integer.parseInt(br.readLine());
        List<Bus>[] graph = new List[cityNum];
        for(int i = 0; i < cityNum; i++) {
            graph[i] = new ArrayList();
        }
        String[] input;
        for(int i = 0; i < busNum; i++) {
            input = br.readLine().split(" ");
            graph[Integer.parseInt(input[0]) - 1].add(new Bus(Integer.parseInt(input[1]) - 1, Integer.parseInt(input[2])));
        }

        input = br.readLine().split(" ");
        int start = Integer.parseInt(input[0]) - 1;
        int end = Integer.parseInt(input[1]) - 1;

        int[] result = new int[cityNum];
        for(int i = 0; i < cityNum; i++) {
            result[i] = MAX;
        }

        PriorityQueue<Bus> pq = new PriorityQueue();
        pq.add(new Bus(start, 0));
        result[start] = 0;
        boolean[] visited = new boolean[cityNum];
        Bus bus;
        while(!pq.isEmpty()) {
            bus = pq.poll();

            if(bus.city == end)
                break;

            if(visited[bus.city])
                continue;

            for(Bus b : graph[bus.city]) {
                if(result[b.city] > result[bus.city] + b.cost) {
                    result[b.city] = result[bus.city] + b.cost;
                    pq.add(new Bus(b.city, result[b.city]));
                }
            }

            visited[bus.city] = true;
        }

        System.out.println(result[end]);
    }
}
