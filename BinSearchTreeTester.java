public class BinSearchTreeTester {

    public static void main(String[] args) {
        System.out.println("Testing BinSearchTree");

        System.out.println("Making binary search tree with root node with data 'Mia'");
        BinSearchTree bst = new BinSearchTree(new Node("Mia"));
        System.out.println("Tree:" + bst.toString());
        System.out.println("Inserting node with data 'Ava' into the tree");
        bst.insert("Ava");
        System.out.println("Tree:" + bst.toString());
        System.out.println("Inserting node with data 'Zoe' into the tree");
        bst.insert("Zoe");
        System.out.println("Tree:" + bst.toString());
        System.out.println("Inserting node with data 'Emma' into the tree");
        bst.insert("Emma");
        System.out.println("Tree:" + bst.toString());
        System.out.println("Inserting node with data 'Olivia' into the tree");
        bst.insert("Olivia");
        System.out.println("Tree:" + bst.toString());

        System.out.println("====================================================");

        System.out.println(" Sorting Binary Search Tree"); 
        System.out.println("Sorted Tree:" + bst.sort());

        System.out.println("==== Testing Complete ====");
    }
}
