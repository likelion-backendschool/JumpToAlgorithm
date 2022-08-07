package chanki.week3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class B16194 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int targetCard = Integer.parseInt(br.readLine());

        List<Integer> cardPrices = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        ArrayList<Integer> minCardPrices = new ArrayList<>();

        int min = 0;
        int compare;

        minCardPrices.add(cardPrices.get(0));

        if(minCardPrices.get(0) * 2 < cardPrices.get(1)) {
            minCardPrices.add(minCardPrices.get(0) * 2);
        } else {
            minCardPrices.add(cardPrices.get(1));
        }

        for(int i = 2; i < cardPrices.size(); i++) {
            min = cardPrices.get(i);
            for(int j = 0; j < i - 1; j++) {
                compare = minCardPrices.get(j) + minCardPrices.get(i - 1 - j);
                if(min > compare) {
                    min = compare;
                }
            }
            minCardPrices.add(min);
        }

        for(int i = cardPrices.size(); i < targetCard; i++) {
            for(int j = 0; j < Math.round((double)i / 2); j++) {
                compare = minCardPrices.get(j) + minCardPrices.get(i - 1 - j);
                if(min > compare) {
                    min = compare;
                }
            }
            minCardPrices.add(min);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(minCardPrices.get(targetCard - 1) + "");
        bw.flush();
        bw.close();
    }
}
