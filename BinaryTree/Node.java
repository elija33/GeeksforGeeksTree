package BinaryTree;

public class Node {
    int key;
    Node left;
    Node right;

    public Node(int data) {
        key = data;
        left = null;
        right = null;
    }
}

class Test {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(12);
        root.right = new Node(14);
        root.left.left = new Node(16);

    }
}