package chanki.week10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BJ24444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int nodeNum = Integer.parseInt(inputs[0]);
        int lineNum = Integer.parseInt(inputs[1]);
        int vertexValue = Integer.parseInt(inputs[2]);

        ArrayList<Integer>[] graph = new ArrayList[nodeNum + 1];
        for(int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        String[] connection;
        int firstValue, secondValue;
        for(int i = 0; i < lineNum; i++) {
            connection = br.readLine().split(" ");
            firstValue = Integer.parseInt(connection[0]);
            secondValue = Integer.parseInt(connection[1]);

            graph[firstValue].add(secondValue);
            graph[secondValue].add(firstValue);
        }

        Queue<Integer> queue = new LinkedList<>();
        Boolean[] visited = new Boolean[nodeNum + 1];
        for(int i = 0; i < visited.length; i++) {
            visited[i] = false;
        }
        queue.add(vertexValue);
        visited[vertexValue] = true;
        int pop;
        int cnt = 1;
        int[] order = new int[nodeNum + 1];
        while(!queue.isEmpty()) {
            pop = queue.poll();
            order[pop] = cnt;
            graph[pop].stream()
                    .filter(n -> !visited[n])
                    .sorted()
                    .forEach(n -> {
                        queue.add(n);
                        visited[n] = true;
                    });
            cnt++;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= nodeNum; i++) {
            sb.append(order[i]).append("\n");
        }

        System.out.println(sb);
    }
}
