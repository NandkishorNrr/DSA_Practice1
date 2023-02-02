import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class QueueExercise {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        System.out.println(queue);
        reverse(queue);
        System.out.println(queue);
        reverse(queue,3);
        System.out.println(queue);


    }

    public static void reverse(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<>();

        while (!queue.isEmpty())
            stack.push(queue.remove());

        while (!stack.empty())
            queue.add(stack.pop());
    }
    public static void reverse(Queue<Integer> queue, int k) {
        Queue<Integer> tempQueue = new ArrayDeque<>();
        Stack<Integer> tempStack = new Stack<>();

        for (int i = 0; i < k; i++)
            tempStack.push(queue.remove());

        while (!queue.isEmpty())
            tempQueue.add(queue.remove());

        while (!tempStack.isEmpty())
            queue.add(tempStack.pop());
        while (!tempQueue.isEmpty())
            queue.add(tempQueue.remove());
    }
}
