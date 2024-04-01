package Practice1;

import java.util.Arrays;

public class ArrayQueue {
    private int[] queue;
    private int count = 0;
    private int rear = 0;
    private int front = 0;

    public ArrayQueue (int length){
        queue = new int[length];
    }
    public void enqueue(int value){
        if (isFull())
            throw new IllegalStateException();

        queue[rear++] = value;
        rear = (rear) % queue.length;
        count++;
    }
    public int dequeue(){
        int item = queue[front];
        queue[front++] = 0;
        front = (front) % queue.length;
        count--;
        return item;
    }

    private boolean isFull() {
        return count == queue.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(queue);
    }
}
