package com.easy.problems;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Hashtable;
/**
 * Given an array of integers, find two numbers such that they add up to a specific target number.
 * The function twoSum should return indices of the two numbers such that they add up to the target,
 * where index1 must be less than index2. 
 * Please note that your returned answers (both index1 and index2) are not zero-based.
 * You may assume that each input would have exactly one solution.
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 * @author hippo_flying
 *
 */

class Pair implements Comparable<Pair>{
    public int number;
    public int idx;
    public Pair(int number, int idx){
        this.number = number;
        this.idx = idx;
    }
    public int compareTo(Pair other){
        return this.number - other.number;
    }
}

public class TwoSum {
	public static int[] twoSum(int[] numbers, int target) {
//		int[] result=new int[2];
//		Pair[] pairs=new Pair[numbers.length];
//		for(int i=0;i<numbers.length;i++){
//			pairs[i]=new Pair(numbers[i],i+1);
//		}
//		Arrays.sort(pairs);
//		int head=0;
//		int tail=numbers.length-1;
//		while(head<tail){
//			if(pairs[head].number+pairs[tail].number==target){
//				if(pairs[head].idx<pairs[tail].idx){
//					result[0]=pairs[head].idx;
//					result[1]=pairs[tail].idx;
//				}else{
//					result[1]=pairs[head].idx;
//					result[0]=pairs[tail].idx;
//				}
//				break;
//			}else if(pairs[head].number+pairs[tail].number>target){
//				tail--;
//			}else{
//				head++;
//			}
//		}
//		
//		return result;
//	
		//Hashtable×ö·¨
		int result[] = new int[2];
			Hashtable<Integer, Integer> queryTable = new Hashtable<Integer, Integer>();
			for (int i = 0; i < numbers.length; i++) {
				if(queryTable.containsKey(target-numbers[i])){
					result[1]=i+1;
					result[0]=queryTable.get(target-numbers[i]);
				}else{
					queryTable.put(numbers[i], i+1);
				}
			}
		
	    return result;
		
		
		
		
		
	}
	
	public static void main(String[] args){
		DecimalFormat a = new DecimalFormat("0.00%");
		String b=a.format(0.0036);
		System.out.println(b);
		
	}

}
