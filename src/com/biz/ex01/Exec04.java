package com.biz.ex01;

public class Exec04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intNum = add();
		String nation = char1();
		System.out.println(nation);
		
	}
	
	public static int add() {
		int intNum1 = 30;
		int intNum2 = 40;
		int intSum = intNum1 + intNum2;
		
		return intSum;
		
	}
	public static String char1() {
		String char1 = "Korea";
		return char1;
		
	}

}
