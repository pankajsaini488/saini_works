package com.saini.algos.sort;

import com.saini.work.Util;

public class MergeSortMyImpl {

	public static void main(String[] args) {

		int[] array = Util.getRandomArray(10);
		Util.print(array);
		performMergeSplit(array, 0, array.length-1);
	}

	//{2,5,6,9,2,9,1,6}
	private static void performMergeSplit(int[] array, int start, int end) {
		
		if(end - start < 1) {
			return;
		}
		int mid = (start+end)/2;
		performMergeSplit(array, start, mid);
		performMergeSplit(array, mid+1, end);
		
		performMerge(array, start, mid, mid+1, end);
		
	}

	private static void performMerge(int[] array, int start1,int end1,int start2, int end2) {
		
		int[] tmparray = new int [end2-start1+1];
		int i;
		int fisrtStart = start1;
		int secStart = start2;
		
		for(i = 0; i< tmparray.length &&  fisrtStart <= end1  &&  secStart <= end2 ;  i++) {
			
			if(array[fisrtStart] <= array[secStart]) {
				tmparray[i] = array[fisrtStart];
				fisrtStart++;
			}
			else if(array[fisrtStart] > array[secStart]) {
				tmparray[i] = array[secStart];
				secStart++;
			}
		}
		
		if(fisrtStart <= end1) {
		for (int k = fisrtStart; k <= end1; k++) {
				tmparray[i++] = array[k];
			}
		}
		
		if(secStart <= end2) {
		for (int k = secStart; k <= end2; k++) {
				tmparray[i++] = array[k];
			}
		}
		
		System.out.println("-----------");
		Util.print(tmparray);
		
		for(int j = 0, k = start1; k<= end2; k++, j++) {
			array[k] = tmparray[j];
		}
		
		
		
	}

}
