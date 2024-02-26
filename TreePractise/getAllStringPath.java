package TreePractise;

import java.util.ArrayList;

public class getAllStringPath {
    public static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    Node root;

    getAllStringPath() {
        root = null;
    }

    public static void main(String[] args) {
        getAllStringPath tree = new getAllStringPath();
        tree.root = new Node(1);
        tree.root.left = new Node(3);
        tree.root.right = new Node(9);
        tree.root.left.left = new Node(20);
        tree.root.left.right = new Node(11);
        tree.root.right.left = new Node(19);
        tree.root.right.right = new Node(12);
        StringBuilder sb = new StringBuilder();
        ArrayList<String> list = new ArrayList<>();
        getAll(tree.root, sb, list);
        System.out.println(list);
    }

    private static void getAll(Node root, StringBuilder sb, ArrayList<String> list) {
        if (root == null) {
            return;
        }
        int len = sb.length();

        sb.append(root.data);

        if (root.right == null && root.left == null) {
            list.add(sb.toString());
        } else {
            sb.append("->");
            getAll(root.left, sb, list);
            getAll(root.right, sb, list);
        }

        sb.setLength(len);
    }
}
