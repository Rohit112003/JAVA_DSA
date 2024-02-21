package TreePractise;

import java.util.*;

public class Topview {

    static class Tuple{
        Node node;
        int level;

        Tuple(Node node, int x){
            this.node = node;
            this.level = x;
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
    Topview(){
        root= null;
    }

    public static void main(String[] args) {
        Topview tree = new Topview();
        tree.root = new Node(1);
        tree.root.left = new Node(3);
        tree.root.right = new Node(9);
        tree.root.left.left = new Node(20);
        tree.root.left.right = new Node(11);
        tree.root.right.left = new Node(19);
        tree.root.right.right = new Node(12);

        topviewAns(tree.root);
    }

    private static void topviewAns(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        if(root==null){
            System.out.println(list);
            return;
        }
        Queue<Tuple> q = new LinkedList<>();
        Map<Integer,Integer> map = new TreeMap();
        q.offer(new Tuple(root, 0));
        while (!q.isEmpty()){
            Tuple t = q.poll();
            Node node = t.node;
            int l = t.level;
            if(map.get(l)==null){
                map.put(l,node.data);
            }
            if(node.left!=null){
                q.add(new Tuple(node.left,l-1));
            } if(node.right!=null){
                q.add(new Tuple(node.right,l+1));
            }

        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            list.add(entry.getValue());
        }
        System.out.println(list);

    }
}
