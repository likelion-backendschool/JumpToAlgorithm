// 다익스트라 기본
// PQ - 인접행렬
package chanki.week11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class BJ1753 {
    static final int MAX = 1000000;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int nodeNum = Integer.parseInt(inputs[0]);
        int edgeNum = Integer.parseInt(inputs[1]);
        int vertex = Integer.parseInt(br.readLine()) - 1;

        // initialization
        int[] result = new int[nodeNum];
        Boolean[] visited = new Boolean[nodeNum];
        List<Edge>[] graph = new List[nodeNum];
        for(int i = 0; i < nodeNum; i++) {
            graph[i] = new ArrayList();
            result[i] = MAX;
            visited[i] = false;
        }

        String[] edge;
        int start, end, distance;
        for(int i = 0; i < edgeNum; i++) {
            edge = br.readLine().split(" ");
            start = Integer.parseInt(edge[0]);
            end = Integer.parseInt(edge[1]);
            distance = Integer.parseInt(edge[2]);

            graph[start - 1].add(new Edge(end - 1, distance));
        }

        // dijkstra
        Edge pop;
        PriorityQueue<Edge> pq = new PriorityQueue();
        result[vertex] = 0;
        pq.add(new Edge(vertex, 0));
        while(!pq.isEmpty()) {
            pop = pq.poll();
            if(visited[pop.node])
                continue;

            for(Edge e : graph[pop.node]) {
                if(visited[e.node])
                    continue;
                if(result[e.node] > result[pop.node] + e.distance) {
                    result[e.node] = result[pop.node] + e.distance;
                    pq.add(new Edge(e.node, result[e.node]));
                }
            }
            visited[pop.node] = true;
        }

        // print
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < nodeNum; i++) {
            if(result[i] == MAX) {
                sb.append("INF").append("\n");
            } else {
                sb.append(result[i]).append("\n");
            }
        }
        System.out.println(sb);
    }

    static class Edge implements Comparable<Edge> {
        int node;
        int distance;

        public Edge(int node, int distance) {
            this.node = node;
            this.distance = distance;
        }

        @Override
        public int compareTo(Edge o) {
            return this.distance - o.distance;
        }
    }
}

