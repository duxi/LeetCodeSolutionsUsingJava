package com.easy.problems;

public class LengthOfLastWord {
	
	
    public int lengthOfLastWord(String s) {
        if(s==null||s.length()==0)return 0;
        String[] list=s.split(" ");
        if(list.length>0){
        return list[list.length-1].length();
        }else{
        	return 0;
        }
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
