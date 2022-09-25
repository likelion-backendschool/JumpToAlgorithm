package chanki.week10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class BJ1260 {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int nodeNum = Integer.parseInt(input[0]);
        int edgeNum = Integer.parseInt(input[1]);
        int vertex = Integer.parseInt(input[2]);

        HashMap<Integer, GraphNode> graph = new HashMap<>();

        String[] eachConnection;
        int leftValue, rightValue;
        GraphNode leftNode, rightNode;

        graph.put(vertex, new GraphNode(vertex));

        for(int i = 0; i < edgeNum; i++) {
            eachConnection = br.readLine().split(" ");
            leftValue = Integer.parseInt(eachConnection[0]);
            rightValue = Integer.parseInt(eachConnection[1]);

            if(graph.containsKey(leftValue)) {
                leftNode = graph.get(leftValue);
            } else {
                leftNode = new GraphNode(leftValue);
                graph.put(leftValue, leftNode);
            }

            if(graph.containsKey(rightValue)) {
                rightNode = graph.get(rightValue);
            } else {
                rightNode = new GraphNode(rightValue);
                graph.put(rightValue, rightNode);
            }

            leftNode.connected.add(rightNode);
            rightNode.connected.add(leftNode);
            graph.put(leftValue, leftNode);
            graph.put(rightValue, rightNode);
        }

        Stack<GraphNode> stack = new Stack();
        Queue<GraphNode> queue = new LinkedList();
        GraphNode node;

        node = graph.get(vertex);
        stack.add(node);
        do {
            node = stack.pop();

            if(!node.isVisited) {
                sb.append(node.value).append(" ");
                node.isVisited = true;
            }

            node.connected.stream()
                    .filter(a -> a.isVisited == false)
                    .sorted(((o1, o2) -> o2.value - o1.value))
                    .forEach(a -> stack.add(a));

        } while (!stack.isEmpty());

        for(int a : graph.keySet()) {
            node = graph.get(a);
            node.isVisited = false;
        }
        sb.append("\n");

        node = graph.get(vertex);
        queue.add(node);
        do {
            node = queue.poll();

            if(!node.isVisited) {
                sb.append(node.value).append(" ");
                node.isVisited = true;
            }

            node.connected.stream()
                    .filter(a -> a.isVisited == false)
                    .sorted((Comparator.comparingInt(o -> o.value)))
                    .forEach(a -> queue.add(a));

        } while (!queue.isEmpty());

        System.out.println(sb);
    }
}

class GraphNode {
    int value;
    List<GraphNode> connected;
    boolean isVisited;

    public GraphNode(int value) {
        this.value = value;
        this.connected = new ArrayList<>();
        this.isVisited = false;
    }

    public void addConnected(GraphNode node) {
        connected.add(node);
    }
}
