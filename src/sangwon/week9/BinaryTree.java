package sangwon.week9;

class Node {
    // 구현
    Node left;
    Node right;
    int data;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class Tree {
    Node root;

    public void setRoot(Node node) {
        this.root = node;
    }

    public Node getRoot() {
        return root;
    }

    // 노드 생성
    public Node makeNode(Node left, int data, Node right) {
        // 구현
        Node node = new Node(data);
        node.left = left;
        node.right = right;

        return node;
    }

    public Node makeNode(int data) {
        Node node = new Node(data);

        return node;
    }

    // 조회 및 출력
    public void print(Node node) {
        if (node != null) {
            print(node.left);
            System.out.println(node.data);
            print(node.right);
        }
    }
}

public class BinaryTree {
    public static void main(String[] args) {

        // 트리 생성
        Tree t = new Tree();

        // 노드 생성
        // 구현
        Node n3 = t.makeNode(3);
        Node n4 = t.makeNode(4);
        Node n5 = t.makeNode(5);
        Node n2 = t.makeNode(n4, 2, n5);
        Node n1 = t.makeNode(n2, 1, n3);

        // 루트 설정
        t.setRoot(n1);

        // 조회 및 출력
        t.print(n1);
    }
}

