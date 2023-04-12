// Tree to represent arithmetic expressions

public class ArithExprTree extends BinTree {
    
    public ArithExprTree(){
        super();
    }

    // Converts string in order to arithmetic expression tree
    public ArithExprTree(String expression){
        super();
        String[] expressionArray = expression.split(" ");
        root = new Node(expressionArray[0]);
        Node current = root;
        for(int i = 1; i < expressionArray.length; i++){
            if(expressionArray[i].equals("(")){
                current = current.left;
            }else if(expressionArray[i].equals(")")){
                current = current.parent;
            }else{
                Node newNode = new Node(expressionArray[i]);
                if(current.left == null){
                    current.left = newNode;
                }else{
                    current.right = newNode;
                }
                newNode.parent = current;
                current = newNode;
            }
        }
    }

    // Converts string array in order to arithmetic expression tree
    public ArithExprTree(String[] expression){
        super();
        // More code coming soon
    }

    // Evaluates arithmetic expression tree
    public int evaluate(){
        return evaluate(root);
    }

    private int evaluate(Node node){
        // Base cases
        if(node == null){
            System.out.println(" Error: Node is null");
            return 0;
        }
        if(node.left == null && node.right == null){
            return Integer.parseInt(node.data);
        }
        //Recursive cases
        int left = evaluate(node.left);
        int right = evaluate(node.right);
        //switch statement to evaluate the operator
        switch(node.data){
            case "+":
                return left + right;
            case "-":
                return left - right;
            case "*":
                return left * right;
            case "/":
                return left / right;
            default:
                System.out.println(" Error: Invalid operator");
                return 0;
        }
    }
}
