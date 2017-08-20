package com.cgonul.myhackerrank.algorithms.staircase;

import java.util.Collections;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i = 1; i <= n; i++){
			String emptyLevel = String.join("", Collections.nCopies(n-i, " "));
			String diesLevel = String.join("", Collections.nCopies(i, "#"));
			System.out.printf("%s%s%n", emptyLevel, diesLevel);
		}
	}
}
