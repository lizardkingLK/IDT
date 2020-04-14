package com.controlstructure;

public class ControlStructure {
	public static String getCleanLine(String line) {
		String cleanLine = line;
		
		if(line.contains("//")) {
			if(cleanLine.contains("public class"))
				cleanLine = cleanLine.replace("public class", "class");
			String comment = cleanLine.substring(cleanLine.indexOf("/", 0) , cleanLine.length());
			cleanLine = cleanLine.replace(comment, " ");
		}
		
		return cleanLine;
	}
	
	public static String getRidOfQuotes(String line) {
		String newLine = line;
		String newa = "";
		
		try {
			int flag = 0;
			for(int i=0;i<newLine.length();i++) {
				
				if((newLine.charAt(i)+"").matches("[\"]")) {
					++flag;
				}
				
				if(flag%2 == 0)
					newa += newLine.charAt(i);
			}
		} catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
		
		String newestLine = newa.replaceAll("[\"]", "").trim();
		
		return newestLine;
	}
	
	public static int getWTCS(String line) {
		int count = 0;
		String cleanLine = getCleanLine(line);
		String newLine = getRidOfQuotes(cleanLine);
		
//		System.out.println(newLine);
		
		if(newLine.contains(" if ") ||
			newLine.contains("if(") || 
			newLine.contains("}if(") || 
			newLine.contains("}if (") ||
			
			newLine.contains(" else if ") || 
			newLine.contains("else if(") || 
			newLine.contains("}else if(") || 
			newLine.contains("else if (")) {
			count += 2;
		}
		if(newLine.contains(" switch ") ||
			newLine.contains("switch(") || 
			newLine.contains("}switch(") || 
			newLine.contains("}switch (")) {
			count += 2;
		}
		if(newLine.contains(" case ") ||
			newLine.contains("case")) {
			count += 1;
		}
		if(newLine.contains(" for ") ||
			newLine.contains("for(") || 
			newLine.contains("}for(") || 
			newLine.contains("}for (") || 

			newLine.contains(" while ") ||
			newLine.contains("while(") || 
			newLine.contains("}while(") || 
			newLine.contains("}while (")) {
			count += 3;
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		int wtcsA = getWTCS("if( String a = \"if(\"; { // this is some bs inside A");
		System.out.println(wtcsA);
		
		int wtcsB = getWTCS(" }if( { // this is some bs inside B");
		System.out.println(wtcsB);
		
		int wtcsC = getWTCS("else if( { // this is some bs inside C");
		System.out.println(wtcsC);
		
		int wtcsD = getWTCS(" }else if( { // this is some bs inside D");
		System.out.println(wtcsD);
		
		int wtcsE = getWTCS("while( { // this is some bs inside E");
		System.out.println(wtcsE);
		
		int wtcsF = getWTCS(" }while( { // this is some bs inside F");
		System.out.println(wtcsF);
		
		int wtcsG = getWTCS("for( { // this is some bs inside G");
		System.out.println(wtcsG);
		
		int wtcsH = getWTCS(" }for( { // this is some bs inside H");
		System.out.println(wtcsH);
		
		int wtcsI = getWTCS("switch( { // this is some bs inside I");
		System.out.println(wtcsI);
		
		int wtcsJ = getWTCS(" }switch( { // this is some bs inside J");
		System.out.println(wtcsJ);
		
		int wtcsK = getWTCS("switch( { // this is some bs inside K");
		System.out.println(wtcsK);
		
		int wtcsL = getWTCS(" }switch( { // this is some bs inside L");
		System.out.println(wtcsL);
		
		int wtcsM = getWTCS(" case // this is some bs inside M");
		System.out.println(wtcsM);
		
		int wtcsN = getWTCS("case( // this is some bs inside N");
		System.out.println(wtcsN);
	}
}
