package com.threads;

public class MultithreadEx extends Thread {

	public void run()  
    {  
      try {  
          System.out.println("thread is executing now........");  
      } catch(Exception e) {  
      }   
    }  
	
	public static void main(String[] args) {
		
		MultithreadEx m1 = new MultithreadEx();
		m1.start();
		// m1.start(); 
		// it is not possible to start a thread twice.
		// how ever we will try to start thread twice it will return the java.lang.IllegalThreadStateException
		

		m1.setDaemon(true);
		// It will throw the java.lang.IllegalThreadStateException. 
		// we can only create a daemon thread before starting the thread.
		 
	}

}
