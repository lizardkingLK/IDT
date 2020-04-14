package com.controlstructure;

public class Test {

	public static String getRidOfQuotes(String line) {
		int start = 0;
		int end = 0;
		
		String newa = "";
		
		try {
			for(int i=0;i<line.length();i++) {
				int flag = 0;
				
				if((line.charAt(i)+"").matches("[\"]") || flag == 1) {
					flag++;
//					if(flag)
				}
			}
		} catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
		
//		System.out.println(line);
//		System.out.println(start+","+end);
		
//		String a = line.substring(start+1,end);
//		System.out.println(line.subSequence(start+1, end));
		
//		return (String) line.subSequence(start+1, end);
//		return getRidOfQuotes(a);
		return "";
	}
	
	public static void main(String[] args) {
		
		String Sa = "\"asdf\" "+12312+"\"sadfdsa\"";
//		System.out.println(Sa);
		
		String Sb = getRidOfQuotes(Sa);
//		System.out.println(Sb);
	}

}
