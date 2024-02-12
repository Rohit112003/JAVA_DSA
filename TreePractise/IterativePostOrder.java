package TreePractise;

import java.util.ArrayList;
import java.util.Stack;

public class IterativePostOrder {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    Node root;
    IterativePostOrder(){
        root = null;
    }
    public static void main(String[] args) {
        IterativePostOrder tree = new IterativePostOrder();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        IterativePost(tree.root);
    }


    private static void IterativePost(Node root) {
        if (root == null) return;

        Stack<Node> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        Node curr = root;
        Node prev = null;

        while (curr != null || !stack.isEmpty()) {
            if (curr != null) {
                stack.push(curr);
                curr = curr.left;
            } else {
                Node peekNode = stack.peek();
                if (peekNode.right != null && prev != peekNode.right) {
                    curr = peekNode.right;
                } else {
                    prev = stack.pop();
                    list.add(prev.data);
                }
            }
        }
        System.out.println(list);
    }
}
