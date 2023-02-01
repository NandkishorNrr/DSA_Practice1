import java.util.Stack;
public class QueueWithTwoStack {
    private Stack<Integer> stack1 = new Stack();
    private Stack<Integer> stack2 = new Stack();

    public void enqueue(int value){
        stack1.push(value);
    }

    public int dequeue(){
        if (isEmpty())
            throw new IllegalStateException();
        moveStack1ToStack();

        return stack2.pop();
    }

    private void moveStack1ToStack() {
        if (stack2.isEmpty())
            while (!stack1.isEmpty())
                stack2.push(stack1.pop());
    }

    public int peek(){
        if (isEmpty())
            throw new IllegalStateException();
        moveStack1ToStack();

        return stack2.peek();
    }

    private boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    @Override
    public String toString() {
        return "stack1=" + stack1 +
                "\nstack2=" + stack2;
    }
}
