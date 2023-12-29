package com.Practice;

import java.util.HashMap;
import java.util.*;
import java.util.Map;
import java.util.Map.Entry;

public class Main {
	int x = 15;

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "Manikanta");
		map.put(2, "CharanAnna");
		map.put(3, "Rakesh");
		map.put(4, "Pawan");
		map.put(5, "Moin");
		map.put(6, "Rahul");
		
		map.putIfAbsent(3, "Mangesh");
		//map.clear();
		
		System.out.println(map);
		System.out.println(map.get(3));
		System.out.println(map.values());
		
		System.out.println(map.keySet());
		
		map.replace(1, "Guram");
		
		//Entry<Integer, String> emap= (Entry<Integer, String>) map.entrySet();
		for (Entry<Integer, String> eset : map.entrySet()) {
			System.out.println(eset);
			
		}

		System.out.println("Size: "+map.size());
		System.out.println(map.getOrDefault(9,"Sahi Value dal na"));
		
		
		Collection collection = map.values();
		System.out.println(collection);
		
		//System.out.println(map.values());
		
		
		Var var = Var.num;
		
	
	}

}
