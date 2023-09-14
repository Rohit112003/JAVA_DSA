package LeetcodeTree;

public class BinarySearch {

    class Node{
        int data ;
        Node left;
        Node right;
        Node(int n ){
            this.data = n;
            this.left = null;
            this.right = null;
        }
    }
    public Node root;
    public BinarySearch(){
        root = null;
    }
    public void insert(int data){
       root = insert_Recursive(root,data);
    }

    private Node insert_Recursive(Node root, int data) {
        if(root == null){
            root = new Node(data);
            return root;
        }
        if(data<root.data){
            root.left = insert_Recursive(root.left,data);

        }else if(data>root.data){
            root.right = insert_Recursive(root.right,data);
        }
        return root;
    }
    private void inorder(){
        inorder_Recursive(root);
    }

    private void inorder_Recursive(Node root) {
        if(root==null){
            return;
        }
        inorder_Recursive(root.left);
        System.out.print(root.data+" ");
        inorder_Recursive(root.right);
    }
    public Node deleteNode(Node root, int key) {
        if(root == null){
            return root;
        }
        if(root.data== key){
            return helper(root);
        }
        Node dummy = root;
        while(root!=null){
            if(root.data>key){
                if(root.left!=null && root.left.data==key){
                    root.left = helper(root.left);
                }
                else{
                    root = root.left;
                }
            }else{
                if(root.right!=null && root.right.data==key){
                    System.out.println(root.right.data);
                    root.right = helper(root.right);
                }else{
                    root = root.right;

                }
            }
        }
        return dummy;

    }

    public Node helper(Node root){
        if(root.left==null){
            return root.right;
        }else if(root.right == null){
            return root.left;
        }else{
            Node rightChild = root.right;
            Node lastRight = findLastRight(root.left);
            lastRight.right = rightChild;
        }
        return root.left;
    }

    public Node findLastRight(Node root){
        if(root.right==null){
            return root;
        }
        return findLastRight(root.right);
    }



    public static void main(String[] args) {
        BinarySearch bst = new BinarySearch();
        bst.insert(45);
        bst.insert(10);
        bst.insert(7);
        bst.insert(12);
        bst.insert(90);
        bst.insert(50);
        bst.inorder();
        bst.deleteNode(bst.root ,12);

    }
}
