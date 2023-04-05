// has recursive pointer to both a right and a left child
// has name or number or whatever label
// recursion is key in the binary tree

public class Node{
    
    //Class variables : data, left, right
    private int data;
    private Node left;
    private Node right;

    //Constructor
    public Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

    //Getters and Setters
    public int getData(){
        return this.data;
    }

    public void setData(int data){
        this.data = data;
    }

    public Node getLeft(){
        return this.left;
    }

    public void setLeft(Node left){
        this.left = left;
    }

    public Node getRight(){
        return this.right;
    }

    public void setRight(Node right){
        this.right = right;
    }

    //toString
    public String toString(){
        return "*" + this.data + "*";
    }

}