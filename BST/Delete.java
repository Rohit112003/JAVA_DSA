package TreePractise.BST;

public class Delete {

    class Node{
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val = val;
            this.left=null;
            this.right=null;
        }
    }

    Node root;
    Delete(){
        root = null;
    }
    Node insert(Node node,int key){
        if(node==null){
            node = new Node(key);
            return node;
        }
        if(key<node.val){
            node.left=insert(node.left,key);
        }else if(key>node.val){
            node.right = insert(node.right,key);
        }
        return node;
    }

    public static void main(String[] args) {
        Delete tree = new Delete();
        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 70);
        tree.insert(tree.root, 60);
        tree.insert(tree.root, 80);
        deleteNode(tree.root,70);

    }

    private static Node deleteNode(Node root, int val) {
        if(root==null){
            return null;
        }
        if(root.val==val){
            return helper(root);
        }
        Node dummy = root;
        while(root!=null){
            if(root.val>val){
                if(root.left!=null && root.left.val==val){
                    root.left =  helper(root.left);
                    break;
                }else{
                    root = root.left;
                }
            }else{
                if(root.right!=null && root.right.val==val){
                    root.right =  helper(root.right);
                    break;
                }else{
                    root = root.right;
                }
            }
        }
        return dummy;

    }
    public static Node  helper(Node root){
        if(root.left==null){
            return root.right;
        }
        if(root.right==null){
            return root.left;
        }
        Node rightChild = root.right;
        Node LastLeftLargest = findLargestRight(root.left);
        LastLeftLargest.right = rightChild;
        return root.left;
    }

    private static Node findLargestRight(Node left) {
        if(left.right==null){
            return left;
        }
        return findLargestRight(left.right);
    }


}
