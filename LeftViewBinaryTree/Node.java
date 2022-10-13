package LeftViewBinaryTree;

public class Node {
    int key;
    Node right;
    Node left;

    public Node(int data) {
        key = data;
        right = null;
        left = null;
    }
}

class Test {
    public static void main(String[] args) {
        Node root = new Node(0); // root
        root.right = new Node(1); // root -- right
        root.left = new Node(2); // root -- left
        root.left.left = new Node(3); // root -- left -- left
        root.right.left = new Node(4); // root -- right -- left
        root.left.right = new Node(5); // root -- left -- right
        root.right.right = new Node(6); // root -- right -- right
        root.left.left.left = new Node(7); // root -- left -- left -- left
        root.right.right.left = new Node(8); // root -- rigth -- right -- left
        root.left.right.right = new Node(9); // root -- left -- right -- right
        root.right.right.right = new Node(10); // root -- right -- right -- right

        LeftViewBinaryTree(root);
    }

    static int maxlevel = 0;

    public static void LeftViewBinaryTree(Node root, int level) {
        if (root == null) {
            return;
        }
        if (maxlevel < level) {
            System.out.println(root.key + " ");
            maxlevel = level;
        }
        LeftViewBinaryTree(root.left, level + 1);
        LeftViewBinaryTree(root.right, level + 1);
    }

    public static void LeftViewBinaryTree(Node root) {
        LeftViewBinaryTree(root, 1);
    }
}
