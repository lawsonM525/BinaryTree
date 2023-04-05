// free to do some research but come up with your own code
// implement constructor, toString, and addNode
// addNode should add a node to the tree in the correct location
//node information is an integer
public class BinaryTree {

    //Class variables : root
    private Node root;

    //Constructor
    public BinaryTree(){
        this.root = null;
    }

    //Getters and Setters
    public Node getRoot(){
        return this.root;
    }

    public void setRoot(Node root){
        this.root = root;
    }

    //  METHODS

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



}
