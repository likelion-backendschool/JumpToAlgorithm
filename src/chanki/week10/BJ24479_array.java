package chanki.week10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class BJ24479_array {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");

        int nodeNum = Integer.parseInt(inputs[0]);
        int lineNum = Integer.parseInt(inputs[1]);
        int vertexValue = Integer.parseInt(inputs[2]);

        Node[] graph = new Node[nodeNum + 1];
        for(int i = 1; i <= nodeNum; i++) {
            graph[i] = new Node(i);
        }

        String[] line;
        int first, second;

        for(int i = 0; i < lineNum; i++) {
            line = br.readLine().split(" ");

            first = Integer.parseInt(line[0]);
            second = Integer.parseInt(line[1]);

            graph[first].add(graph[second]);
            graph[second].add(graph[first]);
        }

        Stack<Node> stack = new Stack();

        Node vertex = graph[vertexValue];
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

            for(Node n : temp.adjacent.stream().filter(n -> !n.visited).sorted(((o1, o2) -> o2.value - o1.value)).collect(Collectors.toList())) {
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
