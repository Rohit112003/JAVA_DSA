package TreePractise.BST;

public class floor {
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
    floor(){
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
        floor tree = new floor();
        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 70);
        tree.insert(tree.root, 60);
        tree.insert(tree.root, 80);
        System.out.println(floor(tree.root,90));
    }
    public static int floor(Node root, int key){
        int flr = -1;
        while(root!=null){
            if(root.val==key){
                flr = root.val;
                return flr;
            }
            if(root.val<key){
                flr=root.val;
                root = root.right;
            }else{
                root = root.right;
            }

        }
        return flr;

    }

}
