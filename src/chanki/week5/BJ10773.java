package chanki.week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJ10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int line = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack();
        int input;

        for(int i = 0; i <line; i++) {
            input = Integer.parseInt(br.readLine());
            if(input == 0) {
                stack.pop();
            } else {
                stack.add(input);
            }
        }

        long sum = 0;
        while(!stack.isEmpty()) {
            sum += stack.pop();
        }

        System.out.println(sum);
    }
}
