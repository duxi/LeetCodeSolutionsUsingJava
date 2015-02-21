package com.easy.problems;

public class ExcelSheetColumnNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExcelSheetColumnNumber e=new ExcelSheetColumnNumber();
		String[] a="123123".split(",");
		for(String c : a){
			System.out.println(c);
		}
		System.out.println(a.length);
		//System.out.println(e.titleToNumber("AZ"));
		//System.out.println(e.numberToTitle(50));
	}
	
	
    public int titleToNumber(String s) {
    	int result=0;
        for(int i=0;i<s.length();i++){
        	
        	result+=(s.charAt(i)-'A'+1)*Math.pow(26, (s.length()-i-1));	
        }
        return result;
    }
    
    public String numberToTitle(int s){
    	StringBuffer result=new StringBuffer();

    	return result.reverse().toString();
    }

}
