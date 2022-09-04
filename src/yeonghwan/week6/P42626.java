package yeonghwan.week6;

import java.util.PriorityQueue;

class P42626 {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(scoville.length);

        for(int num : scoville)
            queue.add(num);

        while(queue.size()>1) {
            if(queue.peek()>=K) return answer;
            int least = queue.poll();
            int second_least = queue.poll();
            queue.add(least + (second_least * 2));
            answer++;
        }

        if(queue.peek()<K) return -1;

        return answer;
    }
}

