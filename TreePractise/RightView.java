package TreePractise;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class RightView {

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
    RightView(){
        root = null;
    }
    public static void main(String[] args) {
        RightView tree = new RightView();
        tree.root = new Node(1);
        tree.root.left = new Node(3);
        tree.root.right = new Node(9);
        tree.root.left.left = new Node(20);
        tree.root.left.right = new Node(11);
        tree.root.right.left = new Node(19);
        tree.root.right.right = new Node(12);
        ArrayList<Integer> list= new ArrayList<>();
        ArrayList<Integer> newList= new ArrayList<>();
        RightCheckView(tree.root,0,list);
        RightLevelView(tree.root,newList);
        System.out.println(newList);
        System.out.println(list);

    }

    private static void RightCheckView(Node root, int level, ArrayList<Integer> list) {
        if(root==null){
            return;
        }
        if(level==list.size()){
            list.add(root.data);
        }
        RightCheckView(root.right,level+1,list);
        RightCheckView(root.left, level+1,list);

    }
    private static void RightLevelView(Node root, ArrayList<Integer> list){
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int n = q.size()    ;
            for(int i =1; i<=n;i++){
                Node temp = q.poll();


                if(i==n){
                    list.add(root.data);
                }
                if(temp.left!=null){
                    q.offer(temp.left);
                }
                if(temp.right!=null){
                    q.offer(temp.right);
                 }
            }
        }

    }
}
