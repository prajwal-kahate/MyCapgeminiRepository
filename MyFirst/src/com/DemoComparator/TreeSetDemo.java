package com.DemoComparator;

import java.util.*;
import java.util.stream.Collectors;
import java.util.Collections;
import javax.swing.JList;

public class TreeSetDemo {

	public static void main(String[] args) {
//		TreeSet t = new TreeSet(new MyComparator());
//		t.add("Prajwal");
//		t.add("Harsh");
//		t.add("Anuj");
//		System.out.println(t);

		List list1 = new ArrayList();
		list1.add(1);
		list1.add("Prajwal");
		list1.add("Kahate");

		List list2 = new ArrayList();
		list2.add(2);
		list2.add("Manas");
		list2.add("Jayswal");

		List list3 = new ArrayList();
		list3.add(3);
		list3.add("Imam");
		list3.add("Sheik");
		
		List list4 = new ArrayList();
		list4.add(6);
		list4.add("Chandler");
		list4.add("Gill");

		List<List> list = new ArrayList();
		list.add(list1);
		list.add(list2);
		list.add(list3);
		list.add(list4);
		
		
		

		Comparator<List<Object>> customComparator = new Comparator<List<Object>>() {
			@Override
			public int compare(List<Object> list1, List<Object> list2) {
				String int1 = (String) list1.get(1);
				String int2 = (String) list2.get(1);
				return int1.compareTo(int2);
			}
		};
		// Manually sort the list using a simple bubble sort algorithm
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (customComparator.compare(list.get(i), list.get(j)) > 0) {
					// Swap elements if they are out of order
					List<Object> temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}

		// Print the sorted nested list
		for (List<Object> sublist : list) {
			System.out.println(sublist);
		}
	}

	// Sort the nested list using the custom comparator

	// Collections.sort(list, customComparator);

//		List list6 = new ArrayList();
//		
//		List<List> rList = new ArrayList();
//		Comparator<List<List<String>>> customComparator = new Comparator<List<List<String>>>() {
//            @Override
//            public int compare(List<List<String>> sublist1, List<List<String>> sublist2) {
//                String string1 = sublist1.get(2); // Assuming the second string is used for sorting
//                String string2 = sublist2.get(2);
//                return string1.compareTo(string2);
//            }
//
//			@Override
//			public int compare(List<List<String>> o1, List<List<String>> o2) {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//        
//		};
//
//        Collections.sort(list, customComparator);
//        
////        for (int i = 0; i < 3; i++) {
////        	
////		}
//		//Collections.sort(list, customComparator);
//		
//		//MyComparator myComparator = new  MyComparator();
//		
//		
//		
////		for (int i = 0; i < 3; i++) {
////			
////			list6.add(list.get(i).get(1));
////			
////			//System.out.println(list.get(i).get(1)+" ");
////			//int x  = myComparator.compare(list.get(i).get(1), list.get(i+1).get(1));
////			//System.out.println(x);
//////			for (int j = 0; j <=2; j++) {
//////				System.out.print(list.get(i).get(j)+" ");
//////				System.out.print(list.get(i).get(j+1));
//////				System.out.println();
//////				int x =myComparator.compare(list.get(i).get(j), list.get(i).get(j+1));
//////							
//////			}
////			//
////		}
////		List<List> collect = list.stream().sorted(().collect(Collectors.toList());
////		Object[] aa = new Object[3];
////		for (int i = 0; i < 3; i++) {
////			for (int j = 0; j < 2; j++) {
////				if(list6.get(i).equals(list.get(i).get(j)) ) {
////					aa[i]=(list.get(i));
////				}
////			}
////			
////		}
////		for (int i = 0; i < aa.length; i++) {
////			Object object = aa[i];
////			System.out.println(object);
////		}
////		
//		
//

	
}

