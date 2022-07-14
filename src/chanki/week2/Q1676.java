// 팩토리얼 0의 갯수
package chanki.week2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1676 {
    public static void main(String[] args) throws Exception{
        int num, temp;
        int cnt = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        num = Integer.parseInt(br.readLine());
        if(num == 0)
            num = 1;

        for(int i = 1; i <= num; i++) {
            temp = i;
            while(true) {
                if(temp % 5 == 0) {
                    temp /= 5;
                    cnt++;
                } else {
                    break;
                }
            }
        }

        bw.write(cnt + "");

        bw.flush();
        bw.close();
    }
}