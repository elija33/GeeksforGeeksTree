package DiameterBinaryTree.NaiveNode;

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
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(60);
        root.right.left.left = new Node(50);
        root.right.right.right = new Node(70);

        System.out.println(diameter(root));
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        } else {
            return (1 + Math.max(height(root.left), height(root.right)));
        }
    }

    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        int number1 = 1 + height(root.left) + height(root.right);
        int number2 = diameter(root.left);
        int number3 = diameter(root.right);

        return Math.max(number1, Math.max(number2, number3));
    }
}
