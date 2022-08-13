package somang.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B1406 {

    /*
        [Baekjoon-1406]에디터
        ⏰ 624ms
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        int M = Integer.parseInt(br.readLine());

        Stack<String> leftSt = new Stack<>();
        Stack<String> rightSt = new Stack<>();

        String[] arr = str.split("");

        for(String s : arr) {
            leftSt.push(s);
        }

        for(int i = 0; i < M; i++) {
            String command = br.readLine();
            char c = command.charAt(0);

            switch (c) {
                case 'L' :
                    if(leftSt.size() > 0) {
                        rightSt.push(leftSt.pop());
                    }
                    break;
                case 'D' :
                    if(rightSt.size() > 0) {
                        leftSt.push(rightSt.pop());
                    }
                    break;
                case 'B' :
                    if(leftSt.size() > 0) {
                        leftSt.pop();
                    }
                    break;
                case 'P' :
                    char t = command.charAt(2);
                    leftSt.push(String.valueOf(t));
                    break;
                default :
                    break;
            }
        }

        while(leftSt.size() > 0) {
            rightSt.push(leftSt.pop());
        }
        while(rightSt.size() > 0) {
            sb.append(rightSt.pop());
        }
        System.out.println(sb);
        br.close();
    }

}
