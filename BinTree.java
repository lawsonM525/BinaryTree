//implementation of binary tree with nodes that contain strings

public class BinTree {
    
    private Node root;
    
    public BinTree(Node root){
        this.root = root;
    }
    
    public Node getRoot(){
        return root;
    }
    
    public void setRoot(Node root){
        this.root = root;
    }
    
    public Node goLeft(Node n){
        return n.getLeft();
    }
    
    public Node goRight(Node n){
        return n.getRight();
    }
    
    public void insertLeft(Node n, String data){
        Node newNode = new Node(data);
        n.setLeft(newNode);
    }
    
    public void insertRight(Node n, String data){
        Node newNode = new Node(data);
        n.setRight(newNode);
    }
    
    public String toString(){
        return root.toString();
    }
}
