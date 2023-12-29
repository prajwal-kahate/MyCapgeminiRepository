package com.Hacker;

import java.util.*;

public class HackerPro {
	static public List<Long> trade(List<String> argument){
		List<Long> list = new ArrayList();
		Map<String, Long> map = new HashMap<>();
		Map<String, Long> map1 = new HashMap<>();
		
		for (String list1 : argument) {
			String[] arr = list1.split(" ");
			switch (arr[0]) {
			case "BYE": 
				Long l1 = Long.parseLong(arr[2]);
				map.put(arr[1], l1);
				break;
			
			case "SELL": 
				Long l2 = Long.parseLong(arr[2]);
				
				map.put(arr[1], map.get(arr[1])+l2);
				System.out.println(map);
				break;
			case "CHANGE":
				
				break;
			case "QUEARY":
				break;
			
			}
		}
		
		return list;
		
	}

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("BYE ganesh 100");
		list.add("SELL ganesh 100");
		trade(list);
		
		
		
		
		
		
	}

}
