package com.Lab6.CollectionFramework;

import java.time.LocalDate;
import java.util.*;

public class Test {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		HashMap hashMap = new HashMap();
		hashMap.put(1, "Harsh");
		hashMap.put(7, "Mani");
		hashMap.put(5, "Kanta");
		hashMap.put(3, "Lala");
		
		/*
		hashMap.get(1); // "Harsh"
		
		Set e = hashMap.entrySet();
		
//		Iterator iterator = e.iterator();
//		while (iterator.hasNext()) {
//			Map.Entry entry =(Map.Entry)iterator.next();
//          entry.getKey();
//          entry.getValue();
//			System.out.println(hashMap.keySet());
//			hashMap.keySet();
//		}
		*/
		
		
//		System.out.println("How many values You want to add: ");
//		int value =sc.nextInt();
//		int[] arr = new int[value];
//		
//		
//		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println("Enter Number ");
//			int num =sc.nextInt();
//			arr[i]=num;
//		}
		
		
		DemoCollectionFramework dCollection = new DemoCollectionFramework();
//		System.out.println("Ans: "+dCollection.getSecondSmallest(arr));
//		
//		System.out.println(dCollection.getValues(hashMap));
//		
//		char[] charArray = {'P','R','A','J','W','A','L'};
//		System.out.println(dCollection.countChars(charArray));
		
		//System.out.println(dCollection.getSquares(arr));
		
//		HashMap hashMap1 = new HashMap();
//		hashMap1.put(121, 90);
//		hashMap1.put(124, 85);
//		hashMap1.put(126, 77);
//		System.out.println(dCollection.getStudents(hashMap1));
		
//		HashMap hashMap5 = new HashMap();
//		hashMap5.put(121, LocalDate.of(2011, 10, 15));
//		hashMap5.put(124, LocalDate.of(2001, 10, 12));
//		hashMap5.put(126, LocalDate.of(2009, 10, 1));
//		hashMap5.put(100, LocalDate.of(2005, 10, 19));
//		
//		System.out.println(dCollection.votersList(hashMap5));
		int[] arr = {13,77,9,21,3,15,};
		dCollection.getSorted(arr);
		
	}
	
}
