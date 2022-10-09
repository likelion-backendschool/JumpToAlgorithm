package jongsoo.week9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BJ24479 {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static int check[];
    static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        check = new int[n + 1];

        for (int i = 0; i < n + 1; i++) {
            graph.add(new ArrayList<Integer>());
        }

        // 리스트에 노드와 연결된 노드번호들을 저장하기
        while (m-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        // 오름차순 정렬
        for (int i = 1; i < graph.size(); i++) {
            Collections.sort(graph.get(i));
        }

        cnt = 1;
        bfs(r);

        for (int i = 1; i < check.length; i++) {
            sb.append(check[i]).append("\n");
        }
        System.out.println(sb);

    }

    private static void bfs(int node) {
        check[node] = cnt;
        LinkedList<Integer> q = new LinkedList<>();
        q.offer(node);

        while (!q.isEmpty()) {
            int num = q.poll();
            for (int i = 0; i < graph.get(num).size(); i++) {
                int newNode = graph.get(num).get(i);
                if (check[newNode] == 0) {
                    cnt++;
                    check[newNode] = cnt;
                    q.offer(newNode);
                }
            }
        }
    }
}