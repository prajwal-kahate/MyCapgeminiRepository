package com.CheckComp;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.swing.JList;

public class CheckComparato{
	public static void main(String[] args) {
		List list1 = new ArrayList();
		list1.add("Ganesh");
		list1.add(100);
		
		
		List list2 = new ArrayList();
		list2.add("Mangesh");
		list2.add(200);
		
		List list3 = new ArrayList();
		list3.add("Raj");
		list3.add(300);
		
		List list4 = new ArrayList();
		list4.add("Ajay");
		list4.add(400);
		
		List list5 = new ArrayList();
		list5.add("Vinit");
		list5.add(500);
		
		List list6 = new ArrayList();
		list6.add("Shreyash");
		list6.add(600);
		
		
		List<List> list = new ArrayList<>();
		list.add(list1);
		list.add(list2);
		list.add(list3);
		list.add(list4);
		list.add(list5);
		list.add(list6);
		System.out.println(list);
		
		MyComparator mm =new  MyComparator();
		//Collections.sort(list,new  MyComparator());
		
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size(); j++) {
				if (mm.compare(list.get(i), list.get(j))<0) {
					List<String> temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}
		//System.out.println(list);
		
		for (List<String> sublist : list) {
			System.out.println(sublist);
		}
	
		//list.stream().sorted().collect(Collectors.toList());
		
		//System.out.println(list.stream().sorted().collect(Collectors.toList()));
	}
	
	
	

}
