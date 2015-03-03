package com.easy.problems;

public class ExcelSheetColumnTitle {
    public String convertToTitle(int n) {
    	
    	
    	
    	StringBuffer result=new StringBuffer();
    	while(n%27>=0&&n!=0){
    		result.append((char)(n%27+65));
    	    
    		n=n/27;
    	}
    	return result.reverse().toString();
    }
}
