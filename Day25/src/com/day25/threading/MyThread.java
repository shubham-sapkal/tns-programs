package com.day25.threading;

// Creatiing thread my extending a Thread class

class ChildThread extends Thread
{
	int n;
	String msg;
	
	public ChildThread(int n, String msg) {
		this.n = n;
		this.msg = msg;
	}
	
	public void run()
	{
		for(int i=1; i<=n; i++)
		{
			System.out.println(msg + ": " + i);
		}
	}
}


public class MyThread {

	public static void main(String[] args) {
		
		ChildThread t1 = new ChildThread(10, "Child 1");
		// t1.run();  // This will treated as normal function
					// Rather than creating thread
		t1.start();
		
		ChildThread t2 = new ChildThread(20, "Child 2");
		t2.start();

	}

}
