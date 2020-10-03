package com.saini.algos.sort;

import com.saini.work.Util;

public class InsertionSort {

	public static void main(String[] args) {
		int[] array = Util.getRandomArray(8);
		
		performInsertionSort(array);
		
		Util.print(array);

	}

	//O(n2)
	// in place
	// involves lots of shifting mostly
	//shell sort can improve this shifting issue
	// for almost sorted array it performs almost linear 
	//stable
	private static void performInsertionSort(int[] array) {
		if(array.length == 1) {
			return;
		}

		for(int unsortedIndex = 1; unsortedIndex < array.length; unsortedIndex ++) {
			int newElement = array[unsortedIndex];
			int j ;
			for( j = unsortedIndex; j > 0 && array[j-1] > newElement; j--) {
				array[j] = array[j-1];
			}
			array[j] = newElement;
		}
	}

}
