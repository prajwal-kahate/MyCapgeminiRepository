package com.Lab6.CollectionFramework;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.Map.Entry;

public class DemoCollectionFramework {

	// Exercise 1: Create a method which accepts a hash map and return the
	// values of the map in sorted order as a List.
	public List getValues(HashMap hashMap) {

		List arrayList = new ArrayList();
		arrayList.addAll(hashMap.values());
		Collections.sort(arrayList);
		return arrayList;

		// (Map.Entry);

	}

	// Exercise2 Collection: Create a method that accepts a character array
	// and count the number of times each character is present in the array.
	public Map<Character, Integer> countChars(char[] arr) {

		Map<Character, Integer> map = new HashMap();

		for (int i = 0; i < arr.length; i++) {

			if (map.containsKey(arr[i])) {
				int count = map.get(arr[i]);
				map.put(arr[i], ++count);
			} else {
				map.put(arr[i], 1);
			}
		}
		return map;

	}
	// Exercise 3: Create a method which accepts an array of numbers and returns the
	// numbers and their squares in Hashmap

	public Map getSquares(int[] arr) {
		// List list = Arrays.asList(arr);

		Map map = new TreeMap();
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], arr[i] * arr[i]);
		}

		return map;
	}

	// Exercise 4: school offers medals to the students of tenth based on the
	// following criteria
	// If(Marks>=90) : Gold
	//
	// If(Marks between 80 and 90) : Silver
	// If(Marks between 70 and 80) : Bronze
	// Note: Marks between 80 and 90 means marks>=80 and marks<90

	// Write a function which accepts the marks of students as a Hashmap
	// and return the details of the students eligible for the medals along with
	// type of medal.
	// The input Hashmap contains the student registration number as key and mark as
	// value.
	// The output Hashmap should contain the student registration number as key and
	// the medal type as value.

	public HashMap<Integer, String> getStudents(HashMap<Integer, Integer> hashMap) {

		Map<Integer, String> map = new HashMap<>();
		for (Map.Entry<Integer, Integer> map1 : hashMap.entrySet()) {
			// Integer i =map1.getKey();
			if (hashMap.get(map1.getKey()) >= 90) {
				map.put(map1.getKey(), "Gold");
			} else if (hashMap.get(map1.getKey()) >= 80) {
				map.put(map1.getKey(), "Silver");
			} else if (hashMap.get(map1.getKey()) >= 70) {
				map.put(map1.getKey(), "Bronze");
			}
		}

		return (HashMap<Integer, String>) map;

	}

	// Exercise 5: Create a method which accepts an array of integer elements
	// and return the second smallest element in the array
	public int getSecondSmallest(int[] arr) {

		List list = new ArrayList();
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		Collections.sort(list);
		int num = (int) list.get(1);

		return num;
	}

	// Exercise 6: Create a method which accepts the id and the age of people as a
	// Map and decide if they are eligible for vote. A person is eligible for vote
	// if his age is greater than 18. Add the IDs of all the eligible persons to
	// list and return the list.

	public List votersList(HashMap<Integer, LocalDate> hashMap) {
		// Map map = new HashMap();
		List list = new ArrayList();

		for (Map.Entry<Integer, LocalDate> map1 : hashMap.entrySet()) {
			Period period = Period.between(hashMap.get(map1.getKey()), LocalDate.now());
			if (period.getYears() >= 18 && period.getDays() >= 1) {
				list.add(map1.getKey());
			}
			// map.put(map1.getKey(), period.getYears());
			// System.out.println(map);
		}
		return list;
	}

	// Exercise 7: Create a method which accepts an integer array, reverse the
	// numbers in the array and returns the resulting array in sorted order
	public void getSorted(int[] arr){
		
		String string = Arrays.toString(arr);
		System.out.println(string);
		for (int i = string.length()-1; i >=0 ; i--) {
			System.out.print( string.charAt(i));
		}
//		return 0;
	}
	
}
