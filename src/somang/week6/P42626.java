package somang.week6;

import somang.week5.P42583;

import java.util.PriorityQueue;

public class P42626 {

    /*
        [Programmers-42626]더 맵게
     */

    public static void main(String[] args) {
        System.out.println(new P42626().solution(new int[]{1, 2, 3, 9, 10, 12}, 7));
    }

    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        int answer = 0;

        for (int i : scoville) {
            heap.add(i);
        }

        while (heap.peek() < K) {
            if (heap.size() == 1)
                return -1;
            heap.add(heap.poll() + heap.poll() * 2);
            answer++;
        }

        return answer;
    }

}
