package TreePractise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class ZigZag {
    public static class Node{
        int data;
        Node right;
        Node left;

        Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }



    }
    Node root;
    ZigZag(){
        root = null;
    }

    public static void main(String[] args) {
        ZigZag tree = new ZigZag();
        tree.root = new Node(1);
        tree.root.left = new Node(3);
        tree.root.right = new Node(9);
        tree.root.left.left = new Node(20);
        tree.root.left.right = new Node(11);
        tree.root.right.left = new Node(19);
        tree.root.right.right = new Node(12);
        ZigTravel(tree.root);
    }

    private static void ZigTravel(Node root) {
        Queue<Node>  q= new LinkedList<>();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        boolean leftTRaversal = false;
        q.offer(root);
        while (!q.isEmpty()){
            int leveLnum =  q.size();
            ArrayList<Integer> subslist = new ArrayList<>();
            for(int i =0; i<leveLnum ;i++){
                Node qpeek = q.peek();
                if(qpeek.left!=null) q.offer(qpeek.left);
                if(qpeek.right!=null) q.offer(qpeek.right);
                subslist.add(q.poll().data);

            }
            if(leftTRaversal){
                Collections.reverse(subslist);
            }
            leftTRaversal = !leftTRaversal;
            list.add(subslist);
        }
        System.out.println(list);

    }
}
