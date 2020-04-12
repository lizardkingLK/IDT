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
		String idReg = "\\b([A-Za-z][A-Za-z0-9$_]*)\\b";
		String arrReg = "\\$[^\\$]*+\\$";
		
		String regex = "\"(?:\\\\\"|[^\"])*?\"";
		String replacement = "\"\"";
		String x = line.replaceAll(regex, replacement).replaceAll("[()\\.]", " ");
		
		List<String> myArr = new ArrayList<>();
		myArr.addAll(Arrays.asList(x.trim().split(" ")));
//		System.out.println(myArr);
		for (String y : myArr) {
			if( (!Arrays.asList(kArr).contains(y)) && (y.matches(idReg) || y.matches(arrReg)) ) {
//				System.out.println(y);
				++count;
			}
		}
		
		return count;
	}
	
	public static int getNOP(String line) {
		int count = 0;
		String[] kArr = Keywords.KEYWORDS;
		
		String regA = "[+-=\\/*%]";
		String regB = "[+-][+-]";
		String regC = "[+-\\/*%=<>!|&^][=]";
		String regD = "[<>]";
		String regE = "[&|][&|]";
		String regF = "[!]";
		String regG = "[|^~]";
		String regH = "[<>][<>]";
		String regI = "[<>][<>][<>]";
		String regJ = "[>][>][>][=]";
		String regK = "[<>][<>][=]";
		String regL = "[:-][:>]";
		String regM = "[,.]";
		String regN = "[a-zA-Z][+-][+-]";
		
		List<String> myArr = new ArrayList<>();
		myArr.addAll(Arrays.asList(line.replaceAll("[\"]", " ").replaceAll("[a-zA-Z0-9*][;]", " ").trim().split(" ")));
		System.out.println(myArr);
		for (String y : myArr) {
			if( (!Arrays.asList(kArr).contains(y)) ) {
				if(y.matches(regA) || 
					y.matches(regB) || 
					y.matches(regC) || 
					y.matches(regD) || 
					y.matches(regE) ||
					y.matches(regF) ||
					y.matches(regG) ||
					y.matches(regH) ||
					y.matches(regI) ||
					y.matches(regJ) ||
					y.matches(regK) ||
					y.matches(regL) ||
					y.matches(regM) ||
					y.matches(regN))  
				{
					System.out.println(y);
					count++;
				}
			}
		}
		
		return count;
	}
}
