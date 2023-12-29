package com.CheckComp;
import java.util.*;

public class MyComparator implements Comparator<List<String>>{

	
	
	@Override
	public int compare(List<String> o1, List<String> o2) {
		String s1 = o1.get(0);
		String s2 = o2.get(0);
		
		return s1.compareTo(s2);
	}

}
