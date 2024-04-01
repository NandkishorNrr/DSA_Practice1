import Practice1.Array;
import Practice1.QueueWithTwoStack;

public class Main {
    public static void main(String[] args) {
//        working with array
/*
//        array.workingWithArray();
*/
//        user defined dynamic array
/*Basic1.Array
         Basic1.Array array = new Basic1.Array(5);
        array.insert(1);
        array.insert(2);
//        array.insert(3);
        array.insert(3);
//        array.insert(4);
//        array.insert(4);
//        array.insert(4);
        array.insert(4);
//        array.insert(5);
//        array.insert(5);
        array.insert(5);
        array.print();
//        System.out.println(array.removeAt(4));
//        array.print();
//        System.out.println(array.indexOf(-50));
//        array.useOfArrayList();
//        System.out.println(array.max());
        System.out.println(Arrays.toString(array.intersect()));
//        array.reverse();
//        array.insertAt(0, 5);
        array.print();
    */
//        Basic1.LinkedList
        /*Basic1.LinkedList list = new Basic1.LinkedList();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
//        list.print();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.print();
//        System.out.println(list.indexOf(20));
//        System.out.println(list.contains(100));
//        list.removeFirst();
//        list.removeLast();
//        System.out.println();
//        list.print();
//        System.out.println(list.size());
//        System.out.println(Arrays.toString(list.toArray()));
//        list.reverse();
        System.out.println();
        System.out.println(list.getKthFromTheEnd(5));
//        list.print();*/
//        doubly Basic1.LinkedList
      /*  var dLinkedList = new Basic1.DoublyLinkedList();
        System.out.println(dLinkedList.size());
        dLinkedList.addFirst(30);
        dLinkedList.addFirst(20);
        dLinkedList.addFirst(10);
//        dLinkedList.print();
        dLinkedList.addLast(40);
//        dLinkedList.print();
        dLinkedList.addFirst(5);
//        dLinkedList.print();
        dLinkedList.addAtIndex(50, 5);
        dLinkedList.addAtIndex(50, 5);
        System.out.println(dLinkedList.size());
        dLinkedList.print();
        System.out.println(Arrays.toString(dLinkedList.toArray()));*/
//        Basic1.Stack
     /*   Basic1.Stack<Integer> stack = new Basic1.Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack);
        System.out.println(stack.pop());*/

//      Basic1.Stack Exercise
        /*Basic1.StackExercise exercise = new Basic1.StackExercise();
//        System.out.println(exercise.reverse("Hello World"));
        System.out.println(exercise.isBalancedExpression("{(())}"));*/
//      Basic1.Stack
       /* Basic1.Stack stack = new Basic1.Stack();
        System.out.println(stack.isEmpty());
        stack.push(1);
        System.out.println(stack.isEmpty());
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        System.out.println(stack.isFull());
        stack.push(10);
        stack.print();
        System.out.println(stack.isFull());
        System.out.println(stack.pop());
        System.out.println(stack.isFull());
        System.out.println(stack.pick());
        stack.push(11);
        stack.print();*/
//        TwoStack
        /*Basic1.TwoStacks twoStacks = new Basic1.TwoStacks();
        twoStacks.push1(1);
        twoStacks.push1(2);
        twoStacks.push1(3);
        twoStacks.push1(4);
        twoStacks.push1(5);
        twoStacks.push1(6);
//        twoStacks.push1(6);
        twoStacks.push2(10);
        twoStacks.push2(9);
        twoStacks.push2(8);
        twoStacks.push2(7);
//        twoStacks.push2(6);
        twoStacks.print();
        System.out.println(twoStacks.pop1());
        System.out.println(twoStacks.pop2());
        twoStacks.push1(60);
        twoStacks.push2(70);
        twoStacks.print();*/
//        Basic1.MinStack
       /* Basic1.MinStack minStack = new Basic1.MinStack();

        minStack.push(30);
        minStack.push(40);
        minStack.push(20);
        minStack.push(50);
        minStack.push(10);
        System.out.println(minStack.min());
        minStack.pop();
        System.out.println(minStack.min());*/
//        Basic1.ArrayQueue
/*
        Basic1.ArrayQueue arrayQueue = new Basic1.ArrayQueue(5);

        arrayQueue.enqueue(10);
        arrayQueue.enqueue(20);
        arrayQueue.enqueue(30);
        arrayQueue.dequeue();
        arrayQueue.enqueue(40);
        arrayQueue.enqueue(50);
        arrayQueue.enqueue(60);
        var front = arrayQueue.dequeue();
        arrayQueue.enqueue(70);
        System.out.println(front);
        System.out.println(arrayQueue);*/
//        Queue with two stacks
/*        QueueWithTwoStack queue = new QueueWithTwoStack();

        queue.enqueue(10);
        queue.enqueue(20);
        var deleteed = queue.dequeue();
        var deleteed2 = queue.dequeue();
//        System.out.println(deleteed);
//        System.out.println(queue.peek());
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        var deleteed3 = queue.dequeue();
        var deleteed4 = queue.dequeue();*/

    }
}