package chanki.week9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class BJ1991 {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] inputs = new String[n];

        for(int i = 0; i < n; i++) {
            inputs[i] = br.readLine();
        }

        HashMap<String, Node> treeMap = new HashMap<>();
        String[] inputNode;
        Node left;
        Node right;

        for(int i = n - 1; i >= 0; i--) {
            inputNode = inputs[i].split(" ");
            if(inputNode[1].equals(".")) {
                left = null;
            } else {
                left = treeMap.get(inputNode[1]);
            }
            if(inputNode[2].equals(".")) {
                right = null;
            } else {
                right = treeMap.get(inputNode[2]);
            }
            treeMap.put(inputNode[0], new Node(inputNode[0], left, right));
        }

        preorder(treeMap.get("A"));
        sb.append("\n");
        inorder(treeMap.get("A"));
        sb.append("\n");
        postorder(treeMap.get("A"));

        System.out.println(sb);
    }

    static void preorder(Node node) {
        if(node != null) {
            sb.append(node.value);
            preorder(node.left);
            preorder(node.right);
        }
    }

    static void inorder(Node node) {
        if(node != null) {
            inorder(node.left);
            sb.append(node.value);
            inorder(node.right);
        }
    }

    static void postorder(Node node) {
        if(node != null) {
            postorder(node.left);
            postorder(node.right);
            sb.append(node.value);
        }
    }
}

class Node {
    String value;
    Node left;
    Node right;

    public Node(String value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}