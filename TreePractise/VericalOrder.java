package TreePractise;

import com.sun.source.tree.Tree;

import javax.swing.tree.TreeNode;
import java.util.*;

public class VericalOrder {

    static class Tuple{
        Node node;
        int row;
        int col;

        public Tuple(Node node, int row, int col){
            this.node = node;
            this.row=row;
            this.col=col;
        }
    }

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
    VericalOrder(){
        root =null;
    }
    public static void main(String[] args) {
    VericalOrder tree = new VericalOrder();
        tree.root = new Node(1);
        tree.root.left = new Node(3);
        tree.root.right = new Node(9);
        tree.root.left.left = new Node(20);
        tree.root.left.right = new Node(11);
        tree.root.right.left = new Node(19);
        tree.root.right.right = new Node(12);

        VerticalAnswer(tree.root);
    }

    private static void VerticalAnswer(Node root) {
        TreeMap<Integer,TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<Tuple> q = new LinkedList<>();
        q.offer(new Tuple(root,0,0));
        while(!q.isEmpty()){
            Tuple tuple = q.poll();
            Node node = tuple.node;
            int vertical = tuple.row;
            int level = tuple.col;

            if(!map.containsKey(vertical)){
                map.put(vertical,new TreeMap<>());
            }
            if(!map.get(vertical).containsKey(level)){
                map.get(vertical).put(level,new PriorityQueue<>());
            }
            map.get(vertical).get(level).offer(node.data);

            if(node.left!=null){
                q.offer(new Tuple(node.left,vertical-1, level+1));
            }if(node.right!=null){
                q.offer(new Tuple(node.right,vertical+1, level+1));
            }


        }
        List<List<Integer>> list  = new ArrayList<>();
        for(TreeMap<Integer,PriorityQueue<Integer>> ys : map.values()){
            list.add(new ArrayList<>());
            for(PriorityQueue<Integer> nodes: ys.values()){
                while (!nodes.isEmpty()){
                    System.out.println(nodes.peek());
                    list.get(list.size()-1).add(nodes.poll());
                }
            }
        }
        System.out.println(list);

    }
}
