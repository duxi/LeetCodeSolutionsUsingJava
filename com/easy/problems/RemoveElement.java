package com.easy.problems;

public class RemoveElement {
	
    public int removeElement(int[] A, int elem) {
    	int index = A.length-1;
    	int length = 0;
        for(int i=0;i<A.length;i++){
        	if(A[i]==elem){
        	swap(A[i],A[index-i]);
        	length++;
        	}
        }
        return length;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
