package chanki.week4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class B1629 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> input = Arrays.stream(br.readLine().split(" ")).map((num -> Integer.parseInt(num))).collect(Collectors.toList());
        int a = input.get(0); // 나눠지는 수
        int b = input.get(1); // 횟수
        int c = input.get(2); // 나누는 수
        int result = a % c; // 결과
        int multi = a % c; // 중간 계산
        int tempResult;

        for(int i = 0; i < b; i++) {
            tempResult = (result * multi) % c;
            if(result == tempResult || tempResult == 0 ) {
                result = tempResult;
                break;
            }
            result = tempResult;
        }
        bw.write(result + "");
        bw.flush();
        bw.close();
    }
}