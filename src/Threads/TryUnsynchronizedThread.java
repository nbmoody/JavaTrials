package Threads;// Created by natha on 10/19/2017.

// Author: Nathaniel Ben. Moody
// Initial Date: 10/19/2017
// Filename: TryUnsynchronizedThread.java
// Project: JavaTrials
/* NOTES: This is a simple demonstration of multithreading and concurrency in Java. This class's methods are not
sychronized, and so threads running those methods will step on top of each other as they attempt to increment the
balance while they are running, without considering that another thread might be in the middle of trying the same.
 */


// Imports:


public class TryUnsynchronizedThread implements Runnable {

// Attributes:
    private int balance;

// Methods:
    public void run() {
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
