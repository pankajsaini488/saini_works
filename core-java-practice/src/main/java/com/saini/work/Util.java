package com.saini.work;

import java.util.Random;

/**
 * Hello world!
 *
 */
public class Util 
{

	/**
	 * @param array
	 * @param i
	 * @param j
	 */
	public static void swap(int[] array, int i, int j) {
		if(i == j) {
			return;
		}
		int tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}

	/**
	 * produces random int array provided the length of the array
	 * upper bound is 1000
	 * @param arrayLength
	 */
	public static int[] getRandomArray(int arrayLength) {
		int[]  array = new int[arrayLength];
		Random random = new Random();
		for (int i = 0; i< arrayLength; i++) {
			int val = random.nextInt(1000);
			if(val%5 == 0)
				val = -val;
			array[i] = val;
		}
		
		return array;
	}

	public static void print(int[] array) {
		for(int val: array)
			System.out.print(val+" ");
	}
}
