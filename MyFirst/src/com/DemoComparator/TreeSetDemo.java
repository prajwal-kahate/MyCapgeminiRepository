package com.DemoComparator;

import java.util.*;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComparator());
		t.add("Prajwal");
		t.add("Harsh");
		t.add("Anuj");
		System.out.println(t);

	}

}

