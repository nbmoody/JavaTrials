package Threads;// Created by natha on 10/19/2017.

// Author: Nathaniel Ben. Moody
// Initial Date: 10/19/2017
// Filename: TryUnsynchronizedThread.java
// Project: JavaTrials
/* NOTES: This is a simple demonstration of multithreading and concurrency in Java. This class's methods are
sychronized, and so threads running those methods will call the methods in a way that does not step on top of or thwart
what other threads are doing.
 */


// Imports:


public class TrySynchronizedThread implements Runnable {

// Attributes:
    private int balance;

// Methods:
    public synchronized void run() {
        for(int i=0; i<50; i++) {
            increment();
            System.out.println(Thread.currentThread().getName() + " says the balance is " + balance);
        }
    }

    public void increment() {
        int i = balance;
        balance = i + 1;
    }

}//end of head class
