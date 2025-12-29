package com.tnsif.multithreading;
public class ThreadDemo {

	public static void main(String[] args) {
		ChildThread threadone=new ChildThread(5,"First");
		ChildThread threadtwo=new ChildThread(10,"Second");
		threadone.start();
		threadtwo.start();
		System.out.println("----------------------"+" End of Main --------------"+"---------------");
	}

}