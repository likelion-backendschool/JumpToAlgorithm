// 팩토리얼
package chanki.week2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BJ10872 {
    public static void main(String[] args) throws Exception{
        int num;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        num = Integer.parseInt(br.readLine());
        if(num == 0)
            num = 1;

        for(int i = (num - 1); i > 1; i--) {
            num *= i;
        }

        bw.write(num + "");

        bw.flush();
        bw.close();
    }
}
