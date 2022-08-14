package somang.week1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B9012 {

    /*
        [Baekjoon-9012]괄호
        ⏰ 80ms
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            sb.append(solve(br.readLine())).append("\n");
        }
        System.out.println(sb);
        br.close();
    }

    public static String solve(String ps) {
        Stack<Character> stack = new Stack<>();

        for(char c : ps.toCharArray()) {
            if(c == '(') {
                stack.push(c);
            }

            else if(stack.empty()) {
                return "NO";
            }

            else if(c == ')') {
                stack.pop();
            }
        }

        if(stack.empty()) {
            return "YES";
        } else {
            return "NO";
        }
    }

}
