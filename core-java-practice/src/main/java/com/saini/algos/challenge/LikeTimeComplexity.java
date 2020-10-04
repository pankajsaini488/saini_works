package com.saini.algos.challenge;

public class LikeTimeComplexity {

	public static void main(String[] args) {
		int[] array1 = {4,-9,3};
		int[] array2 = {-3,7,3,-7};
		int[] array3 = {4,0,10,-5,-1,7};
		
		System.out.println(performLikeTimeComplexity(array1.length, array1));
		System.out.println(performLikeTimeComplexity(array2.length, array2));
		System.out.println(performLikeTimeComplexity(array3.length, array3));
	}

	private static int performLikeTimeComplexity(int length, int[] array) {
		int lastIndex = length-1;
		int sum = 0;
		int reducedSum = 0;
		for(int i = lastIndex; i >= 0 ; i--) {
			if (array[i] >= 0 || reducedSum - sum < array[i] * (i + 1)) {
				sum += array[i] * (i + 1);
				reducedSum += array[i] * (i);
			} else {
				sum = reducedSum;
			}
		}
		return sum;
	}

}
