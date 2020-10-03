package com.saini.algos.sort;

import com.saini.work.Util;

public class SelectionSort {

	public static void main(String[] args) {

		int[] array = Util.getRandomArray(8);
		
		performSelectionSort(array);
		
		Util.print(array);
	}

	/** compare and select the index of smaller element
	 * perform swap only once per iteration
	 * perform better than bubble sort
	 * In place algorithm 
	 * O(n2) time complexity
	 * stable
	 * @param array
	 */
	public static void performSelectionSort(int[] array) {
		for(int i = 0; i< array.length; i++) {
			
			int index = i;
			for(int j = i; j < array.length ; j++) {
				
				if(array[index] > array[j]) {
					index = j;
				}
			}
			Util.swap(array, i, index);
		}
	}

}
