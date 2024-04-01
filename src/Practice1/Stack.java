package Practice1;

public class Stack {
    private int[] stack = new int[10];
    private int top = 0;

    public void push(int value){
        if (isFull())
            throw new StackOverflowError();

        stack[top++] = value;
    }
    public int pop(){
        if (isEmpty())
            throw new IllegalStateException();
        int remove = stack[--top];
        return remove;
    }
    public int pick(){
        if (isEmpty())
            throw new IllegalStateException();
        return stack[top - 1];
    }
    public void print(){
        for (int i = 0; i < top; i++)
            System.out.print(stack[i] + " ");
        System.out.println();
    }

    public boolean isFull() {
        return top == stack.length;
    }
    public boolean isEmpty(){
        return top == 0;
    }

}
