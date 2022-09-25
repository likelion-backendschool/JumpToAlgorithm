package jongsoo.week7;

import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;


public class BJ1431 {

        public int size;
        public int sum;
        public String serial;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Serial> pq = new PriorityQueue<>(new Comparator<Serial>() {
            @Override
            public int compare(Serial o1, Serial o2) {
                if (o1.size < o2.size)
                    return -1;
                else if (o1.size == o2.size) {
                    if (o1.sum < o2.sum)
                        return -1;
                    else if (o1.sum == o2.sum) {
                        return o1.serial.compareTo(o2.serial);
                    } else
                        return 1;
                } else
                    return 1;
            }
        });

        bw.flush();
    }
}

