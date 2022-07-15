package somang.week1;


import java.io.*;

public class Q10828 {

    /*
        [Baekjoon-10828]스택
        ⏰ 120ms
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String[] stack = new String[N];
        int size = 0;

        for(int i = 0; i < N; i++) {
            String command = br.readLine();
            if(command.contains("push")) {
                stack[size] = command.substring(5);
                size++;
            }
            else if(command.equals("pop")) {
                if(size == 0) {
                    bw.write("-1\n");
                } else {
                    bw.write(stack[size - 1]);
                    bw.newLine();
                    size--;
                }
            }
            else if(command.equals("size")) {
                bw.write(String.valueOf(size));
                bw.newLine();
            }
            else if(command.equals("empty")) {
                if(size == 0) {
                    bw.write("1\n");
                } else {
                    bw.write("0\n");
                }
            }
            else if(command.equals("top")) {
                if(size == 0 ){
                    bw.write("-1\n");
                } else {
                    bw.write(stack[size - 1]);
                    bw.newLine();
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }

}
