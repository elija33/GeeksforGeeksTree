package TreeTraversal.ImplementationofInoderTraversal;

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
        Node root = new Node(2);
        root.left = new Node(3); // root --- left
        root.right = new Node(4); // root -- right
        root.left.left = new Node(5); // root -- left -- left
        root.right.left = new Node(6); // root -- right -- left
        root.left.right = new Node(7); // root -- left -- right
        root.right.right = new Node(8); // root -- right -- right
        root.left.left.left = new Node(9); // root -- left -- left -- left
        root.right.right.right = new Node(10); // root -- right -- right -- right

        inorder(root);
    }

    public static void inorder(Node root) {
        // check if the root is not null
        if (root != null) {

            // Order from root to left
            inorder(root.left);

            // Print out the elements
            System.out.print(root.key + " ");

            // Order from root to right
            inorder(root.right);
        }
    }
}
