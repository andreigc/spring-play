package com.company.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public class ExecutorApp {

	public static void main(String[] args) {
		ExecutorService executorPool = Executors.newFixedThreadPool(4);
		
		ScheduledExecutorService scheduledPool = Executors.newScheduledThreadPool(4);
		
		AtomicLong sum = new AtomicLong(10);
		
		Runnable command = new Runnable() {
			
			public void run() {
				System.out.println("Sum" + sum.get());
				
				long result = sum.addAndGet(15L);
				result = sum.incrementAndGet();
				sum.set(100L);
				
			}
		};
		
		executorPool.execute(command);
		
		executorPool.execute(() -> {
			System.out.println("Running");
		});
		
		scheduledPool.scheduleAtFixedRate(command, 3, 3, TimeUnit.SECONDS);
		scheduledPool.schedule(() -> scheduledPool.shutdown(), 10, TimeUnit.SECONDS); 
		
	}
	
}
