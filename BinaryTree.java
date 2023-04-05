// free to do some research but come up with your own code
// implement constructor, toString, and addNode
// addNode should add a node to the tree in the correct location
//node information is an integer
public class BinaryTree {

    //Class variables : root
    private Node root;
    private Node current;

    //Constructor
    public BinaryTree(){
        this.root = null;
    }

    public BinaryTree(Node root){
        this.root = root;
        this.current = root;
    }

    //Getters and Setters
    public Node getRoot(){
        return this.root;
    }

    public void setRoot(Node root){
        this.root = root;
    }

    public Node getCurrent(){
        return this.current;
    }

    //  METHODS

    // go Left
    public void goLeft(){
        if(this.current.getLeft() != null){
            this.current = this.current.getLeft();
        }
        else{
            System.out.println("No left child");
        }
    }

    // go Right
    public void goRight(){
        if(this.current.getRight() != null){
            this.current = this.current.getRight();
        }
        else{
            System.out.println("No right child");
        }
    }

    // insert Left
    public void insertLeft(int data){
        Node newNode = new Node(data);
        if(this.current.getLeft() == null){
            this.current.setLeft(newNode);
        }
        else{
            System.out.println("Left child already exists."); //do not want to overwrite a subtree
        }
    }

    // insert Right
    public void insertRight(int data){
        Node newNode = new Node(data);
        if(this.current.getRight() == null){
            this.current.setRight(newNode);
        }
        else{
            System.out.println("Right child already exists."); //do not want to overwrite a subtree
        }
    }



    /**
    // addNode
    public void addNode(int data){
        Node newNode = new Node(data);
        if(this.root == null){
            this.root = newNode;
        } else {
            Node currentNode = this.root;
            while(true){
                if(data < currentNode.getData()){ // smaller data goes to the left
                    if(currentNode.getLeft() == null){
                        currentNode.setLeft(newNode);
                        break;
                    } else {
                        currentNode = currentNode.getLeft();
                    }
                } else { // larger data goes to the right
                    if(currentNode.getRight() == null){
                        currentNode.setRight(newNode);
                        break;
                    } else {
                        currentNode = currentNode.getRight();
                    }
                }
            }
        }
    }

    // toString prints using InOrder 
    //traversal is recursive to traverse multiple subtrees
    // InOrder traversal prints the left subtree, then the root, then the right subtree
    // this would print the tree in ascending order when search is implemented
    // algorithm obtained from https://janac.medium.com/simple-tostring-method-for-binary-search-trees-af6b7171f432
    public String toString (Node root) {
        String s = "";
        if (root == null) {
            return "";
        }
    
        s += toString(root.getLeft());
        s += root.toString();
        s += toString(root.getRight());
        return s;
    }
    **/


}
