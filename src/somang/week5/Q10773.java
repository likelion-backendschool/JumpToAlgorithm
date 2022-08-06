package somang.week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q10773 {

    /*
        [Baekjoon-10773]제로
        ⏰ 252ms
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < K; i++) {
            int count = Integer.parseInt(br.readLine());

            if(count == 0) {
                stack.pop();
                continue;
            }

            stack.push(count);
        }

        int sum = 0;
        while(!stack.empty()) {
            sum += stack.pop();
        }

        System.out.println(sum);
    }

}
