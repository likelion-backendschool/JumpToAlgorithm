package yeonghwan.week5;

import java.util.ArrayDeque;
import java.util.Queue;

public class P42583 {
        public int P42583(int bridge_length, int weight, int[] truck_weights) {
            Queue<Integer> bridge = new ArrayDeque<>();

            for(int i = 0; i < bridge_length - 1; i++) {
                bridge.add(0);
            }
            int currentWeights = truck_weights[0];
            bridge.add(currentWeights);
            int index = 1;
            int answer = 1;

            while (!bridge.isEmpty()){
                answer++;

                int truck = bridge.poll();
                currentWeights -= truck;

                if(index < truck_weights.length){
                    if(currentWeights + truck_weights[index] <= weight){
                        currentWeights += truck_weights[index];
                        bridge.add(truck_weights[index++]);
                    } else {
                        bridge.add(0);
                    }
                }
            }
            return answer;
        }
}


