package com.serendipity.jdk8;

public class Test03_lambda03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test03_lambda03 test = new Test03_lambda03();
		MathOperation add=(int a,int b)->a+b;
		System.out.println(test.operate(2, 3, add));
		
	}

	interface MathOperation {
		int operation(int a, int b);
	}
	
	private int operate(int a,int b,MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}
}
