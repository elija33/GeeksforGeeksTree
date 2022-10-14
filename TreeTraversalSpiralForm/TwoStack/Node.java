package TreeTraversalSpiralForm.TwoStack;

import java.util.Stack;

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

        TwoStack(root);
    }

    public static void TwoStack(Node root) {
        if (root == null) {
            return;
        }
        Stack<Node> name1 = new Stack<>();
        Stack<Node> name2 = new Stack<>();

        name1.add(root);

        while (!name1.isEmpty() || !name2.isEmpty()) {
            while (!name1.empty()) {
                Node temp = name1.peek();
                name1.pop();
                System.out.print(temp.key + " ");
                if (temp.right != null) {
                    name2.add(temp.right);
                }
                if (temp.left != null) {
                    name2.add(temp.left);
                }
            }

            while (!name2.empty()) {
                Node temp = name2.peek();
                name2.pop();
                System.out.println(temp.key + " ");

                if (temp.left != null) {
                    name1.add(temp.left);
                }
                if (temp.right != null) {
                    name1.add(temp.right);
                }
            }

        }
    }
}
