package TreeTraversal.ImplementatePostOrderTraversal;

public class Node {
    int key;
    Node left;
    Node right;

    public Node(int data) {
        data = key;
        left = null;
        right = null;
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

            postOrderTraversal(root);
        }

        public static void postOrderTraversal(Node root) {
            if (root != null) {
                postOrderTraversal(root.left);
                postOrderTraversal(root.right);
                System.out.print(root.key + " ");
            }
        }
    }
}
