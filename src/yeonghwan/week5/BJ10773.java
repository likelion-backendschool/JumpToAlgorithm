package yeonghwan.week5;

import java.util.Stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BJ10773 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> stack = new Stack<Integer>();

        int K = Integer.parseInt(br.readLine());

        for(int i = 0; i < K; i++) {
            int number = Integer.parseInt(br.readLine());

            if(number == 0) {
                stack.pop();
            }
            else {
                stack.add(number);
            }
        }
        int sum = 0;

        for(int o : stack) {
            sum += o;
        }

        System.out.println(sum);
    }

}