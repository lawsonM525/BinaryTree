//implementation of binary tree with nodes that contain strings

public class BinTree {
    
    Node root;
    
    public BinTree(Node root){
        this.root = root;
    }
    
    public Node goLeft(Node n){
        return n.left;
    }
    
    public Node goRight(Node n){
        return n.right;
    }
    
    public void insertLeft(Node n, String data){
        Node newNode = new Node(data);
        n.left = newNode;
    }
    
    public void insertRight(Node n, String data){
        Node newNode = new Node(data);
        n.right = newNode;
    }
    
    // toString prints binary tree using parentheses to show structure
    public String toString(){
        return toString(root);
    }

    private String toString(Node node) {
        if (node == null) {
            return "_";
        } else {
            return "(" + node.data + " " + toString(node.left) + " " + toString(node.right) + ")";
        }
    }
}
