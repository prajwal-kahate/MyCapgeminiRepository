package com.DemoCollections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoStream {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList();
		arrayList.add(1);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(4);
		arrayList.add(6);
		arrayList.add(2);
		arrayList.add(0);
		List<Integer> list= arrayList.stream().sorted().collect(Collectors.toList());
		List<Integer> list2= arrayList.stream().sorted((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList());
		System.out.println(list);
		System.out.println(list2);
		
		int x =arrayList.stream().max((i1,i2)->i2.compareTo(i1)).get();
		System.out.println(x);
		
		List list3 = list.stream().map(i->i+2).collect(Collectors.toList());
		System.out.println(list3);
		
		
		int y =list.stream().max((i1,i2)->i2.compareTo(i1)).get();
		System.out.println(y);
		
		
		Optional<Integer> l1 = list.stream().sorted(Comparator.reverseOrder()).limit(2).skip(1).findFirst();
		System.out.println(l1.get());
		
	}

}
