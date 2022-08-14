package chanki.week3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class B11052 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int targetCard = Integer.parseInt(br.readLine());

        List<Integer> cardPrices = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        ArrayList<Integer> maxCardPrices = new ArrayList<>();

        int max = 0;
        int compare;

        maxCardPrices.add(cardPrices.get(0));

        if(maxCardPrices.get(0) * 2 < cardPrices.get(1)) {
            maxCardPrices.add(cardPrices.get(1));
        } else {
            maxCardPrices.add(maxCardPrices.get(0) * 2);
        }

        for(int i = 2; i < cardPrices.size(); i++) {
            max = cardPrices.get(i);
            for(int j = 0; j < i - 1; j++) {
                compare = maxCardPrices.get(j) + maxCardPrices.get(i - 1 - j);
                if(max < compare) {
                   max = compare;
                }
            }
            maxCardPrices.add(max);
        }

        for(int i = cardPrices.size(); i < targetCard; i++) {
            for(int j = 0; j < Math.round((double)i / 2); j++) {
                compare = maxCardPrices.get(j) + maxCardPrices.get(i - 1 - j);
                if(max < compare) {
                    max = compare;
                }
            }
            maxCardPrices.add(max);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(maxCardPrices.get(targetCard - 1) + "");
        bw.flush();
        bw.close();
    }
}
