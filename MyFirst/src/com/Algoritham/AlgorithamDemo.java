package com.Algoritham;

public class AlgorithamDemo {
	public static void main(String[] args) {
		int[] array = {1,5,2,55,4,8};
		
		AlgorithamDemo algo = new AlgorithamDemo();
		algo.bubbleSort(array);
	}
	
	
	
	public void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 1; j < arr.length-i; j++) {
				if (arr[j-1]>arr[j]) {
					int temp = arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for (int i : arr) {
			System.out.print(i+"  ");
		}
	}
	


}
