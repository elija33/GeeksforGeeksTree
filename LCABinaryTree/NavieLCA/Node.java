package LCABinaryTree.NavieLCA;

import java.util.ArrayList;

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
    public static void main(String args[]) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        int number1 = 20, number2 = 50;

        Node ans = lca(root, number1, number2);
        System.out.println("LCA: " + ans.key);
    }

    public static boolean findPath(Node root, ArrayList<Node> name, int n) {
        if (root == null) {
            return false;
        }
        name.add(root);
        if (root.key == n) {
            return true;
        }
        if (findPath(root.left, name, n) || findPath(root.right, name, n)) {
            return true;
        }
        name.remove(name.size() - 1);
        return false;
    }

    public static Node lca(Node root, int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        if (findPath(root, path1, n1) == false || findPath(root, path2, n2) == false) {
            return null;
        }
        for (int i = 0; i < path1.size() - 1 && i < path2.size() - 1; i++)
            if (path1.get(i + 1) != path2.get(i + 1)) {
                return path1.get(i);
            }
        return null;
    }
}
