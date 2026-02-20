package com.thread;
/*
 * Thread : process 
 * single thread :
 * multi thread
 * main is a thread
 * thread life cycle
 *  1.Newborn
	2.Runnable
	3.Running
	4.Blocked (Non-Runnable)
	5.Dead (Terminated)
 */
class TDemo extends Thread{
	//newborn
	public void run() {
		for (int i = 1; i <=5; i++) {
			System.out.println("This is first thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class ThreadDemo {
public static void main(String[] args) throws InterruptedException {
	TDemo td=new TDemo();
	td.start();
	for (int i = 1; i <=5; i++) {
		System.out.println("This is main thread");
		Thread.sleep(2000);
	}
}
}
