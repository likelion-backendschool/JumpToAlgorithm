package somang.week5;

import java.util.LinkedList;
import java.util.Queue;

public class P42583 {

    /*
        [Programmers-42583]다리를 지나는 트럭
     */

    public static void main(String[] args) {
        System.out.println(new P42583().solution(2, 10, new int[]{7, 4, 5, 6}));
    }

    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> queue = new LinkedList<>();
        int sum = 0;
        int time = 0;

        for(int i = 0; i < truck_weights.length; i++) {
            int truck = truck_weights[i];

            while(true) {
                // 큐에 아무것도 없는 경우 == 트럭이 하나도 다리 위에 없는 경우
                if(queue.isEmpty()) {
                    queue.add(truck);
                    sum += truck;
                    time++; // 다리에 오를 때만 시간 추가
                    break;
                }

                // 큐에 다리 길이만큼 트럭에 다 찬 경우
                else if(queue.size() == bridge_length) {
                    sum -= queue.poll();
                }

                // 다리 길이만큼 큐가 차지 않았을 경우
                else {
                    // weight 값을 넘지 않는 선에서 새로운 트럭에 다리에 올려준다.
                    if(sum + truck <= weight) {
                        queue.add(truck);
                        sum += truck;
                        time++;
                        break;
                    }

                    // 넘는다면 0을 넣어 이미 큐에 있는 트럭이 다리를 건너게 만든다.
                    queue.add(0);
                    time++;
                }
            }
        }

        // 마지막 트럭에 반복문이 끝나는데, 마지막 역시 다리 길이만큼 지나가야 한다. + 다리 길이
        int answer = time + bridge_length;

        return answer;
    }

}
