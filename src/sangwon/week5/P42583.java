package sangwon.week5;

import java.util.*;

public class P42583 {
    //time 계산을 위한 클래스
    static class Node{
        int weight;
        int time;

        public Node(int weight, int time) {
            this.weight = weight;
            this.time = time;
        }
    }

    private static int solution(int bridge_length, int weight, int[] arr) {
        int ans = 0;
        //전부 건너갔을 때 처리 위한 변수
        int target = 0;
        Queue<Integer> startQueue = new LinkedList<>();
        Queue<Node> arriveQueue = new LinkedList<>();

        for(int i = 0; i < arr.length; i++) {
            startQueue.add(arr[i]);
        }
        //다리 위의 차의 총 무게
        int totalWeight = 0;

        while(true){
            ans += 1;
            //모두 건넜을 때
            if(target == arr.length) {
                break;
            }
            //다리에 차가 올라갈 수 있을 때 올리기
            if(!startQueue.isEmpty() && startQueue.peek() + totalWeight <= weight){
                totalWeight += startQueue.peek();
                arriveQueue.add(new Node(startQueue.poll(), bridge_length));
            }
            //for-each문을 사용해 아래 작업을 하면 처음보는 error가 발생해서 iterator 사용 !!!!
            Iterator<Node> ite = arriveQueue.iterator();

            //이미 있는 차 시간 감소
            while(ite.hasNext()) {
                Node node = ite.next();
                node.time -= 1;
                //시간이 0이라면, 1. 큐에서 제거하고 2. 건너갔다는 변수를 1 증가시켜주고 3. 다리에서 차의 무게를 뺴준다.
                if(node.time == 0) {
                    totalWeight -= node.weight;
                    ite.remove();
                    target++;
                }
            }



        }

        return ans;
    }

    public static void main(String[] args) {

        //트럭은 1초에 1 bridge_length 만큼 이동(이 조건이 왜 없지..;;)
        //무게를 weight 만큼 견딜 수 있음
        //다리가 오르는데도 1초가 필요함

        int bridge_length = 2;
        int weight = 10;
        int arr[] = {7, 4, 5, 6};

        System.out.println(solution(bridge_length, weight, arr));
    }

}

