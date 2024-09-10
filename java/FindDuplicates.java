/**
 * create a static method called findModeNestedLoops that takes a list of integers as an argument and returns a list of integers that have duplicates. 
 * Use a “nested loop” strategy to implement your method. 
 * Then, in your main function, invoke your findModeNestedLoops method with a few examples to confirm it’s working correctly. 
 * Here’s a sample stub of FindDuplicates.java:
 */

import java.util.*;

public class FindDuplicates {

    public static List<Integer> findModeNestedLoops(List<Integer> l) {
        // ugh do you mean the one where you compare each thing to every other thing?? gross!
        List<Integer> duplicates = new ArrayList<Integer>();
        Integer temp;

        for(int i = 0; i < l.size(); i++){
            temp = l.get(i);
            for(int j = i+1; j < l.size(); j++){
                if(temp.equals(l.get(j)) && !duplicates.contains(temp)){
                    duplicates.add(temp);
                }
            }
        }

        return duplicates;
    }

    public static List<Integer> findModeHashMap(List<Integer> l) {
        List<Integer> duplicates = new ArrayList<Integer>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i < l.size(); i++) {
            if (map.containsKey(l.get(i)) && !duplicates.contains(l.get(i))) {
                duplicates.add(l.get(i));
            }
            map.put(l.get(i), 1);
        }
        return duplicates;
    }


    public static void main(String[] args) {
        // some test strings:
        List<Integer> sample1 = new ArrayList<Integer>(Arrays.asList(3, 7, 5, 6, 7, 4, 8, 5, 7, 66));
        List<Integer> sample2 = new ArrayList<Integer>(Arrays.asList(3, 5, 6, 4, 4, 5, 66, 6, 7, 6));
        List<Integer> sample3 = new ArrayList<Integer>(Arrays.asList(3, 0, 5, 1, 0));
        List<Integer> sample4 = new ArrayList<Integer>(Arrays.asList(3));
        System.out.println("Sample 1a: " + findModeNestedLoops(sample1));
        System.out.println("Sample 1b: " + findModeHashMap(sample1));

        System.out.println("Sample 2a: " + findModeNestedLoops(sample2));
        System.out.println("Sample 2b: " + findModeHashMap(sample2));

        System.out.println("Sample 3a: " + findModeNestedLoops(sample3));
        System.out.println("Sample 3b: " + findModeHashMap(sample3));

        System.out.println("Sample 4a: " + findModeNestedLoops(sample4));
        System.out.println("Sample 4b: " + findModeHashMap(sample4));
    }

}