package com.algorithms.threads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TraditionalCollectionIssueDemo extends Thread {
	static List<String> list = new ArrayList<>();

	@Override
	public void run() {
		try {

			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		list.add("Sohit");
	}

	public static void main(String[] args) {

		list.add("Tohit");
		list.add("Lohit");
		list.add("Purohit");

		Thread testThread = new TraditionalCollectionIssueDemo();

		testThread.start();
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String data = iterator.next();
			System.out.println(data);
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}


