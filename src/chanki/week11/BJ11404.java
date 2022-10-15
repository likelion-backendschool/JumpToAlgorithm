// 플로이드 기본

package chanki.week11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ11404 {

    static final int MAX_VALUE = 1000000000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cityNum = Integer.parseInt(br.readLine());
        int busNum = Integer.parseInt(br.readLine());

        // initialization
        int[][] cities = new int[cityNum][cityNum];
        for(int i = 0; i < cityNum; i++) {
            for(int j = 0; j < cityNum; j++) {
                if(i == j) {
                    cities[i][j] = 0;
                } else {
                    cities[i][j] = MAX_VALUE;
                }
            }
        }

        String[] input;
        int start, end, value;
        for(int i = 0; i < busNum; i++) {
            input = br.readLine().split(" ");

            start = Integer.parseInt(input[0]);
            end = Integer.parseInt(input[1]);
            value = Integer.parseInt(input[2]);

            cities[start - 1][end - 1] = Math.min(value, cities[start - 1][end - 1]);
        }


        for(int k = 0; k < cityNum; k++) {
            for(int i = 0; i < cityNum; i++) {
                for(int j = 0; j < cityNum; j++) {
                    cities[i][j] = Math.min(cities[i][j], cities[i][k] + cities[k][j]);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < cityNum; i++) {
            for(int j = 0; j < cityNum; j++) {
                if(cities[i][j] == MAX_VALUE) {
                    sb.append(0).append(" ");
                } else {
                    sb.append(cities[i][j]).append(" ");
                }
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
