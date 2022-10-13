package CheckBalancedBinaryTree.EfficientBalancedBinary;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class Node {
    int key;
    Node right;
    Node left;

    public Node(int data) {
        right = null;
        left = null;
        key = data;
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

        if (Balanced(root) > 0) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }

    public static int Balanced(Node root) {
        if (root == null) {
            return 0;
        }
        int righthight = Balanced(root.right);
        if (righthight == -1) {
            return -1;
        }
        int lefthight = Balanced(root.left);
        if (lefthight == -1) {
            return -1;
        }

        if (Math.abs(lefthight - righthight) > 1) {
            return -1;
        }
        return Math.max(righthight, lefthight) + 1;
    }
}
