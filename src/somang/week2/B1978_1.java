package somang.week2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1978_1 {
    /*
        [Baekjoon-1978]소수 찾기
        ⏰ 76ms

        이 문제에서는 시간 복잡도 O(N²)를 사용했지만,
        그래도 문제는 빠르게 풀렸다. → 테스트 케이스 수가 최대 100개이기 때문이라고 생각한다.
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 테스트 케이스 개수
        int N = Integer.parseInt(br.readLine());

        // 테스트 케이스 개수대로 배열에 넣어줌
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[st.countTokens()];
        if(st.hasMoreTokens()) {
            for(int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(prime(arr));
    }

    static int prime(int[] arr) {
        int result = 0;

        // 시간 복잡도 O(N²)
        for(int i = 0; i < arr.length; i++) {
            int count = 0;
            for(int j = 1; j <= arr[i]; j++) {
                if(arr[i] % j == 0) {
                    count++;
                }
            }
            if(count == 2) {
                result++;
            }
        }

        return result;
    }

}
