// 스택수열
package chanki.week1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class B1874 {
    public static void main(String[] args) throws IOException {
        int cnt;
        int num = 1;
        boolean possible = true;
        List<String> answer = new ArrayList<String>();
        Stack stack = new Stack();
        Queue queue = new LinkedList<Integer>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        cnt = Integer.parseInt(br.readLine());

        for (int i = 0; i < cnt; i++) {
            queue.add(Integer.parseInt(br.readLine()));
        }

        while(!queue.isEmpty()) {
            if(stack.isEmpty()) {
                stack.push(num);
                num++;
                answer.add("+");
            }
            if(queue.peek().equals(stack.peek())) {
                queue.poll();
                stack.pop();
                answer.add("-");
            } else {
                stack.push(num);
                num++;
                answer.add("+");
            }
            if(num > cnt + 1) {
                possible = false;
                break;
            }
        }

        if(possible) {
            for(int i = 0; i < answer.size(); i++) {
                bw.write(answer.get(i) + "\n");
            }
        } else {
            bw.write("NO");
        }


        bw.flush();
        bw.close();
    }
}