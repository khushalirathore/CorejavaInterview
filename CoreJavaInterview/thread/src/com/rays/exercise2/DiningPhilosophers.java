package com.rays.exercise2;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class DiningPhilosophers {
	private static final int NUM_PHILOSOPHERS = 5;
    private static final int MAX_ITERATIONS = 10; 
    private final ReentrantLock[] forks = new ReentrantLock[NUM_PHILOSOPHERS];

    public DiningPhilosophers() {
        for (int i = 0; i < NUM_PHILOSOPHERS; i++) {
            forks[i] = new ReentrantLock();
        }
    }

    public void eat(int philosopher) {
        int leftFork = philosopher;
        int rightFork = (philosopher + 1) % NUM_PHILOSOPHERS;

        boolean gotLeftFork = false;
        boolean gotRightFork = false;

        try {
            gotLeftFork = forks[leftFork].tryLock(500, TimeUnit.MILLISECONDS);
            if (gotLeftFork) {
                gotRightFork = forks[rightFork].tryLock(500, TimeUnit.MILLISECONDS);
                if (gotRightFork) {
                    // Eating (simulated with a print statement)
                    System.out.println("Philosopher " + philosopher + " is eating.");
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            if (gotRightFork) forks[rightFork].unlock();
            if (gotLeftFork) forks[leftFork].unlock();
        }
    }

    public static void main(String[] args) {
        DiningPhilosophers philosophers = new DiningPhilosophers();

        for (int i = 0; i < NUM_PHILOSOPHERS; i++) {
            int philosopher = i;
            new Thread(() -> {
                for (int count = 0; count < MAX_ITERATIONS; count++) {
                    philosophers.eat(philosopher);
                    // Simulate thinking
                    System.out.println("Philosopher " + philosopher + " is thinking.");
                    try {
                        Thread.sleep((long) (Math.random() * 1000));
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
                System.out.println("Philosopher " + philosopher + " has finished eating.");
            }).start();
        }
    }
}