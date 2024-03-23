package TreePractise.BST;

public class ceil {

    public static class Node{
        int val;
        Node right;
        Node left;

        Node(int data){
            this.val = data;
            this.right = null;
            this.left = null;
        }



    }
    Node root;
    ceil(){
        root=null;
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
        ceil tree = new ceil();
        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 70);
        tree.insert(tree.root, 60);
        tree.insert(tree.root, 90);
        System.out.println(findCeil(tree.root,80));
    }

    public static int findCeil(Node root, int key){
        int ceil =-1;
        while(root!=null){
            if(root.val==key){
                ceil=root.val;
                return ceil;
            }
            if(key>root.val){
                root = root.right;
            }else{
                ceil=root.val;
                root = root.left;
            }
        }
        return ceil;

    }
}
