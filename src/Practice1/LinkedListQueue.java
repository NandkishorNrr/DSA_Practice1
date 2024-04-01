package Practice1;

import java.util.LinkedList;
import java.util.List;

public class LinkedListQueue {

    List queueLL = new LinkedList<Integer>();

    public void enqueue(int value){
        queueLL.add(value);
    }
    public int dequeue(){
        return (int) queueLL.remove(0);
    }

    public int peek(){
        return (int) queueLL.get(0);
    }

    public int size(){
        return queueLL.size();
    }

    public boolean isEmpty(){
        return queueLL.isEmpty();
    }

    public String toString(){
        return queueLL.toString();
    }

    public static void main(String[] args) {
        LinkedListQueue queueLL = new LinkedListQueue();

        queueLL.enqueue(10);
        queueLL.enqueue(20);
        queueLL.enqueue(30);
        queueLL.enqueue(40);
        System.out.println(queueLL);
        System.out.println(queueLL.dequeue());
        queueLL.enqueue(50);
        System.out.println(queueLL);
        System.out.println(queueLL.peek());
        System.out.println(queueLL.size());
        System.out.println(queueLL.isEmpty());
    }
}

