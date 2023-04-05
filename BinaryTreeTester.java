public class BinaryTreeTester {

    public void testBT(){
        System.out.println("Testing BinaryTree Methods");
        System.out.println("Making binary tree with no nodes");
        BinaryTree bt = new BinaryTree();
        System.out.println("Tree: " + bt.toString(bt.getRoot()));
        System.out.println("Adding node with data 5");
        bt.addNode(5);
        System.out.println("Tree: " + bt.toString(bt.getRoot()));
        System.out.println("Adding node with data 10");
        bt.addNode(10);
        System.out.println("Tree: " + bt.toString(bt.getRoot()));
        System.out.println("Adding node with data 3");
        bt.addNode(3);
        System.out.println("Tree: " + bt.toString(bt.getRoot()));
        System.out.println("Adding node with data 7");
        bt.addNode(7);
        System.out.println("Tree: " + bt.toString(bt.getRoot()));
        System.out.println("Adding node with data 1");
        bt.addNode(1);
        System.out.println("Tree: " + bt.toString(bt.getRoot()));
        System.out.println("Adding node with data 2");
        bt.addNode(2);
        System.out.println("Tree: " + bt.toString(bt.getRoot()));
        System.out.println("Adding node with data 4");
        bt.addNode(4);
        System.out.println("Tree: " + bt.toString(bt.getRoot()));
        System.out.println("Adding node with data 6");
        bt.addNode(6);
        System.out.println("Tree: " + bt.toString(bt.getRoot()));
        System.out.println("Adding node with data 8");
        bt.addNode(8);
        System.out.println("Tree: " + bt.toString(bt.getRoot()));
        System.out.println("Adding node with data 9");
        bt.addNode(9);
        System.out.println("Tree: " + bt.toString(bt.getRoot()));
    }

    public static void main(String[] args){
        System.out.println(" ======== Starting BinaryTree Tester ========");
        BinaryTreeTester btt = new BinaryTreeTester();
        System.out.println(" ");
        btt.testBT();
        System.out.println(" ");
        System.out.println(" ======== Ending BinaryTree Tester ========");
    }
    
}
