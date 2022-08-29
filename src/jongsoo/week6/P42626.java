import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int answer = 0;

        for (int i = 0; i < scoville.length; i++) {
            pq.offer(scoville[i]);
        }

        while (!pq.isEmpty()) {
            int current = pq.poll();

            if (current < K) {
                if (pq.size() == 0) {
                    return -1;
                }
                int next = pq.poll();
                int sum = current + next * 2;
                pq.offer(sum);
                answer++;

            }
        }
        return answer;
    }
}
/*
풀이

1. 스코빌지수는 항상 오르차순으로 관리되어야함.(Priority Queue)
2. 가장 낮은 스코빌 지수가 K보다 작을 경우 로직을 수행한다
3. pq에서 가장 낮은 지수와 그 다음 낮은 지수를 꺼내 연산 후 다시 넣기.
4. pq에 1개의 지수만 남았는데도 K보다 작을 경우 더 이상 수행이 불가능한 것으로 판단해 -1을 리턴해 종료시킨다.
*/