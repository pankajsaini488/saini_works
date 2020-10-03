package com.saini.algos.sort;

import com.saini.work.Util;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[]  array = Util.getRandomArray(20);
		
		performBubbleSort(Util.getRandomArray(20));
		
		Util.print(array);
	}
	
	//compares and swaps each element with its preceding element
	//in order to bubble the smallest element onto the top
	// in place algorithm
	//stable
	// O(n2)
	public static void performBubbleSortOptimized(int[] array) {
		for (int i=0; i < array.length; i++) {
			for(int j = array.length-1; j > i; j--) {
				if(array[j-1] > array[j]) {
					Util.swap(array, j-1, j);
				}
			}
		}
		
	}
	
	//swaps bubbles the smallest value to top of array
		// in place algorithm
		// O(n2)
	public static void performBubbleSort(int[] array) {
		for (int i=0; i < array.length; i++) {
			for(int j = array.length-1; j > 0; j--) {
				if(array[j-1] > array[j]) {
					Util.swap(array, j-1, j);
				}
			}
		}
		
	}

}
