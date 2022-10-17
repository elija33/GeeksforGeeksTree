package DiameterBinaryTree.EfficientDiameterBinaryTree;

public class Node {
    int key;
    Node left;
    Node right;

    public Node(int k) {
        key = k;
        right = null;
        left = null;
    }
}

class Test {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.right = new Node(20);
        root.left = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(60);
        root.right.left.left = new Node(50);
        root.right.right.right = new Node(70);

        System.out.println("height: " + height(root));
        System.out.println("Diameter: " + res);
    }

    static int res = 0;

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int right = height(root.right);
        int left = height(root.left);
        res = Math.max(res, 1 + right + left);
        return 1 + Math.max(right, left);
    }
}
