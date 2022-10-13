package MaximumBinaryTree;

import java.lang.annotation.Retention;

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
        Node root = new Node(0);
        root.left = new Node(1); // root -- left
        root.right = new Node(2); // root -- right
        root.left.left = new Node(3); // root -- left -- left
        root.right.left = new Node(4); // root -- right -- left
        root.left.right = new Node(5); // root -- left -- right
        root.right.right = new Node(6); // root -- right -- right
        root.left.left.left = new Node(7); // root -- left -- left -- left
        root.right.right.left = new Node(8); // root -- right -- right -- left
        root.left.right.right = new Node(9); // root - left -- right -- right
        root.right.right.right = new Node(10); // root -- right -- right -- right

        System.out.print(getMax(root));
    }

    public static int getMax(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        return Math.max(root.key, Math.max(getMax(root.left), getMax(root.right)));
    }
}
