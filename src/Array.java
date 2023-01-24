import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array {
    private int[] array;
    private int count = 0;

    Array(int length){
        array = new int[length];
    }
    public void workingWithArray(){

//        initialize an array
//        int[] array = {1, 2, 3, 4, 5};

//        declare an array
        int[] array = new int[5];
//        define the array
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;

//        to print an array
        System.out.println(Arrays.toString(array));
    }
    public void insert(int value){
        if (isFull()){
            int[] array2 = new int[array.length*2];

            for (int i = 0; i < array.length; i++)
                array2[i] = array[i];

            array = array2;
        }
        array[count++] = value;
    }

    public void print(){
        System.out.println(Arrays.toString(Arrays.copyOfRange(array,0, count)));
    }

    public int removeAt(int index){
        int removed = array[index];
        if (index < 0 || index >= count)
            return -1;
        count--;
        for (int i = index; i < count; i++)
            array[i] = array[i + 1];

        return removed;
    }
    public int indexOf(int value){
        for (int i = 0; i < count; i++) {
            if (value == array[i])
                return i;
        }
        return -1;
    }
    public void useOfArrayList(){
//        we arraylist in place of dynamic array
        ArrayList<Integer> list = new ArrayList();
        list.add(10);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(1, 20); // adding 20 at index 1

        System.out.println(list);
        System.out.println(list.lastIndexOf(20));
    }
    public int max(){
        int max = array[0];

        for (int i = 1; i < count; i++) {
            if (max < array[i])
                max = array[i];
        }
        return max;
    }
//>>>
    public Object[] intersect(){
        int[] index = new int[max() + 1];
        List<Integer> commonItems = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            index[array[i]]++;
        }
        for (int i = 0; i < index.length; i++) {
            if (index[i] > 1)
                commonItems.add(i);
        }
        return commonItems.toArray();
    }
    public void reverse(){
        int temp;
        for (int i = 0; i < count / 2; i++) {
            temp = array[i];
            array[i] = array[count - (i + 1)];
            array[count - (i + 1)] = temp;
        }
    }
    public void insertAt(int value, int index){
        if (index < 0 || index > count)
            throw new IllegalArgumentException();
        if (isFull()){
            int[] array2 = new int[array.length*2];

            for (int i = 0; i < array.length; i++)
                array2[i] = array[i];

            array = array2;
        }

        count++;
        for (int i = count - 1; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = value;
    }

    private boolean isEmpty() {
        if (count == 0)
            return true;
        return false;
    }
    private boolean isFull() {
        if (array.length == count)
            return true;
        return false;
    }

//    Exercise

}
