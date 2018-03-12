package com.cgonul.ctci_making_anagrams;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	private static Map<Character, Integer> calculateFrequencyMap(String aString) {
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

	private static int getNumberOfDeletions(Map<Character, Integer> firstFrequencyMap, Map<Character, Integer> secondFrequencyMap) {
		int numberOfDeletions = 0;
		for(Character firstKey : firstFrequencyMap.keySet()){
			if(secondFrequencyMap.containsKey(firstKey)){
				int firstFrequency = firstFrequencyMap.get(firstKey);
				int secondFrequency = secondFrequencyMap.get(firstKey);
				numberOfDeletions += Math.abs(firstFrequency - secondFrequency);
				firstFrequencyMap.put(firstKey, 0);
				secondFrequencyMap.put(firstKey, 0);
			} else {
				numberOfDeletions += firstFrequencyMap.get(firstKey);
				firstFrequencyMap.put(firstKey, 0);
			}
		}
		return numberOfDeletions;
	}

	private static int numberNeeded(String first, String second) {
		Map<Character, Integer> firstFrequencyMap = calculateFrequencyMap(first);
		Map<Character, Integer> secondFrequencyMap = calculateFrequencyMap(second);
		return getNumberOfDeletions(firstFrequencyMap, secondFrequencyMap) + getNumberOfDeletions(secondFrequencyMap, firstFrequencyMap);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		System.out.println(numberNeeded(a, b));

	}
}
