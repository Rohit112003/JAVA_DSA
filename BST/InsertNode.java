package TreePractise.BST;

public class InsertNode {
    static class Node{
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
    InsertNode(){
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
        InsertNode tree = new InsertNode();
        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 70);
        tree.insert(tree.root, 60);
        tree.insert(tree.root, 80);
        inserting(tree.root,90);

    }

    private static Node inserting(Node root, int val) {
        Node curr = root;
        while (true){
            if(curr.val<val){
                if(curr.right!=null) {
                    curr = curr.right;
                }else{
                    curr.right = new Node(val);
                    break;
                }


            }else{
                if(curr.left!=null){
                    curr = curr.left;
                }else{
                    curr.left = new Node(val);
                    break;
                }
            }
        }
        return root;
    }

}
