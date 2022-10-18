package LCABinaryTree.EfficientLCABinaryTree;

public class Node {
    int key;
    Node right;
    Node left;

    public Node(int d) {
        key = d;
        right = null;
        left = null;
    }
}

class Test {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        int number1 = 20;
        int number2 = 50;

        Node num = lca(root, number1, number2);
        System.out.println("LCA: " + num.key);
    }

    public static Node lca(Node root, int number1, int number2) {
        if (root == null) {
            return null;
        }
        if (root.key == number1 || root.key == number2) {
            return root;
        }

        Node lca1 = lca(root.left, number1, number2);
        Node lca2 = lca(root.right, number1, number2);

        if (lca1 != null && lca2 != null) {
            return root;
        }
        if (lca1 != null) {
            return lca1;
        } else {
            return lca2;
        }
    }
}
