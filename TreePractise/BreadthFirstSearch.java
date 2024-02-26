package TreePractise;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
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
    BreadthFirstSearch(){
        root = null;
    }

    public static void main(String[] args) {
        BreadthFirstSearch tree = new BreadthFirstSearch();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        Bfs(tree.root);
    }

    private static void Bfs(Node root) {
        Queue<Node> q = new LinkedList<>();
        ArrayList<ArrayList<Integer>> list  = new ArrayList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int leveNum = q.size();
            ArrayList<Integer> subList = new ArrayList<>();
            for(int i=0;i<leveNum;i++){
                if(q.peek().left!=null) q.offer(q.peek().left);
                if(q.peek().right!=null) q.offer(q.peek().right);
                subList.add(q.poll().data);
            }
            list.add(subList);


        }
        System.out.println(list);
    }
}
