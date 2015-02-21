package com.dx;


import java.util.Hashtable;

public class pickHero {

	public static class A{
		{System.out.println("内部类静态块加载");}
		static {
			System.out.println("内部类静态块加载");
		}
	}
	
	static {
		System.out.println("静态块加载");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//pickHero t=new pickHero();
		//System.out.println(hs.get(2));
		Class c = pickHero.A.class;
		pickHero t=new pickHero();
		pickHero.A a = A;
	}
}
