// 10845번
package chanki.week1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q10845 {
    public static void main(String[] args) throws IOException {
        String str, command;
        Queue<Integer> queue = new LinkedList<Integer>();
        int cnt;
        int back = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        cnt = Integer.parseInt(br.readLine());
        for(int i = 0; i < cnt; i++) {
            str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            command = st.nextToken();
            if(command.equals("push")) {
                back = Integer.parseInt(st.nextToken());
                queue.add(back);
            } else if(command.equals("pop")) {
                if(queue.isEmpty())
                    System.out.println("-1");
                else
                    System.out.println(queue.remove());
            } else if(command.equals("size")) {
                System.out.println(queue.size());
            } else if(command.equals("empty")) {
                if(queue.isEmpty())
                    System.out.println("1");
                else
                    System.out.println("0");
            } else if(command.equals("front")) {
                if(queue.isEmpty())
                    System.out.println("-1");
                else
                    System.out.println(queue.peek());
            } else if(command.equals("back")) {
                if(queue.isEmpty())
                    System.out.println("-1");
                else
                    System.out.println(back);
            }
        }

        bw.flush();
        bw.close();
    }
}