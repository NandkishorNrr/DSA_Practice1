public class TwoStacks {
    private int[] diQueue = new int[10];
    private int top1 = 0;
    private int top2 = diQueue.length - 1;

    public void push1(int value){
        if (isFull1())
            throw new StackOverflowError("Stack1");

        diQueue[top1++] = value;
    }
    public void push2(int value){
        if (isFull2())
            throw new StackOverflowError("Stack2");

        diQueue[top2--] = value;
    }

    public int pop1(){
        if (isEmpty1())
            throw new IllegalStateException();
        return diQueue[--top1];
    }

    public int pop2(){
        if (isEmpty1())
            throw new IllegalStateException();
        return diQueue[++top2];
    }

    private boolean isFull2() {
        return top2 < top1;
    }

    private boolean isFull1() {
        return top1 > top2;
    }

    private boolean isEmpty1(){
        return top1 == 0;
    }

    private boolean isEmpty2(){
        return top2 == diQueue.length - 1;
    }

    public void print(){
        for (int i = 0; i < diQueue.length; i++) {
            System.out.print(diQueue[i] + " ");
        }
        System.out.println();
    }
}
