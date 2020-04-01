package com.size;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.strings.Keywords;

public class Size {
	public static int getNKW(String line) {
		int count = 0;
		String[] kArr = Keywords.KEYWORDS;
		String x = line.replaceAll("[()]", " ");
		
		List<String> myArr = new ArrayList<>();
		myArr.addAll(Arrays.asList(x.split(" ")));
		
		for (String y : myArr) {
			if(Arrays.asList(kArr).contains(y)) {
				++count;
			}
		}
		
		return count;
	}
	
	public static int getNID(String line) {
		int count = 0;
		String[] kArr = Keywords.KEYWORDS;
		String idReg = "\\b([A-Za-z][A-Za-z0-9_]*)\\b";
		
		String regex = "\"(?:\\\\\"|[^\"])*?\"";
		String replacement = "\"\"";
		String x = line.replaceAll(regex, replacement).replaceAll("[()\\.]", " ");
		
		List<String> myArr = new ArrayList<>();
		myArr.addAll(Arrays.asList(x.trim().split(" ")));
		System.out.println(myArr);
		for (String y : myArr) {
			if(!Arrays.asList(kArr).contains(y) && y.matches(idReg)) {
				System.out.println(y);
				++count;
			}
		}
		
		return count;
	}
}
