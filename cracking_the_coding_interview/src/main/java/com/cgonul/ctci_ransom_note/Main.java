package com.cgonul.ctci_ransom_note;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();

		Map<String, Integer> magazineMap = new HashMap<>();
		for(int magazine_i = 0; magazine_i < m; magazine_i++){
			String magazineWord = in.next();
			if(magazineMap.containsKey(magazineWord)){
				Integer magazineWordCount = magazineMap.get(magazineWord);
				magazineMap.put(magazineWord, magazineWordCount + 1);
			} else {
				magazineMap.put(magazineWord, 1);
			}
		}
		boolean canHeDoIt = true;
		for(int ransom_i = 0; ransom_i < n; ransom_i++){
			String ransomWord = in.next();
			if(canHeDoIt){
				if(magazineMap.containsKey(ransomWord)){
					Integer magazineWordCount = magazineMap.get(ransomWord);
					magazineWordCount = magazineWordCount - 1;
					if(magazineWordCount < 0){
						canHeDoIt = false;
					} else {
						magazineMap.put(ransomWord, magazineWordCount);
					}
				} else {
					canHeDoIt = false;
				}
			}
		}

		if(canHeDoIt){
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
