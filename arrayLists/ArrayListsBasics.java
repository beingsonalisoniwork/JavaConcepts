package arrayLists;

import java.util.ArrayList;

public class ArrayListsBasics {
    public static void main(String[] args) {

        // ArrayList (Class) - - implements - - > List (Interface) -- extends --> Collection

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(4);
        arr.add(5);
        arr.add(10);
        arr.add(0);
        arr.add(25);

        System.out.println(arr); // prints array

        /*
         * ArrayList is a part of Java Collections Framework
         * ArrayList override the 'toString()' method in the AbstractCollection class
         * kind of act as 'return Arrays.toString(this.toArray());'
        */

        // OPERATIONS

        ArrayList<String> strArr = new ArrayList<>();

        // Add Elements
        strArr.add("Sonali");
        strArr.add("Singh");
        System.out.println(strArr);

        // Add at Specific Index
        strArr.add(1, "Saurabh");
        System.out.println(strArr);

        // Delete Element
        strArr.remove(2);
        System.out.println(strArr);

        strArr.remove("Sonali");
        System.out.println(strArr);

        // Update Value
        strArr.set(0, "Sonali");
        System.out.println(strArr);

        /* 
         * Each time the list exceeds its capacity, it resizes by 50% - can be costly
         * Each resize involves creating a new array and copying all existing members to it
        */

        strArr.add("Soni");
        System.out.println(strArr);

        // Clear All Elements
        strArr.clear(); 
        System.out.println(strArr);

        /*
         * Shallow Copy
         * @SuppressWarnings("unchecked")
         * ArrayList<String> clonedList = (ArrayList<String>) strArr.clone();
         * System.out.println(clonedList);
        */

        // Other Operations
        System.out.println(strArr.contains("Sonali"));
        System.out.println(strArr.isEmpty());
        strArr.add("arrayList");
        System.out.println(strArr.get(0));
        System.out.println(strArr.indexOf("arrayList"));
        strArr.add("demo");
        System.out.println(strArr.size());

        /*
         * Duplicates allowed
         * Insertion order is preserved
         * Heterogeneous objects allowed
         * Null insertion is possible
        */
    }
}
