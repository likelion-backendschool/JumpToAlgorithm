package somang.week2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1978_2 {
    /*
        [Baekjoon-1978]소수 찾기
        ⏰ 76ms

        시간 복잡도 O(N√N)

        제곱근을 이용한 기본 판별법
        소수 → 1과 자기 자신만을 약수로 가져야 한다.

        example
        12를 A * B의 합성수이다. → (1 ≤ A, B < 12)
        12는 A * B에서 A와 B 중 적어도 하나는 12의 제곱근보다 작거나 같다.

        12의 약수 : 1, 2, 3, 4, 6, 12
        1 * 12 | 2 * 6 | 3 * 4

        12의 제곱근 이상의 수로 나누면?
        1. 이전의 검사한 수 중 약수인 수를 약수로 갖는다.
        2. 약수가 아니다.

        따라서 소수를 판별할 때 굳이 12 - 1까지가 아닌 12의 제곱근까지만 검사하면 된다.
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 테스트 케이스 개수
        int N = Integer.parseInt(br.readLine());

        // 테스트 케이스 개수대로 배열에 넣어줌
        st = new StringTokenizer(br.readLine());

        // 소수의 개수
        int count = 0;
        while(st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            if(isPrime(num)) {
                count++;
            }
        }

        System.out.println(count);
    }

    static boolean isPrime(int num) {
        if(num == 1) return false;

        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) return false;
        }

        return true;
    }

}
