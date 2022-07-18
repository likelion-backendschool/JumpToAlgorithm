package somang.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q6588 {
    /*
        [Baekjoon-6588]골드바흐의 추측
        ⏰ 276ms


        테스트 케이스 개수 : 0 입력하면 끝 → 100,000개 넘기지 않는다.
        출력 형식 : n = a + b → 여러 가지 방법이 있다면, b - a가 가장 큰 것 선택
                  두 홀수 소수의 합으로 n을 나타낼 수 없다면, "GoldBach's conjecture is wrong." 출력

        ❗️에라토스테네스의 체 : 소수 판별 알고리즘
         → 가장 먼저 소수를 판별할 범위만큼 배열을 할당하여, 해당하는 값에 넣어주고, 이후에 하나씩 지워나가는 방법

         1. 배열을 생성하여 초기화한다.
         2. 2부터 시작해서 특정 수의 배수에 해당하는 수를 모두 지운다.
            → 지울 때, 자기 자신은 지우지 않고, 이미 지워진 수는 건너뛴다.

     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        boolean[] prime = new boolean[1000001];

        prime[0] = prime[1] = true;

        for(int i = 2; i <= Math.sqrt(1000000); i++) {
            if(prime[i] == true) {
                continue;
            }
            for(int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }

        int num;
        boolean isGoldbachCorrect = false;
        while((num = Integer.parseInt(br.readLine())) > 0) {
            for(int i = 1; i <= num / 2 + 1; i += 2) {
                int primeNum1 = i;
                int primeNum2 = num - i;
                if(!prime[primeNum1] && !prime[primeNum2]) {
                    sb.append(num).append(" = ").append(primeNum1).append(" + ").append(primeNum2).append("\n");
                    isGoldbachCorrect = true;
                    break;
                }
            }

            if(!isGoldbachCorrect) {
                sb.delete(0, sb.length());
                sb.append("Goldbach's conjecture is wrong.");
                break;
            }
        }

        System.out.println(sb);

    }

}
