//Tests the String Binary Tree class

public class BinTreeTester {

    public void testToString(){
        System.out.println("Testing toString Method");
        System.out.println("Making binary tree with root node with data 5");
        BinTree bt = new BinTree(new Node("5"));
        System.out.println("Tree:" + bt.toString());
        System.out.println("Making node with data 10");
        Node n = new Node("10");
        System.out.println("Setting root node's left child to node with data 10");
        bt.root.left = n;
        System.out.println("Tree:" + bt.toString());
        System.out.println("Making node with data 15");
        n = new Node("15");
        System.out.println("Setting root node's right child to node with data 15");
        bt.root.right = n;
        System.out.println("Tree:" + bt.toString());
        System.out.println("Making node with data 20");
        n = new Node("20");
        System.out.println("Setting root node's left child's left child to node with data 20");
        bt.root.left.left = n;
        System.out.println("Tree:" + bt.toString());
        System.out.println("Making node with data 25");
        n = new Node("25");
        System.out.println("Setting root node's left child's right child to node with data 25");
        bt.root.left.right = n;
        System.out.println("Tree:" + bt.toString());
        System.out.println("Making node with data 30");
        n = new Node("30");
        System.out.println("Setting root node's right child's left child to node with data 30");
        bt.root.right.left = n;
        System.out.println("Tree:" + bt.toString());
        System.out.println("Making node with data 35");
        n = new Node("35");
        System.out.println("Setting root node's right child's right child to node with data 35");
        bt.root.right.right = n;
        System.out.println("Tree:" + bt.toString());
    }

    public void testGoLeft(){
        System.out.println("Testing goLeft Method");
        System.out.println("Making binary tree with root node with data 5");
        BinTree bt = new BinTree(new Node("5"));
        System.out.println("Tree:" + bt.toString());
        System.out.println("Making node with data 10");
        Node n = new Node("10");
        System.out.println("Setting root node's left child to node with data 10");
        bt.root.left = n;
        System.out.println("Tree:" + bt.toString());
        System.out.println("Current node obtained:" + bt.root);
        System.out.println("Going left");
        System.out.println("Node encountered on the left:" + bt.goLeft(bt.root).toString());
        System.out.println("Tree:" + bt.toString());
    }

    public void testGoRight(){
        System.out.println("Testing goRight Method");
        System.out.println("Making binary tree with root node with data 5");
        BinTree bt = new BinTree(new Node("5"));
        System.out.println("Tree:" + bt.toString());
        System.out.println("Making node with data 10");
        Node n = new Node("10");
        System.out.println("Setting root node's right child to node with data 10");
        bt.root.right = n;
        System.out.println("Tree:" + bt.toString());
        System.out.println("Current node obtained:" + bt.root);
        System.out.println("Going right");
        System.out.println("Node encountered on the right:" + bt.goRight(bt.root).toString());
        System.out.println("Tree:" + bt.toString());
    }

    public  void testInsertLeft(){
        System.out.println("Testing insertLeft Method");
        System.out.println("Making binary tree with root node with data 5");
        BinTree bt = new BinTree(new Node("5"));
        System.out.println("Tree:" + bt.toString());
        System.out.println("Inserting node with data 10 to the left of the root node");
        bt.insertLeft(bt.root, "10");
        System.out.println("Tree:" + bt.toString());
        
    }

    public  void testInsertRight(){
        System.out.println("Testing insertRight Method");
        System.out.println("Making binary tree with root node with data 5");
        BinTree bt = new BinTree(new Node("5"));
        System.out.println("Tree:" + bt.toString());
        System.out.println("Inserting node with data 10 to the right of the root node");
        bt.insertRight(bt.root, "10");
        System.out.println("Tree:" + bt.toString());
        
    }

    public static void main(String[] args) {
        System.out.println("=========== TESTING STRING BINARY TREE ===========");
        BinTreeTester tester = new BinTreeTester();
        System.out.println(" ");
        tester.testToString();
        System.out.println(" ");
        tester.testGoLeft();
        System.out.println(" ");
        tester.testGoRight();
        System.out.println(" ");
        tester.testInsertLeft();
        System.out.println(" ");
        tester.testInsertRight();
        System.out.println(" ");
        System.out.println("=========== TESTING COMPLETE ===========");
    }
}
