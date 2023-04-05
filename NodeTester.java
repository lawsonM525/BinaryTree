public class NodeTester {
    
    public void tesToString(){
        System.out.println("Testing Node toString Method");
        System.out.println("Making node with data 5");
        Node n = new Node(5);
        System.out.println(n);
    }

    public void testGetData(){
        System.out.println("Testing Node getData Method");
        System.out.println("Making node with data 5");
        Node n = new Node(5);
        System.out.println("Node's data value obtained:" + n.getData());
    }

    public void testSetData(){
        System.out.println("Testing Node setData Method");
        System.out.println("Making node with data 5");
        Node n = new Node(5);
        System.out.println("Node's data value obtained:" + n.getData());
        System.out.println("Setting node's data value to 10");
        n.setData(10);
        System.out.println("Node's new data value obtained:" + n.getData());
    }

    public void testGetLeft(){
        System.out.println("Testing Node getLeft and setLeft Method");
        System.out.println("Making node with data 5");
        Node n = new Node(5);
        System.out.println("Node's left child obtained:" + n.getLeft());
        System.out.println("Making node with data 10");
        Node n2 = new Node(10);
        System.out.println("Setting first node's left child to node with data 10");
        n.setLeft(n2);
        System.out.println("Node's left child obtained:" + n.getLeft());
    }

    public void testGetRight(){
        System.out.println("Testing Node getRight and setRight Method");
        System.out.println("Making node with data 5");
        Node n = new Node(5);
        System.out.println("Node's right child obtained:" + n.getRight());
        System.out.println("Making node with data 10");
        Node n2 = new Node(10);
        System.out.println("Setting first node's right child to node with data 10");
        n.setRight(n2);
        System.out.println("Node's right child obtained:" + n.getRight());
    }

    public static void main(String[] args){
        System.out.println(" ======== Starting Node Tester ========");
        NodeTester nt = new NodeTester();
        System.out.println(" ");
        nt.tesToString();
        System.out.println(" ");
        nt.testGetData();
        System.out.println(" ");
        nt.testSetData();
        System.out.println(" ");
        nt.testGetLeft();
        System.out.println(" ");
        nt.testGetRight();
        System.out.println("======== Ending Node Tester =========");
    }

}
