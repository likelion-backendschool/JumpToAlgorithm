package jongsoo.week9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

import java.io.*;
import java.util.*;

public class BJ24444 {

    static ArrayList<ArrayList<Integer>> graph;
    static int[] seq;
    static boolean[] visited;

    public static void bfs(int root) {

        seq[root] = 1;
        visited[root] = true;
        int cnt = 2;

        Queue<Integer> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()) {
            int cur = q.poll();
            for (int v : graph.get(cur)) {
                if (!visited[v]) {
                    seq[v] = cnt++;
                    visited[v] = true;
                    q.offer(v);
                }
            }
        }

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());

        graph = new ArrayList<>();
        seq = new int[n+1];
        visited = new boolean[n+1];

        for (int i = 0; i <=n; i++)
            graph.add(new ArrayList<>());

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        for (int i = 1; i <=n; i++)
            Collections.sort(graph.get(i));

        bfs(start);

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++)
            sb.append(seq[i] + "\n");

        System.out.println(sb);

    }
}