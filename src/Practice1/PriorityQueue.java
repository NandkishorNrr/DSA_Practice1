package Practice1;

import java.util.Arrays;

public class PriorityQueue {
    private int[] items = new int[10];
    int count = 0;

    public void add(int value){
        if (isFull())
            throw new IllegalStateException();
        int i;
        for (i = count - 1; i >= 0; i--) {
            if (value < items[i])
                items[i + 1] = items[i];
            else
                break;
        }
        items[i + 1] = value;
        count++;
    }

    public int remove(){
        if(isEmpty())
            throw new IllegalStateException();
        return items[--count];
    }

    private boolean isEmpty() {
        return count == 0;
    }

    private boolean isFull() {
        return count == items.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }

    public static void main(String[] args) {
//        built in priority queue
      /*  Basic1.PriorityQueue<Integer> priorityQueue = new java.util.Basic1.PriorityQueue<>();
        priorityQueue.add(5);
        priorityQueue.add(3);
        priorityQueue.add(2);
        priorityQueue.add(4);

        while (!priorityQueue.isEmpty())
            System.out.println(priorityQueue.remove());*/
//        user defined priorityQueue
        PriorityQueue queueCrt = new PriorityQueue();
        queueCrt.add(6);
        queueCrt.add(2);
        queueCrt.add(5);
        queueCrt.add(3);
        queueCrt.add(1);
        System.out.println(queueCrt);
        System.out.println(queueCrt.remove());
        queueCrt.add(10);
        System.out.println(queueCrt);
    }
}
