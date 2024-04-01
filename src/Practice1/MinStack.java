package Practice1;

public class MinStack {
    private int[] stack = new int[5];
    private int top = 0;

    public void push(int value){
        if (isFull())
            throw new StackOverflowError();

        stack[top++] = value;
    }
    public int min(){
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < top; i++)
            if (min > stack[i])
                min = stack[i];

        return min;
    }

    public int pop(){
        return stack[--top];
    }

    public boolean isEmpty(){
        return top == 0;
    }

    public boolean isFull(){
        return top == stack.length;
    }
}
