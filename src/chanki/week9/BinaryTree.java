package chanki.week9;

class practiceNode {
    int data;
    practiceNode left;
    practiceNode right;
}

class practiceTree {
    practiceNode root;

    public void setRoot(practiceNode practiceNode) {
        this.root = practiceNode;
    }

    public practiceNode getRoot() {
        return root;
    }

    // 노드 생성
    public practiceNode makeNode(practiceNode left, int data, practiceNode right) {
        practiceNode practiceNode = new practiceNode();
        practiceNode.data = data;
        practiceNode.left = left;
        practiceNode.right = right;
        return practiceNode;
    }

    // 조회 및 출력
    public void print(practiceNode practiceNode) {
        if (practiceNode != null) {
            print(practiceNode.left);
            System.out.println(practiceNode.data);
            print(practiceNode.right);
        }
    }
}

public class BinaryTree {
    public static void main(String[] args) {

        // 트리 생성
        practiceTree t = new practiceTree();

        // 노드 생성
        practiceNode n4 = t.makeNode(null, 4, null);
        practiceNode n5 = t.makeNode(null, 5, null);
        practiceNode n3 = t.makeNode(null, 3, null);
        practiceNode n2 = t.makeNode(n4, 2, n5);
        practiceNode n1 = t.makeNode(n2, 1, n3);

        // 루트 설정
        t.setRoot(n1);

        // 조회 및 출력
        t.print(n1);
    }
}


