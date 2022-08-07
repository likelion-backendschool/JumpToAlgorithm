package chanki.week5;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class P42583 {
    public static void main(String[] args) {
        System.out.println(new P42583().solution(2, 10, new int[]{7, 4, 5, 6}));
    }
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int time = 0;

        Queue<Integer> waitTruck;
        waitTruck = waitTruckInit(truck_weights);

        int[] bridgeTruck = bridgeTruckInit(bridge_length);
        int bridgeWeight = 0;
        long bridgeTruckCnt = 0;

        while(!waitTruck.isEmpty()) {
            // 다리 내에서 이동
            if(bridgeTruckCnt != 0) {
                bridgeTruck = moveTruck(bridgeTruck);
            }

            bridgeTruckCnt = Arrays.stream(bridgeTruck).filter(truck -> truck != 0).count();

            // 다리 무게 계산
            bridgeWeight = 0;
            for(int truck: bridgeTruck) {
                bridgeWeight += truck;
            }

            // 한 대 더 올릴 수 있는지 확인 및 처리
            if(bridgeWeight < weight) {
                if(waitTruck.peek() + bridgeWeight <= weight) {
                    bridgeTruck[0] = waitTruck.poll();
                    bridgeTruckCnt++;
                }
            }
            time++;
        }
        return time + bridge_length;
    }

    public Queue<Integer> waitTruckInit(int[] truckWeight) {
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < truckWeight.length; i++) {
            queue.add(truckWeight[i]);
        }
        return queue;
    }

    public int[] bridgeTruckInit(int length) {
        int[] arr = new int[length];
        for(int i = 0; i < length; i++) {
            arr[i] = 0;
        }
        return arr;
    }

    public int[] moveTruck(int[] bridgeTruck) {
        int[] tempBridgeTruck = new int[bridgeTruck.length];
        tempBridgeTruck[0] = 0;
        for(int i = 1; i < bridgeTruck.length; i++) {
            tempBridgeTruck[i] = bridgeTruck[i-1];
        }
        return tempBridgeTruck;
    }
}
