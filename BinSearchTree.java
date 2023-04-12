public class BinSearchTree extends BinTree{
    
    public BinSearchTree(Node root){
        super(root);
    }

    public BinSearchTree(){
        super();
    }
    
    public void insert(String data){
        Node newNode = new Node(data);
        Node current = root;
        Node parent = null;
        while(current != null){
            parent = current;
            if(data.compareTo(current.data) < 0){
                current = current.left;
            }else{
                current = current.right;
            }
        }
        if(parent == null){
            root = newNode;
        }else if(data.compareTo(parent.data) < 0){
            parent.left = newNode;
        }else{
            parent.right = newNode;
        }
    }
    
    // sort prints binary tree in in-order traversal order
    public String sort(){
        return sort(root);
    }

    private String sort(Node node) {
        if (node == null) {
            return "";
        } else {
            return sort(node.left) + node.data + " " + sort(node.right);
        }
    }
    
}
