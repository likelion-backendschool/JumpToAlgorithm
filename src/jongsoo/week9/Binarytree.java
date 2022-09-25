package jongsoo.week9;


class Node {
    // 구현
    int data;
    node left;
    node right;
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

public class Binarytree {
    public static void main(String[] args) {

        // 트리 생성
        Tree t = new Tree();

        // 노드 생성
        // 구현

        // 루트 설정
        t.setRoot(n1);

        // 조회 및 출력
        t.print(n1);
    }
}