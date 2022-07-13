// 덱
package chanki.week1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Q10866 {
    public static void main(String[] args) throws IOException {
        String command, str;
        int cnt;
        Deque<Integer> deque = new LinkedList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        cnt = Integer.parseInt(br.readLine());
        for(int i = 0; i < cnt; i++) {
            str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            command = st.nextToken();
            if(command.equals("push_front")) {
                deque.addFirst(Integer.parseInt(st.nextToken()));
            } else if(command.equals("push_back")) {
                deque.addLast(Integer.parseInt(st.nextToken()));
            } else if(command.equals("pop_front")) {
                if(deque.isEmpty())
                    bw.write("-1\n");
                else
                    bw.write(deque.pollFirst().toString() + "\n");
            } else if(command.equals("pop_back")) {
                if(deque.isEmpty())
                    bw.write("-1\n");
                else
                    bw.write(deque.pollLast().toString()  + "\n");
            } else if(command.equals("size")) {
                bw.write(deque.size() + "\n");
            } else if(command.equals("empty")) {
                if(deque.isEmpty())
                    bw.write("1\n");
                else
                    bw.write("0\n");
            } else if(command.equals("front")) {
                if(deque.isEmpty())
                    bw.write("-1\n");
                else
                    bw.write(deque.getFirst().toString() + "\n");
            } else if(command.equals("back")) {
                if(deque.isEmpty())
                    bw.write("-1\n");
                else
                    bw.write(deque.getLast().toString() + "\n");
            }
        }

        bw.flush();
        bw.close();
    }
}