import java.util.NoSuchElementException;

public class LinkedList {
    private Node first;
    private Node last;
    private int size = 0;

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "value=" + value;
        }
    }

    public void addFirst(int value){
        var node = new Node(value);

        if (isEmpty())
            first = last = node;
        else {
            node.next = first;
            first = node;
        }
        size++;
    }

    private boolean isEmpty() {
        return first == null;
    }

    public void addLast(int value){
        var node = new Node(value);

        if (isEmpty())
            first = last = node;
        else {
            last.next = node;
            last = node;
        }
        size++;
    }
    public void print(){
        var current = first;
        while (current != null){
            System.out.print(current.value + " ");
            current = current.next;
        }
    }
    public int indexOf(int value){
        int index = 0;

        var current = first;
        while (current != null){
            if (current.value == value)
                return index;
            current = current.next;
            index++;
        }
        return -1;
    }
    public boolean contains(int value){
       /* var current = first;

        while (current != null){
            if (current.value == value){
                return true;
            }
            current = current.next;
        }
        return false;*/
//        or
        return indexOf(value) != -1;
    }
    public void removeFirst(){
        if (isEmpty())
            throw  new NoSuchElementException();

        if (first == last) {
            first = last = null;
        }
        else {
            var second = first.next;
            first.next = null;
            first = second;
        }
        size--;
    }
    public void removeLast(){
        if (isEmpty())
            throw new NoSuchElementException();

        if (first == last){
            first = last = null;
        }
        else {
            var previous = getPrevious(last);
            last = previous;
            last.next = null;
        }
        size--;
    }
    private Node getPrevious(Node node) {
        var current = first;
        while (current != null){
            if (current.next == node)
                return current;
            current = current.next;
        }
        return null;
    }

    public int size(){
        return size;
    }

    public int[] toArray(){
        int[] array = new int[size];
        var current = first;
        int index = 0;

        while (current != null){
            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }

    public void reverse(){
        Node left = first;
        Node right = last;

        for (int i = 0; i < size / 2; i++) {
             int temp = left.value;
             left.value = right.value;
             right.value = temp;

            left = left.next;
            right = getPrevious(right);
        }
    }

    private void swap(Node left, Node right) {
        Node temp = left;
        left = right;
        right = temp;
    }
    public int getKthFromTheEnd(int k){
        if (isEmpty())
            throw new NoSuchElementException();
        if (k > size)
            throw new IllegalStateException();

       /* Node kThNode = last;
        for (int i = 0; i < k - 1; i++) {
            kThNode = getPrevious(kThNode);
        } *///or
        var a = first;
        var kThNode = first;
        for (int i = 0; i < k - 1; i++) {
            kThNode = kThNode.next;
        }
        while (kThNode != last){
            a = a.next;
            kThNode = kThNode.next;
        }
        return kThNode.value;
    }

    public void workingWithLinkedList(){
        java.util.LinkedList list = new java.util.LinkedList();
        list.addFirst(10);
        list.addLast(50);
        list.add(1,20);
        System.out.println(list);
        System.out.println(list.contains(20));
    }
}
