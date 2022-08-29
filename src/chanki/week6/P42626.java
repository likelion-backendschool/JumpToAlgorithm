package chanki.week6;

import java.util.NoSuchElementException;
import java.util.PriorityQueue;

/*

PriorityQueue는 정렬을 보장하지 않는다.
가장 초기에만 정렬된 상태이고, 이후 add()나 poll()등의 명령어를 실행하면 정렬이 되지 않은 상태일 수 있다.
https://stackoverflow.com/questions/1871253/updating-java-priorityqueue-when-its-elements-change-priority

*/

public class P42626 {
    public static void main(String[] args) {
        System.out.println(new P42626().solution(new int[]{1, 1, 1, 1, 1, 1, 2}, 7));
    }
    public int solution(int[] scoville, int K) {

        // 초기화
        PriorityQueue<Integer> queue = initialize(scoville);

        int leastScoville, lessScoville;
        int cnt = 0;

        // 횟수 계산
        while(queue.peek() < K) {

            try {
                leastScoville = queue.poll();
                lessScoville = queue.poll();
            } catch (NoSuchElementException e) {
                cnt = -1;
                break;
            }

            queue.offer(leastScoville + lessScoville * 2);

            cnt++;
        }

        return cnt;
    }

    public PriorityQueue<Integer> initialize(int[] arr) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for(int i = 0; i < arr.length; i++) {
            priorityQueue.offer(arr[i]);
        }

        return priorityQueue;
    }
}
