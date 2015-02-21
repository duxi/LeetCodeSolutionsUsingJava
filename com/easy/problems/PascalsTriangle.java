package com.easy.problems;

import java.util.List;

public class PascalsTriangle {
	
	
    public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> result=null;
    if(numRows<=0){
    	return result;
    }
    for(int i=0;i<numRows;i++){
    	List<Integer> list=null;
    	for(int j=0;j<i+1;j++){
    		list.add((int)nChooseK(i,j));
    	}
    	
    }
    
    
    
    return result;
    
    }
    
    
    private long factorial(int num){
    	long factorial = 1L;
    	for (int index = 1; index <= num; index++) {
    	factorial = factorial * index;
    	}
    	return factorial;	
    }
	
    private long nChooseK(int n,int k){
    	return factorial(n)/(factorial(k)*factorial(n-k));
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PascalsTriangle p=new PascalsTriangle();
		System.out.println(p.generate(5));
	}

}
