// 플로이드 연습

package chanki.week11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1956 {
    public static void main(String[] args) throws IOException {
        final int INF = 10000000;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] graphInfo = br.readLine().split(" ");
        int nodeNum = Integer.parseInt(graphInfo[0]);
        int edgeNum = Integer.parseInt(graphInfo[1]);

        int[][] graph = new int[nodeNum][nodeNum];
        for(int i = 0; i < nodeNum; i++) {
            for(int j = 0; j < nodeNum; j++) {
                if(i == j) {
                    graph[i][j] = 0;
                    continue;
                }
                graph[i][j] = INF;
            }
        }

        String[] edge = new String[3];
        for(int i = 0; i < edgeNum; i++) {
            edge = br.readLine().split(" ");
            graph[Integer.parseInt(edge[0]) - 1][Integer.parseInt(edge[1]) - 1] = Integer.parseInt(edge[2]);
        }

        for(int i = 0; i < nodeNum; i++) {
            for(int j = 0; j < nodeNum; j++) {
                for(int k = 0; k < nodeNum; k++) {
                    if(j == k)
                        continue;
                    graph[j][k] = Math.min(graph[j][k], graph[j][i] + graph[i][k]);
                }
            }
        }

        int min = INF;
        for(int i = 0; i < nodeNum; i++) {
            for(int j = 0; j < nodeNum; j++) {
                if(i == j)
                    continue;
                if(graph[i][j] < min && graph[j][i] < min) {
                    min = Math.min(min, graph[i][j] + graph[j][i]);
                }
            }
        }

        if(min == INF)
            min = -1;

        System.out.println(min);
    }
}
