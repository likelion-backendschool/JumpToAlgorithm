package somang.week1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9093 {

    /*
        [Baekjoon-9093]단어 뒤집기
        ⏰ 400ms
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            String[] sentence = br.readLine().split(" ");
            for(String word: sentence) {
                sb.append(new StringBuilder(word).reverse().toString()).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
        br.close();
    }

}
