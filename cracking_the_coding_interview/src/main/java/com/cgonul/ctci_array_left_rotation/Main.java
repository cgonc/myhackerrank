package com.cgonul.ctci_array_left_rotation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int a[] = new int[n];
		//		int n = 5;
		//		int k = 2;
		//		int a[] = new int[]{10, 20, 30, 40, 50};

		Map<Integer, Integer> resultMap = new HashMap<>();
		for(int a_i = 0; a_i < n; a_i++){
			a[a_i] = in.nextInt();
			int resultIndex = a_i - k;
			resultIndex = resultIndex % n;
			if(resultIndex < 0){
				resultIndex = resultIndex + n;
			}
			resultMap.put(resultIndex, a[a_i]);
		}

		StringBuilder result = new StringBuilder();
		for(int i = 0; i < n; i++){
			result.append(resultMap.get(i)).append(" ");
		}
		System.out.println(result.toString());

	}
}
