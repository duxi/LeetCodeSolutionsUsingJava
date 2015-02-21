package com.dx;


public class PaintXmasTree {	
	/**
	 * 
	 * @param mid 中轴位置
	 * @param start 开始层号
	 * @param level 层数
	 */
	public void printTree(int mid,int start, int level){
		for(int i=start;i<start+level;i++){
			printOnLine(mid,i);
			System.out.println();
		}	
	}
	
	/**
	 * 
	 * @param mid中轴位置
	 * @param level 当前层号
	 */
	private void printOnLine(int mid,int level){
		int space = (level*2-1)/2;
		for(int i=0;i<mid-1-space;i++){
		System.out.print(" ");
		}
		for(int j=0;j<level*2-1;j++){
		System.out.print("*");
		}
	}
	
	
	private void printOnLine(int mid,int num,String notion){
		if("RECT".equals(notion)){
			for(int i=0;i<mid-1-num/2;i++){
			System.out.print(" ");
			}
			for(int j=0;j<num;j++){
			System.out.print("*");
			}
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaintXmasTree t=new PaintXmasTree();
		t.printTree(40,1,10);
		t.printTree(40,4,10);
		t.printTree(40,7,10);
		for(int i=0;i<3;i++){
		t.printOnLine(40,8,"RECT");
		System.out.println();
		}
	}

}
