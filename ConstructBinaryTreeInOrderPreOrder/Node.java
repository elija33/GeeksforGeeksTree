package ConstructBinaryTreeInOrderPreOrder;

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
        int number[] = { 20, 10, 40, 30, 50, 60 };
        int numbers[] = { 10, 20, 30, 40, 50, 60 };
        Node root = constructBin(number, numbers, 0, number.length - 1);

        inorder(root);
    }

    static int preIndex = 0;

    public static Node constructBin(int number[], int numbers[], int num, int numb) {
        if (num > numb) {
            return null;
        }
        Node root = new Node(numbers[preIndex++]);
        int inIndex = num;
        for (int i = num; i <= numb; i++) {
            if (number[i] == root.key) {
                inIndex = i;
                break;
            }
        }
        root.left = constructBin(number, numbers, num, inIndex - 1);
        root.right = constructBin(number, numbers, inIndex + 1, numb);
        return root;
    }

    public static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.key + "");
            inorder(root.right);
        }
    }
}
