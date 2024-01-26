package com.day25.threading;

// Creating thread using Runnable

class ChildThread1 implements Runnable
{

	@Override
	public void run()
	{
		for (int i=0; i<5; i++)
		{
			System.out.println(Thread.currentThread().getName() + ": " + i);
		}
	}

	
}


class MyThread1 {


	public static void main(String[] args) {
		
		ChildThread1 T1 = new ChildThread1();
//		MyThread1 T2 = new MyThread1();
		
		Thread T1obj = new Thread(T1);
		Thread T2obj = new Thread(T1);
		
		T1obj.start();
		T2obj.start();
		
		System.out.println(Thread.currentThread().getName());

	}

}
