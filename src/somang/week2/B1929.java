package somang.week2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1929 {
    /*
        [Baekjoon-1929]소수 구하기
        ⏰ 444ms

        M 이상 N 이하의 소수를 모두 출력하는 프로그램을 작성하시오
        → Q1978 소수 찾기 문제와 동일하게 풀었다.
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        for(int i = M; i <= N; i++) {
            if(isPrime(i)) {
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb);
    }

    static boolean isPrime(int num) {
        if(num == 1) return false;

        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) return false;
        }

        return true;
    }
}
