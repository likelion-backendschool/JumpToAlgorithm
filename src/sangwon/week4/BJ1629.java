package sangwon.week4;

import java.io.*;
import java.util.StringTokenizer;

public class BJ1629 {

    static long calc(int a, int b, int c){

        if(b == 1) return a % c;

        long ans = calc(a, b/2, c);
        ans = ans * ans % c;

        if(b % 2 == 0) return ans;

        return ans * a % c;

    }

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        /*
            a 를 b번 곱한 후 c로 나눈다
            => a를 b/2번 곱한 후 c로 나눈다...
            => a를 b/4번 곱한 후 c로 나눈다...
            => a mod x 는 a^2 mod x의 1/2
            => a가 홀수라면 ? a를 곱한 후 1/2를 하면 되지 않을 까 ...
         */
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        bw.write(calc(a,b,c)+"");
        bw.flush();
        bw.close();


    }
}
