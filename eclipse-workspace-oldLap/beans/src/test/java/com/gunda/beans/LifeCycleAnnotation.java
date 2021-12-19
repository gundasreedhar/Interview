package com.gunda.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class LifeCycleAnnotation {
	@PostConstruct
	public void myInit()
	{
		System.out.println("connextions are open"); 
	}
	
	public void service()
	{
		System.out.println("services are served");
	}
	
	@PreDestroy
	public void myDestroy()
	{
		System.out.println("Connections are Closed");
	}
	
}
