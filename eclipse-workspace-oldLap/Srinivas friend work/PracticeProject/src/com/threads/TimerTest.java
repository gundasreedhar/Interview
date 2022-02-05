package com.threads;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTest {

	public static void main(String[] args) throws InterruptedException {

		Timer timer = new Timer(true);
		TimerTask myTimerTask = new MyTimerTask();
		timer.scheduleAtFixedRate(myTimerTask, 0, 2*1000);
		
		Thread.sleep(9000);
		
		timer.cancel();

	}
}

class MyTimerTask extends TimerTask {

	@Override
	public void run() {

		System.out.println("Timer task started @ " + new Date());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Timer ended  started @ " + new Date());

	}

}
