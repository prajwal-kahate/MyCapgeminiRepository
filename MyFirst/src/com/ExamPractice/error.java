package com.ExamPractice;

import java.util.Arrays;
import java.util.List;

class error
{
	public static void main(String args[])
	{
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
		Integer sum = numbers.stream().reduce(2, (a, b) -> a * b);
		System.out.println(sum);

	}
}
