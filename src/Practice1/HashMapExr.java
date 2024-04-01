package Practice1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HashMapExr {
    public static class Exercise {
        public char firstNonRepeatedChar(String str){
            HashMap<Character, Integer> map = new HashMap<>();
            char repeatedChar = ' ';
            char[] chars = str.toLowerCase().toCharArray();

            for (char ch: chars) {
                if (map.containsKey(ch))
                    map.put(ch,map.get(ch) + 1);
                else
                    map.put(ch, 1);
            }

            for (char ch: chars)
                if (map.get(ch) == 1) {
                    repeatedChar = ch;
                    break;
                }
//            System.out.println(map);
            return repeatedChar;
        }

        public void removeDuplicates(int[] array){
            Set<Integer> set = new HashSet<>();
            for (int n:array) {
                set.add(n);
            }
            System.out.println(set);
        }

        public char firstRepeatedChar(String str){
            Set<Character> set = new HashSet<>();
            char firstRepeated = Character.MIN_VALUE;

            for (char ch : str.toCharArray()) {
                if (set.contains(ch)) {
                    firstRepeated = ch;
                    break;
                }
                else
                    set.add(ch);
            }
            return firstRepeated;
        }

        public int hash(String key){
//            var hash = key.hashCode(); // java give predefined hashCode function to convert any value into hash
            int hash = 0;
            for (char ch: key.toCharArray()) {
                hash += ch;
            }
            return hash;
        }
    }

    public static void main(String[] args) {
        Exercise exercise = new Exercise();

//        char nonRepeatedChar = exercise.firstNonRepeatedChar("A Green Apple");
//        System.out.println(nonRepeatedChar);

//        int[] array = {1, 5, 6, 2, 4, 2, 1};
//        exercise.removeDuplicates(array);

//        char repeatedChar = exercise.firstRepeatedChar("A Green Apple");
//        System.out.println(repeatedChar);

//        var hashCode = exercise.hash("Nrr-2");
//        System.out.println(hashCode);

    }
}
