package com.algorithms.threads;
public class Lock{

	 private boolean isLocked = false;
	 private Thread lockedBy;
	 private int lockCount;
	 
	 
	  public synchronized void lock(){
	        while(isLocked && lockedBy != Thread.currentThread()){
			   try{
			   wait();
			   }catch(InterruptedException e){
			   
			   }
			   
			}
			
			isLocked = true;
			lockCount++;
			lockedBy = Thread.currentThread();
	  }
	  
	  
	  public synchronized void unlock(){
	     if(lockedBy == Thread.currentThread()){
		     lockCount--;
		 }
		 
		 if(lockCount == 0){
		     isLocked = false;
			 notify();
		 }
	  
	   
	    
	  }


	}