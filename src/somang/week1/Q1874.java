package somang.week1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q1874 {

    /*
        [Baekjoon-1874]스택수열
        ⏰ 316ms
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        int start = 0;

        for(int i = 0; i < N; i++) {
            int value = Integer.parseInt(br.readLine());

            if(value > start) {
                for(int j = start + 1; j <= value; j++) {
                    stack.push(j);
                    sb.append("+").append("\n");
                }
                start = value;
            }

            else if(stack.peek() != value) {
                System.out.println("NO");
                return;
            }

            stack.pop();
            sb.append("-").append("\n");
        }
        System.out.println(sb);
        br.close();
    }

}
