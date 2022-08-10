package sangwon.week5;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

//week5 Q2162 카드2
public class BJ2164 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();

        for(int i = 1; i <= n; i++){
            q.add(i);
        }

        while(q.size() != 1){
            q.poll();
            q.add(q.poll());
        }

        bw.write(q.peek()+"");
        bw.flush();
        bw.close();
        br.close();
    }
}
