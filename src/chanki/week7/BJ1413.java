package chanki.week7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BJ1413 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        ArrayList<String> words = new ArrayList<>();

        for(int i = 0; i < num; i++) {
            words.add(br.readLine());
        }

        Collections.sort(words, (o1, o2) -> {
            if(o1.length() < o2.length()) {
                return -1;
            } else if(o1.length() > o2.length()) {
                return 1;
            } else {
                int o1Sum = 0;
                int o2Sum = 0;
                for(int i = 0; i < o1.length(); i++) {
                    if(Character.isDigit(o1.charAt(i))) {
                        o1Sum += Character.getNumericValue(o1.charAt(i));
                    }
                    if(Character.isDigit(o2.charAt(i))) {
                        o2Sum += Character.getNumericValue(o2.charAt(i));
                    }
                }

                if(o1Sum < o2Sum) {
                    return -1;
                } else if(o1Sum > o2Sum) {
                    return 1;
                } else {
                    return o1.compareTo(o2);
                }
            }
        });

        StringBuilder sb = new StringBuilder();
        for(String word : words) {
            sb.append(word).append("\n");
        }

        System.out.println(sb);
    }
}
