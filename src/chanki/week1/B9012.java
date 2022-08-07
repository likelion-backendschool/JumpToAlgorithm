// 괄호
package chanki.week1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class B9012 {
    public static void main(String[] args) throws IOException {
        String str;
        char character;
        Stack stack = new Stack();
        int cnt;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        cnt = Integer.parseInt(br.readLine());
        for(int i = 0; i < cnt; i++) {
            str = br.readLine();
            for(int j = 0; j < str.length(); j++) {
                character = str.charAt(j);
                if(character == '(') {
                    stack.push(character);
                } else {
                    if(stack.isEmpty()) {
                        bw.write("NO\n");
                        break;
                    } else {
                        stack.pop();
                    }
                }
                if(j == str.length() - 1) {
                    if(stack.isEmpty()) {
                        bw.write("YES\n");
                    } else {
                        bw.write("NO\n");
                        stack.clear();
                    }
                }
            }
        }

        bw.flush();
        bw.close();
    }
}