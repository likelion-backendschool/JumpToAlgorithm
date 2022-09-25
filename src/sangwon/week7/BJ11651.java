package sangwon.week7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BJ11651 {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        //좌표 갯수
        int n = Integer.parseInt(br.readLine());
        //2차원배열 생성
        int arr[][] = new int[n][2];
        //input 처리
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        // y좌표가 증가하는 순으로, 같다면 x좌표가 증가하는 순으로
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                // y값이 다르다면 ? y값에 대한 오름차순 리턴, 같다면? x값에 대한 오름차순 리턴
                return o1[1]!=o2[1]? o1[1]-o2[1] : o1[0]-o2[0];
            }
        });
        //정답 출력
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < 2; j++) {
                sb.append(arr[i][j] + " ");
            }
            sb.append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
