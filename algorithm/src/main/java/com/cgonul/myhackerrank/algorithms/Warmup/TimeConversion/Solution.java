package com.cgonul.myhackerrank.algorithms.Warmup.TimeConversion;

import java.util.Scanner;

public class Solution {

	static String timeConversion(String s) {
		if(s.contains("PM")){
			s = s.replace("PM","");
			String[] split = s.split(":");
			Integer hour = new Integer(split[0]);
			if(hour < 12){
				hour += 12;
			}
			return String.format("%02d:%s:%s", hour, split[1], split[2]);
		}
		s = s.replace("AM","");
		String[] split = s.split(":");
		Integer hour = new Integer(split[0]);
		if(hour == 12){
			hour = 0;
		}
		return String.format("%02d:%s:%s", hour, split[1], split[2]);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String result = timeConversion(s);
		System.out.println(result);
	}
}