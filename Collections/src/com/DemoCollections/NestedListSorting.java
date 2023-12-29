package com.DemoCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NestedListSorting {
    public static void main(String[] args) {
        List<Object> nestedList = new ArrayList<>();
        nestedList.add(2);
        nestedList.add("apple");
        List<Object> innerList1 = new ArrayList<>();
        innerList1.add(5);
        innerList1.add("banana");
        nestedList.add(innerList1);
        List<Object> innerList2 = new ArrayList<>();
        innerList2.add(1);
        innerList2.add("cherry");
        nestedList.add(innerList2);
        nestedList.add(4);
        nestedList.add("date");
        List<Object> innerList3 = new ArrayList<>();
        innerList3.add(3);
        innerList3.add("grape");
        nestedList.add(innerList3);

        // Define a custom comparator for sorting based on string values
        Comparator<Object> customComparator = new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof String && o2 instanceof String) {
                    return ((String) o1).compareTo((String) o2);
                }
                return 0; // For non-string elements, no change in order
            }
        };

        // Sort the nested list using the custom comparator
        Collections.sort(nestedList, customComparator);

        // Print the sorted nested list
        for (Object item : nestedList) {
            System.out.println(item);
        }
    }
}
