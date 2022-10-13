package MaximumWidthBinaryTree;

import java.util.LinkedList;
import java.util.Queue;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

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

        System.out.println(MaxiWidthBinaryTree(root));
    }

    public static int MaxiWidthBinaryTree(Node root) {
        if (root == null) {
            return 0;
        }
        Queue<Node> name = new LinkedList<>();
        name.add(root);
        int res = 0;
        while (name.isEmpty() == false) {
            int count = name.size();
            res = Math.max(res, count);
            for (int i = 0; i < count; i++) {
                Node curr = name.poll();
                if (curr.left != null) {
                    name.add(curr.left);
                }
                if (curr.right != null) {
                    name.add(curr.right);
                }
            }
        }
        return res;
    }
}
