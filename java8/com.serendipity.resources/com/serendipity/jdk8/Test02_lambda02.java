package com.serendipity.jdk8;


public class Test02_lambda02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Action() {

			@Override
			public void execute(String content) {
				// TODO Auto-generated method stub
				System.out.println(content);
			}
			
		}.execute("jdk1.8之前匿名内部类实现方式");
		
		
		//lambda
		Action login=(String content)->{
			System.out.println("jdk1.8的lambda语法实现");
		};
		login.execute("jdk1.8的lambda语法实现");
		
	}
	static interface Action {
		void execute(String content);
 	}
}
