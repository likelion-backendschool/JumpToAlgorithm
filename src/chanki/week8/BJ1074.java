package chanki.week8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1074 {
    static int r;
    static int c;
    static int cnt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        r = Integer.parseInt(input[1]);
        c = Integer.parseInt(input[2]);

        int length = (int) Math.pow(2, n);

        int x = 0;
        int y = 0;
        cnt = 0;
        recursive(length, x, y);
    }

    static boolean recursive(int length, int x, int y) {
        if(length == 2) {
            for(int i = x; i < x + 2; i++) {
                for(int j = y; j < y + 2; j++) {
                    if(i == r && j == c) {
                        System.out.println(cnt);
                        return true;
                    }
                    cnt++;
                }
            }
            return false;
        }

        length /= 2;

        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                if((r < x + (i + 1) * length) && (c < y + (j + 1) * length)) {
                    if(recursive(length, x + i * length, y + j * length)) {
                        return true;
                    }
                } else {
                    cnt += length * length;
                }
            }
        }

        return false;
    }
}
