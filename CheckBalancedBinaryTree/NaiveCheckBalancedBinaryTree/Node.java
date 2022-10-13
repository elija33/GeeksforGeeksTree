package CheckBalancedBinaryTree.NaiveCheckBalancedBinaryTree;

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

        System.out.print(CheckBalancedBinaryTree(root));
    }

    public static boolean CheckBalancedBinaryTree(Node root) {
        if (root == null) {
            return true;
        }
        int righthight = height(root.right);
        int lefthight = height(root.left);
        return (Math.abs(righthight - lefthight) <= 1 && CheckBalancedBinaryTree(root.left)
                && CheckBalancedBinaryTree(root.right));
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        return (1 + Math.max(height(root.left), height(root.right)));
    }
}
