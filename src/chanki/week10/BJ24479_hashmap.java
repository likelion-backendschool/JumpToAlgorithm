package chanki.week10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class BJ24479_hashmap {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");

        int nodeNum = Integer.parseInt(inputs[0]);
        int lineNum = Integer.parseInt(inputs[1]);
        int vertexValue = Integer.parseInt(inputs[2]);

        HashMap<Integer, Node> graph = new HashMap<>();
        String[] line;
        int first, second;
        Node firstNode, secondNode;
        graph.put(vertexValue, new Node(vertexValue));
        for(int i = 0; i < lineNum; i++) {
            line = br.readLine().split(" ");

            first = Integer.parseInt(line[0]);
            second = Integer.parseInt(line[1]);

            if(graph.containsKey(first)) {
                firstNode = graph.get(first);
            } else {
                firstNode = new Node(first);
                graph.put(first, firstNode);
            }

            if(graph.containsKey(second)) {
                secondNode = graph.get(second);
            } else {
                secondNode = new Node(second);
                graph.put(second, secondNode);
            }

            firstNode.add(secondNode);
            secondNode.add(firstNode);
        }

        Stack<Node> stack = new Stack();

        Node vertex = graph.get(vertexValue);
        stack.add(vertex);

        int[] order = new int[nodeNum];
        int cnt = 1;
        Node temp;
        while(!stack.isEmpty()) {
            temp = stack.pop();

            if(temp == null) {
                break;
            }

            if(!temp.visited) {
                order[temp.value - 1] = cnt;
                temp.visit();
                cnt++;
            }

            for(Node n : temp.adjacent.stream().sorted(((o1, o2) -> o2.value - o1.value)).filter(n -> !n.visited).collect(Collectors.toList())) {
                stack.add(n);
            }
        }

        StringBuilder sb = new StringBuilder();
        Arrays.stream(order).forEach(n -> sb.append(n).append("\n"));

        System.out.println(sb);
    }

    static class Node {
        private int value;
        private List<Node> adjacent;
        private Boolean visited;

        public Node(int value) {
            this.value = value;
            this.adjacent = new ArrayList<>();
            this.visited = false;
        }

        void visit() {
            this.visited = true;
        }

        void add(Node n) {
            this.adjacent.add(n);
        }
    }
}
