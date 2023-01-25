import java.util.Arrays;

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
        LinkedList list = new LinkedList();
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
//        list.print();
    }
}