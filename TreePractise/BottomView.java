package TreePractise;
import java.util.*;
public class BottomView  {

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

    BottomView(){
        root= null;
    }
    public static void main(String[] args) {
        BottomView tree= new BottomView();
        tree.root = new Node(1);
        tree.root.left = new Node(3);
        tree.root.right = new Node(9);
        tree.root.left.left = new Node(20);
        tree.root.left.right = new Node(11);
        tree.root.right.left = new Node(19);
        tree.root.right.right = new Node(12);

        checkBottomView(tree.root);

    }

    private static void checkBottomView(Node root) {
        Map<Integer,Integer> map = new TreeMap<>();
        Queue<Tuple> q = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        q.offer(new Tuple(root,0));
        while(!q.isEmpty()){
           Tuple t =  q.poll();
           Node node = t.node;
           int l = t.level;
           map.put(l,node.data);
           if(node.left!=null){
               q.offer(new Tuple(node.left, l-1));
           }
            if(node.right!=null){
                q.offer(new Tuple(node.right, l+1));
            }

        }
        for(Map.Entry<Integer,Integer> mapEntry: map.entrySet()){
            list.add(mapEntry.getValue());
        }

        System.out.println(list);
    }
}
