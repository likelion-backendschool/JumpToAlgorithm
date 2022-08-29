package jongsoo.week6;

import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     StringTokenizer st = new StringTokenizer(br.readLine());

     int N = Integer.parseInt(st.nextToken());
     int M = Integer.parseInt(st.nextToken());
     int cnt = 0;

     HashMap<String, Integer> map = new HashMap<>();

     for (int i = 0; i < N; i++) {
      map.put(br.readLine(), 0);
     }

     for (int i = 0; i < M; i++) {
       String str = br.readLine();
       if (map.get(str) != null)
       cnt++;
     }

      System.out.print(cnt);
 }
}