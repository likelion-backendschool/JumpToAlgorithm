// 단어 뒤집기
package chanki.week1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Q9093 {
    public static void main(String[] args) throws IOException {
        String str;
        Stack stack = new Stack();
        int cnt, size;
        char temp;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        cnt = Integer.parseInt(br.readLine());
        for(int i = 0; i < cnt; i++) {
            str = br.readLine();
            for(int j = 0; j < str.length(); j++) {
                temp = str.charAt(j);
                if(temp == ' ') {
                    size = stack.size();
                    for(int k = 0; k < size; k++) {
                        bw.write(stack.pop().toString());
                    }
                    bw.write(" ");
                } else {
                    stack.push(str.charAt(j));
                }
            }
            while(!stack.isEmpty()) {
                bw.write(stack.pop().toString());
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}