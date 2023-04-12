//implementation of node with string data

public class Node {
    String data;
    Node left;
    Node right;
    
    public Node(String data){
        this.data = data;
        left = null;
        right = null;
    }
    
    public String toString(){
        return data;
    }
    
}
