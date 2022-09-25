package somang.week7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B11651 {

    /*
        [Baekjoon-11651]좌표 정렬하기 2
        ⏰ 808ms
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int count = Integer.parseInt(br.readLine());
        int[][] array = new int[count][2];

        for (int i = 0; i < count; i++) {
            st = new StringTokenizer(br.readLine());
            array[i][0] = Integer.parseInt(st.nextToken());
            array[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(array, (o1, o2) -> {
            if (o1[1] == o2[1]) {
                return o1[0] - o2[0];
            } else {
                return o1[1] - o2[1];
            }
        });

        for (int i = 0; i < count; i++) {
            sb.append(array[i][0] + " " + array[i][1]).append("\n");
        }

        System.out.println(sb);
    }

}
