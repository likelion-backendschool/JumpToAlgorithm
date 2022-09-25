package jongsoo.week5;
import java.io.BufferedReader;
import java.io.IOException;



public class BJ17436{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] list = new int[N];
        int count = 0;
        int N = Integer.parseInt(st.nextToken());
        long M = Long.parseLong(st.nextToken());

        StringTokenizer sto = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++) {

            list[i] = Integer.parseInt(sto.nextToken());
        }

        for(int j = 1; j <= M; j++) {
            for(int k = 0; k < N; k++) {
                if(j % list[k] == 0) {
                    count++;
                    break;
                }
            }

        }
        System.out.println(count);
    }
}