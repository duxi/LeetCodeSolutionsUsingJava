package com.dx;


import java.util.Hashtable;

public class pickHero {

	public static class A{
		{System.out.println("�ڲ��ྲ̬�����");}
		static {
			System.out.println("�ڲ��ྲ̬�����");
		}
	}
	
	static {
		System.out.println("��̬�����");
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
