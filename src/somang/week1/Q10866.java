package somang.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Q10866 {

    /*
        [Baekjoon-10866]덱
        ⏰ 144ms
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new ArrayDeque<>();
        for(int i = 0; i < N; i++) {
            String str = br.readLine();
            if(str.contains(" ")) {
                st = new StringTokenizer(str, " ");
                String s = st.nextToken();
                if(s.equals("push_front")) {
                    int x = Integer.parseInt(st.nextToken());
                    deque.addFirst(x);
                }
                else if(s.equals("push_back")) {
                    int x = Integer.parseInt(st.nextToken());
                    deque.addLast(x);
                }
            }
            else if(str.equals("pop_front")) {
                if(deque.isEmpty()) sb.append(-1).append("\n");
                else sb.append(deque.removeFirst()).append("\n");
            }
            else if(str.equals("pop_back")) {
                if(deque.isEmpty()) sb.append(-1).append("\n");
                else sb.append(deque.removeLast()).append("\n");
            }
            else if(str.equals("size")) {
                sb.append(deque.size()).append("\n");
            }
            else if(str.equals("empty")) {
                if(deque.isEmpty()) sb.append(1).append("\n");
                else sb.append(0).append("\n");
            }
            else if(str.equals("front")) {
                if(deque.isEmpty()) sb.append(-1).append("\n");
                else sb.append(deque.getFirst()).append("\n");
            }
            else if(str.equals("back")) {
                if(deque.isEmpty()) sb.append(-1).append("\n");
                else sb.append(deque.getLast()).append("\n");
            }
        }
        System.out.println(sb);
        br.close();
    }

}
