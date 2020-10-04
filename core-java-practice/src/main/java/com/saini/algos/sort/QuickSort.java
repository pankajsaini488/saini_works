package com.saini.algos.sort;

import com.saini.work.Util;

public class QuickSort {

	public static void main(String[] args) {
		int[] array = Util.getRandomArray(10);
		Util.print(array);
		
		quickSort(array, 0, array.length);

		
		System.out.println("-----------");
		Util.print(array);

	}

	private static void quickSort(int[] array, int start, int end) {

		if(end-start < 2) {
			return;
		}
		
		int piotindex = partition(array, start, end);
		
		quickSort(array, 0 , piotindex);
		quickSort(array, piotindex+1, end);
		
	}

	private static int partition(int[] array, int start, int end) {
		
		int pivot = array[start];
		int i = start;
		int j = end;
		
		while(i < j) {

			while (i<j && array[--j] > pivot);
			if(i<j) {
				array[i] = array[j];
			}
			
			while(i<j && array[++i] < pivot);
			if(i<j) {
				array[j] = array[i];
			}
			
		}
		
		array[i] = pivot;
		return i;
	}

}
