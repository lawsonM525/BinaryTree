public class BinaryTreeTester {

    public void testGoLeft(){
        System.out.println("Testing goLeft Method");
        System.out.println("Making binary tree with root node with data 5");
        BinaryTree bt = new BinaryTree(new Node(5));
        System.out.println("Tree:" + bt.toString());
        System.out.println("Making node with data 10");
        Node n = new Node(10);
        System.out.println("Setting root node's left child to node with data 10");
        bt.getRoot().setLeft(n);
        System.out.println("Tree:" + bt.toString());
        System.out.println("Current node obtained:" + bt.getRoot());
        System.out.println("Going left");
        System.out.println("Node encountered on the left:" + bt.goLeft(bt.getRoot()).toString());
        System.out.println("Tree:" + bt.toString());
    }

    public void testGetRight(){
        System.out.println("Testing getRight Method");
        System.out.println("Making binary tree with root node with data 5");
        BinaryTree bt = new BinaryTree(new Node(5));
        System.out.println("Tree:" + bt.toString());
        System.out.println("Making node with data 10");
        Node n = new Node(10);
        System.out.println("Setting root node's right child to node with data 10");
        bt.getRoot().setRight(n);
        System.out.println("Tree:" + bt.toString());
        System.out.println("Current node obtained:" + bt.getRoot());
        System.out.println("Going right");
        System.out.println("Node encountered on the right:" + bt.goRight(bt.getRoot()).toString());
        System.out.println("Tree:" + bt.toString());
    }

    public  void testInsertLeft(){
        System.out.println("Testing insertLeft Method");
        System.out.println("Making binary tree with root node with data 5");
        BinaryTree bt = new BinaryTree(new Node(5));
        System.out.println("Tree:" + bt.toString());
        System.out.println("Inserting node with data 10 to the left of the root node");
        bt.insertLeft(bt.getRoot(), 10);
        System.out.println("Tree:" + bt.toString());
        
    }



    public static void main(String[] args){
        System.out.println(" ======== Starting Binary Tree Tester ========");   
        BinaryTreeTester btt = new BinaryTreeTester();
        System.out.println(" ");
        btt.testGoLeft();
        System.out.println(" ");
        btt.testGetRight();
        System.out.println(" ");

    }
    
}
