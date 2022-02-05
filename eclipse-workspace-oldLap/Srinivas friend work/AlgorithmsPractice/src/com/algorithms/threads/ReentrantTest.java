package com.algorithms.threads;

public class  ReentrantTest extends Thread{
	 
    Lock lock = new Lock();
   
	public synchronized void outer(){
	   lock.lock();
	    inner();
	   lock.unlock();
	
	}
	
	public synchronized void inner(){
	    lock.lock();
		System.out.println("here ");
		lock.unlock();
	
	}
   

    @Override
    public void run(){
	  outer();
	 }
	 
  public static void main(String args[]){
	  ReentrantTest t1 = new ReentrantTest();
		 t1.start();
		 
    }

 
}