package TreePractise;

public class ReverseOddlevels {
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
    ReverseOddlevels(){
        root = null;
    }

    public static void main(String[] args) {
        ReverseOddlevels tree = new ReverseOddlevels();
        tree.root = new Node(1);
        tree.root.left = new Node(3);
        tree.root.right = new Node(9);
        tree.root.left.left = new Node(20);
        tree.root.left.right = new Node(11);
        tree.root.right.left = new Node(19);
        tree.root.right.right = new Node(12);

        reverseLevels(tree.root.left, tree.root.right,1);

    }
    public static void reverseLevels(Node p1, Node p2, int oddCheck){
        if(p1==null|| p2==null){
            return ;
        }
        if(oddCheck%2!=0){
            int temp = p1.data;
            p1.data = p2.data;
            p2.data = temp;
        }
        reverseLevels(p1.left,p2.right,oddCheck+1);
        reverseLevels(p1.right,p2.left,oddCheck+1);

    }
}
