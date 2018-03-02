package com.cgonul.ctci_making_anagrams;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static Map<Character, Integer> calculateFrequnencyMap(String aString) {
		Map<Character, Integer> result = new HashMap<>();
		for(Character c : aString.toCharArray()){
			if(result.containsKey(c)){
				Integer currentFrequency = result.get(c);
				currentFrequency += 1;
				result.put(c, currentFrequency);
			} else {
				result.put(c, 1);
			}
		}
		return result;
	}

	public static int getNumberOfDeletions(Map<Character, Integer> firstFrequencyMap, Map<Character, Integer> secondFrequencyMap) {
		int numberOfDeletions = 0;
		for(Character firstKey : firstFrequencyMap.keySet()){
			if(secondFrequencyMap.containsKey(firstKey)){
				int firstFrequency = firstFrequencyMap.get(firstKey);
				int secondFrequency = secondFrequencyMap.get(firstKey);
				numberOfDeletions += Math.abs(firstFrequency - secondFrequency);
				firstFrequencyMap.put(firstKey,0);
				secondFrequencyMap.put(firstKey,0);
			} else {
				numberOfDeletions += firstFrequencyMap.get(firstKey);
				firstFrequencyMap.put(firstKey,0);
			}
		}
		return numberOfDeletions;
	}

	public static int numberNeeded(String first, String second) {
		Map<Character, Integer> firstFrequencyMap = calculateFrequnencyMap(first);
		Map<Character, Integer> secondFrequencyMap = calculateFrequnencyMap(second);

		int numberOfDeletions = 0;
		numberOfDeletions = getNumberOfDeletions(firstFrequencyMap, secondFrequencyMap) + getNumberOfDeletions(secondFrequencyMap, firstFrequencyMap);

		return numberOfDeletions;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		String a = in.next();
//		String b = in.next();
		String a = "cde";
		String b = "abc";
		System.out.println(numberNeeded(a, b));

	}
}
