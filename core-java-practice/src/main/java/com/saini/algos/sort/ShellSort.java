package com.saini.algos.sort;

import com.saini.work.Util;

public class ShellSort {

	public static void main(String[] args) {

		int[] array = Util.getRandomArray(15);
		
		performShellSort(array);
		
		Util.print(array);
	}

	
	public static void performShellSort(int[] array) {
		if(array.length == 1) {
			return;
		}

		for(int gap = array.length/2; gap>0; gap/=2) {
			
			for(int i = gap; i< array.length; i++) {
				int newElement = array[i];
					
				int j = i;
				while(j >= gap && array[j-gap] > newElement) {
					array[j] = array[j-gap];
					j-=gap;
				}
				array[j] = newElement;
			}
			
		}
	}

}
