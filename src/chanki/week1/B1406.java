// 에디터
package chanki.week1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class B1406 {
    public static void main(String[] args) throws IOException {
        int command_num;
        String input, command;
        Stack leftStack = new Stack();
        Stack rightStack = new Stack();

        ArrayList str = new ArrayList();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        input = br.readLine();
        command_num = Integer.parseInt(br.readLine());

        for(int i = 0; i < input.length(); i++) {
            leftStack.push(input.charAt(i));
        }

        for(int i = 0; i < command_num; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            command = st.nextToken();
            if(command.equals("L")) {
                if(!leftStack.isEmpty()) {
                    rightStack.push(leftStack.pop());
                }
            } else if(command.equals("D")) {
                if(!(rightStack.isEmpty())) {
                    leftStack.push(rightStack.pop());
                }
            } else if(command.equals("B")) {
                if(!leftStack.isEmpty()) {
                    leftStack.pop();
                }
            } else if(command.equals("P")) {
                leftStack.push(st.nextToken());
            }
        }

        while(!leftStack.isEmpty())
            rightStack.push(leftStack.pop());

        while(!rightStack.isEmpty())
            bw.write(rightStack.pop() + "");

        bw.flush();
        bw.close();
    }
}