package com.variable;

import com.utility.CleanLine;

public class Variable {
	static int oe = 0;
	
	public static int getWVS(String line) {
		String newLine = CleanLine.getCleanLine(line);
		System.out.println(newLine);
		return getScope(newLine);
	}
	
	public static int getNPDTV(String line) {
		return 1;
	}

	public static int getNCDTV(String line) {
		return 1;
	}
	
	public static int getScope(String line) {
		int s = 0;
		// checks if global - 2
		if(handleStack(line) == 1) {
			// checks if contains variable
			if(isVariable(line))
				return 2;
			else
				return s;
		}
		// else local - 1
		else {
			// checks if contains variable
			if(isVariable(line))
				return 1;
			else
				return s;
		}
	}
	
	public static boolean isVariable(String l) {
		String line = l.replaceAll("[\"]", "");
		String[] sArr = line.split(" ");
		int c = 0;
		boolean valid = false;
		
		for (String s : sArr) {
			System.out.println("WORD "+s);
			if(s.matches("\\b[a-z][a-zA-Z0-9$_]*\\b") || s.matches("\\b[a-zA-Z0-9$_]*\\b[<][a-zA-Z0-9$_]*[>]"))
				c++;
			if(s.matches("[=]") || s.contains("=")) {
				if(!s.contains("==")) {
					c++;
					valid = true;
				}
			}
		}
		System.out.println(c);
		return valid && c >= 3;
	}
	
	public static int handleStack(String l) {
		String input = l; 
		for (Character ch: input.toCharArray()) {
			if(ch == '{') {
				oe++;
			}
			else if(ch == '}') {
				oe--;
			}
		}
		
		return oe;
	}
	
	public static void main(String[] args) {
		getWVS("dasfsd = \"asdfsadfsa\"; //asdfsdafsdasds");
		System.out.println(handleStack("{{{}"));
		System.out.println(handleStack("}}}{"));
		System.out.println(isVariable("int<sdf> a = \"1231sdadf\""));
		System.out.println(isVariable("int a = \"1231sdadf\""));
		System.out.println(isVariable("ArrayList<String> a = \"1231sdadf\""));
	}
}
