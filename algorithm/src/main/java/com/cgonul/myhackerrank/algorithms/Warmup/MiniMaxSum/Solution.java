package com.cgonul.myhackerrank.algorithms.Warmup.MiniMaxSum;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] arr = new int[5];
		for(int arr_i = 0; arr_i < 5; arr_i++){
			arr[arr_i] = in.nextInt();
		}

		Long min = 0L;
		Long max = Long.MAX_VALUE;

		for(int i = 0; i < arr.length; i++){
			long tempSum = 0;
			for(int j = 0; j < arr.length; j++){
				if(j != i){
					tempSum += arr[j];
				}
			}
			if(tempSum < max){
				max = tempSum;
			}

			if(tempSum > min){
				min = tempSum;
			}
		}


		System.out.printf("%d %d%n", max, min);
	}
}
