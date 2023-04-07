public class BinaryTreeTester {

    public void testToString(){
        System.out.println("Testing BinaryTree toString Method");
        System.out.println("Making binary tree with root node with data 5");
        BinaryTree bt = new BinaryTree(new Node(5));
        System.out.println("Binary tree obtained:" + bt.toString());
    }

    public void testGetCurrent(){
        System.out.println("Testing BinaryTree getCurrent Method");
        System.out.println("Making binary tree with root node with data 5");
        BinaryTree bt = new BinaryTree(new Node(5));
        System.out.println("Current node obtained:" + bt.getCurrent());
    }

    public void testGoLeft(){
        System.out.println("Testing BinaryTree goLeft Method");
        System.out.println("Making binary tree with root node with data 5");
        BinaryTree bt = new BinaryTree(new Node(5));
        System.out.println("Current node obtained:" + bt.getCurrent());
        System.out.println("Going left");
        bt.goLeft();
        System.out.println("Current node obtained:" + bt.getCurrent());
    }

    public void testGoRight(){
        System.out.println("Testing BinaryTree goRight Method");
        System.out.println("Making binary tree with root node with data 5");
        BinaryTree bt = new BinaryTree(new Node(5));
        System.out.println("Current node obtained:" + bt.getCurrent());
        System.out.println("Going right");
        bt.goRight();
        System.out.println("Current node obtained:" + bt.getCurrent());
    }

    public void testInsertLeft(){
        System.out.println("Testing BinaryTree insertLeft Method");
        System.out.println("Making binary tree with root node with data 5");
        BinaryTree bt = new BinaryTree(new Node(5));
        System.out.println("Current node obtained:" + bt.getCurrent());
        System.out.println("Inserting left node with data 10");
        bt.insertLeft(10);
        System.out.println("Current node obtained:" + bt.getCurrent());
    }

    public void testInsertRight(){
        System.out.println("Testing BinaryTree insertRight Method");
        System.out.println("Making binary tree with root node with data 5");
        BinaryTree bt = new BinaryTree(new Node(5));
        System.out.println("Current node obtained:" + bt.getCurrent());
        System.out.println("Inserting right node with data 10");
        bt.insertRight(10);
        System.out.println("Current node obtained:" + bt.getCurrent());
    }

    public static void main(String[] args){
        System.out.println(" ======== Starting BinaryTree Testers ========");
        System.out.println(" *** ");
        BinaryTreeTester btt = new BinaryTreeTester();
        System.out.println(" ");
        btt.testToString();
        System.out.println(" ");
        btt.testGetCurrent();
        System.out.println(" ");
        btt.testGoLeft();
        System.out.println(" ");
        btt.testGoRight();
        System.out.println(" ");
        btt.testInsertLeft();
        System.out.println(" ");
        btt.testInsertRight();
        System.out.println(" ");
        System.out.println(" ======== Finished BinaryTree Testers ========");
    }
    
}
