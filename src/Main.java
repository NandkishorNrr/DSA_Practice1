public class Main {
    public static void main(String[] args) {
//        working with array
/*
//        array.workingWithArray();
*/
//        user defined dynamic array
/*Array
         Array array = new Array(5);
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
//        LinkedList
        /*LinkedList list = new LinkedList();
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
//        doubly LinkedList
      /*  var dLinkedList = new DoublyLinkedList();
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
//        Stack
     /*   Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack);
        System.out.println(stack.pop());*/

//      Stack Exercise
        /*StackExercise exercise = new StackExercise();
//        System.out.println(exercise.reverse("Hello World"));
        System.out.println(exercise.isBalancedExpression("{(())}"));*/
//      Stack
       /* Stack stack = new Stack();
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
        /*TwoStacks twoStacks = new TwoStacks();
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
//        MinStack

        MinStack minStack = new MinStack();

        minStack.push(30);
        minStack.push(40);
        minStack.push(20);
        minStack.push(50);
        minStack.push(10);
        System.out.println(minStack.min());
        minStack.pop();
        System.out.println(minStack.min());
    }
}