package somang.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Q17436 {

    /*
        [Baekjoon-17436]소수의 배수
        ⏰ 시간초과ms
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        long[] prime = new long[Integer.parseInt(st.nextToken())];
        long M = Long.parseLong(st.nextToken());

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < prime.length; i++) {
            prime[i] = Long.parseLong(st.nextToken());
        }

        Set<Long> set = new HashSet<>();
        for(long i = 1; i <= M; i++) {
            for(int j = 0; j < prime.length; j++) {
                if(i % prime[j] == 0) {
                    set.add(i);
                    break;
                }
            }
        }

        System.out.println(set.size());
    }

}
