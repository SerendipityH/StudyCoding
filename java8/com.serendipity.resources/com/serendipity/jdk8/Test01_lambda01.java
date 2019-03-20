package com.serendipity.jdk8;

public class Test01_lambda01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("匿名内部类实现Runnable接口");
			}
		}.run();
		//lambda
		int i=1;
		Runnable r=()->{
			System.out.println("用lambda实现Runnable接口");
			System.out.println("i="+i);
		};
		r.run();
	}
}
