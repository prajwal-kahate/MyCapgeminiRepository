package com.DemoCollections;

import java.util.*;

public class DemoCollection {

	public static void main(String[] args) {
		ArrayList<Object> arrayList = new ArrayList();
		arrayList.add("name");
		arrayList.add(12.5);
		arrayList.add(10);
		arrayList.add(new Object());
		
		
		
		System.out.println(arrayList);
		
		TreeSet ts = new TreeSet();
		ts.add("k");
		System.out.println(ts);
		
		
		

	}

}
