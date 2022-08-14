package somang.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class B1676_1 {
    /*
        [Baekjoon-1676]팩토리얼 0의 개수
        ⏰ 80ms

        1. 먼저 N의 팩토리얼을 구한다.
           → N은 500까지 허용되기 때문에 BigInteger 사용해야 한다.
        2. 팩토리얼 구한 수에서 맨 뒤에서부터 0의 개수를 센다.
           → 처음 0이 아닌 숫자가 나올 때까지
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        BigInteger bi = new BigInteger("1");
        while(N > 0) {
            bi = bi.multiply(BigInteger.valueOf(N));
            N--;
        }

        String s = bi.toString();
        int count = 0;
        for(int i = s.length() - 1; i > 1; i--) {
            if(s.charAt(i) == '0') {
                count++;
            } else {
                break;
            }
        }
        System.out.println(count);
    }

}
