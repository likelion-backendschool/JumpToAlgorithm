package sangwon.week6;

import java.util.PriorityQueue;

public class P42626 {

    /*
    섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)
    Leo는 모든 음식의 스코빌 지수가 K 이상이 될 때까지 반복하여 섞습니다.
    Leo가 가진 음식의 스코빌 지수를 담은 배열 scoville과 원하는 스코빌 지수 K가 주어질 때, 모든 음식의 스코빌 지수를 K 이상으로 만들기 위해 섞어야 하는 최소 횟수를 return 하도록 solution 함수를 작성해주세요.
     */

    int Solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int x : scoville) {
            pq.add(x);
        }

        int ans = 0;

        while(true) {
            //모든 음식의 스코빌 지수를 K 이상으로 만들 수 없을 때
            if(pq.size() == 1 && pq.peek() < K) {
                ans = -1;
                break;
            }
            //모든 음식의 스코빌 지수가 k 이상이 됐을 때
            if(pq.peek() >= K) {
                break;
            }

            //스코빌 지수가 낮은 음식 섞고 카운트 증가
            pq.add(pq.poll() + pq.poll() * 2);
            ans++;
        }

        return ans;
    }

    public static void main(String[] args) {

        int scoville[] = {1, 2, 3, 9, 10, 12};
        int K = 7;

        System.out.println(new P42626().Solution(scoville, K));

    }
}
