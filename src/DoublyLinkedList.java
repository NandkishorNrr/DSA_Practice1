import java.util.NoSuchElementException;

public class DoublyLinkedList {

    private Node first;
    private Node last;
    private int size = 0;

    private class Node {
        private int value;
        private Node next;
        private Node previous;

        Node (int value){
            this.value = value;
        }

        @Override
        public String toString() {
            return "value=" + value;
        }
    }

    public void addFirst(int value){
        var node = new Node(value);
        if (isEmpty()){
            first = last = node;
        }
        else {
            node.next = first;
            first.previous = node;
            first = node;
        }
        size++;
    }

    public void addLast(int value){
        var node = new Node(value);
        if (isEmpty()){
            first = last = node;
        }
        else {
            last.next = node;
            node.previous = last;
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
        System.out.println();
    }

    public void addAtIndex(int value, int index){
        if (index > size || index < 0)
            throw new NoSuchElementException();

        var node = new Node(value);
        var current = first;

        if (index == 0)
            addFirst(value);
        else if (index == size)
            addLast(value);
        else {
            for (int i = 0; i < index; i++) {
                current = current.next;
            }

            node.next = current;
            node.previous = current.previous;
            current.previous.next = node;
            current.previous = node;
        }
        size++;
    }

    public int[] toArray(){
        var current  = first;
        int[] array = new int[size];
        int index = 0;

        while (current != null){
            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }

    public int size(){
        return size;
    }

    private boolean isEmpty() {
        return first == null;
    }

}
