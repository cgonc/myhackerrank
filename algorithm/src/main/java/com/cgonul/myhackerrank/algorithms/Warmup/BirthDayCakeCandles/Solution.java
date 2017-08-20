package com.cgonul.myhackerrank.algorithms.Warmup.BirthDayCakeCandles;

import java.util.Scanner;
import java.util.Stack;

public class Solution {

	static int birthdayCakeCandles(int n, int[] ar) {
		Stack<Integer> sortedLocalMaximums = new Stack<>();
		sortedLocalMaximums.push(0);
		for(int height : ar){
			if(height > sortedLocalMaximums.peek()){
				sortedLocalMaximums = new Stack<>();
				sortedLocalMaximums.push(height);
				continue;
			}
			if(height == sortedLocalMaximums.peek()){
				sortedLocalMaximums.push(height);
			}
		}

		return sortedLocalMaximums.size();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for(int ar_i = 0; ar_i < n; ar_i++){
			ar[ar_i] = in.nextInt();
		}
		int result = birthdayCakeCandles(n, ar);
		System.out.println(result);
	}
}
