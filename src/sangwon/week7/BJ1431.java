package sangwon.week7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;


public class BJ1431 {

    // 자릿수의 합을 리턴
    static int addNumber(String str) {
        int num = 0;

        for(int i = 0; i < str.length(); i++) {
            try {
                num += Integer.parseInt(str.substring(i, i+1));
            }
            catch (NumberFormatException e ) {
                continue;
            }
        }

        return num;

    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        String arr[] = new String[n];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 비교대상들의 길이가 다르면, 짧은 길이로 비교하고 길이가 같을 때, 자릿수의 합이 다르면 자릿수의 합으로 비교하고 둘 다 아니라면, 기본 정렬을 사용해라
                return o1.length() != o2.length()? o1.length() - o2.length() : addNumber(o1) != addNumber(o2) ? addNumber(o1) - addNumber(o2) : o1.compareTo(o2);
            }
        });

        for(String x : arr) {
            bw.write(x+"\n");
        }

        bw.flush();
        bw.close();
        br.close();




    }
}
