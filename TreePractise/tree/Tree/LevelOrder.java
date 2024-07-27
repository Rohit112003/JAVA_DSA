package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {

    static class  Tree{
        int val;
        Tree left;
        Tree right;


        public Tree(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }


    }
    public static void levelOrder(Tree root){
        Queue<Tree> q = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            for (int i =0; i<size; i++){
                Tree node= q.poll();
                if(node.left!=null){
                    q.offer(node.left);
                }if(node.right!=null){
                    q.offer(node.right);
                }
                list.add(node.val);
            }
            ans.add(new ArrayList<>(list));
            list.clear();

        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        Tree root = new Tree(1);
        root.left = new Tree(2);
        root.right = new Tree(3);
        root.left.left = new Tree(4);
        root.left.right = new Tree(5);
        root.right.left = new Tree(6);
        root.right.left.right = new Tree(7);
        levelOrder(root);

    }
}
