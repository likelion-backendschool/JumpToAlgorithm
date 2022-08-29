package chanki.week7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BJ11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());

        List<Cordinator> cordinators = new ArrayList<>();

        for(int i = 0; i < testCase; i++) {
            String[] input = br.readLine().split(" ");
            Cordinator cordinator = new Cordinator(Integer.parseInt(input[0]), Integer.parseInt(input[1]));
            cordinators.add(cordinator);
        }

        Collections.sort(cordinators);

        StringBuffer sb = new StringBuffer();
        for(Cordinator c : cordinators) {
            sb.append(c.x + " " + c.y + "\n");
        }
        System.out.println(sb);
    }
}

class Cordinator implements Comparable<Cordinator> {
    int x;
    int y;

    public Cordinator(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Cordinator o) {
        if(this.y > o.y) {
            return 1;
        } else if(this.y < o.y) {
            return -1;
        } else {
            if(this.x > o.x) {
                return 1;
            } else if(this.x < o.x) {
                return -1;
            }
        }
        return 0;
    }
}
