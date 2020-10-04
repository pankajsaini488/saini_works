package com.saini.algos.sort;

import com.saini.work.Util;

public class MergeSort {

	public static void main(String[] args) {

		int[] array = Util.getRandomArray(10);
		Util.print(array);
		performMergeSplit(array, 0, array.length);
		

		
		System.out.println("-----------");
		Util.print(array);
	}

	//{2,5,6,9,2,9,1,6}
	private static void performMergeSplit(int[] array, int start, int end) {
		
		if(end - start < 2) {
			return;
		}
		int mid = (start+end)/2;
		performMergeSplit(array, start, mid);
		performMergeSplit(array, mid, end);
		
		performMerge(array, start, mid, end);
		
	}
	//not in place
	//optimized
	private static void performMerge(int[] array, int start, int mid, int end) {
		
		if(array[mid-1] < array[mid]) {
			return;
		}
		int[] tmparray = new int [end-start];
		int tmpIndex = 0;
		int i = start;
		int j = mid;
		
		
		while(i < mid && j < end) {
			tmparray[tmpIndex++] = array[i] <= array[j]? array[i++]: array[j++];
		}
		
		System.arraycopy(array, i, array, start+tmpIndex, mid-i);
		System.arraycopy(tmparray, 0, array, start, tmpIndex);
		
		
		
	}

}
