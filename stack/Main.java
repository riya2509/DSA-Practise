package stack;

public class Main {
    public static void main(String args[]) {
        Stack myStack = new Stack(4);

        // myStack.getTop();
        // myStack.getHeight();
        myStack.push(10);
        myStack.push(5);
        myStack.push(6);
        myStack.push(0);
        myStack.pop();

        myStack.printStack();
    }
}
