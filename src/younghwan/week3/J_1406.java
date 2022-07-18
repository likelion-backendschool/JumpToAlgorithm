package Study.one;

import java.util.*;
import java.io.*;
public class J_1406 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str=bf.readLine();
        int n = Integer.parseInt(bf.readLine());

        Stack<Character> left=new Stack<Character>();
        Stack<Character> right=new Stack<Character>();
        for(int i=0;i<str.length();i++) {
            left.push(str.charAt(i));
        }

        for(int j=0;j<n;j++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            String str1=st.nextToken();
            char ch1=str1.charAt(0);
            if(ch1=='P') {
                String str2=st.nextToken();
                char ch2=str2.charAt(0);
                left.push(ch2);
            }
            else if(ch1=='L') {
                if(!left.isEmpty()) {
                    right.push(left.peek());
                    left.pop();
                }
            }
            else if(ch1=='D') {
                if(!right.isEmpty()) {
                    left.push(right.peek());
                    right.pop();
                }
            }
            else if(ch1=='B') {
                if(!left.isEmpty())
                    left.pop();
            }
        }

        while(!right.isEmpty()) {
            left.push(right.pop());
        }


        for(Character c:left)
            bw.write(c);
        bw.close();//스트림을 닫음
    }

}