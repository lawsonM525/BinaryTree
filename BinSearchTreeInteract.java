//allows user to interact with a binary search tree via command line
import java.util.Scanner;

public class BinSearchTreeInteract {
    
    public static void main(String[] args){

        //making user interaction loop
        Scanner sc = new Scanner(System.in);
        String input = "";
        BinSearchTree bst = new BinSearchTree();
        System.out.println("Welcome to the Binary Search Tree Interaction Program");
        System.out.println("Type 'help' for a list of commands");
        while(!input.equals("quit")){
            System.out.print("Enter a command: ");
            input = sc.nextLine();
            if(input.equals("help")){
                System.out.println("Commands:");
                System.out.println("insert <data> - inserts a node with the given data into the tree");
                System.out.println("sort - sorts the tree");
                System.out.println("quit - quits the program");
            }
            else if(input.equals("sort")){
                System.out.println("Sorted Tree:" + bst.sort());
            }
            else if(input.startsWith("insert")){
                String[] split = input.split(" ");
                if(split.length == 2){
                    bst.insert(split[1]);
                    System.out.println("Tree:" + bst.toString());
                }
                else{
                    System.out.println("Invalid command");
                }
            }
            else if(!input.equals("quit")){
                System.out.println("Invalid command");
            }
        }


    }
}
