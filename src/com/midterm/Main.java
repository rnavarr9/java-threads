package com.midterm;

// reason to use multithreading: CPU time is used in a more efficient way
// when a new thread borns it is in state "New"
// then, it will be in a "runnable" state, before "running"
// "waiting", when a thread stops temporaly to wait other thread
// finishes a task, it continues when the other thread signal that it has finished
// "time waiting" or "sleep": enters to this state for a programmed time
// "terminated" when it completes its task

// we can implement thread class in to ways, implemented or inherit
// if inherited, you can access to the methods
// if implemented, you can overwrite the run method

public class Main {

    public static void main(String[] args) throws InterruptedException {
        NewThread ntObj = new NewThread();
//        NewThread atObj = new NewThread();
//        System.out.println("state: " + ntObj.getState());  //state of the thread
        ntObj.start(); // with this, multithreading, both run combined
        ntObj.interrupt();
//        ntObj.join(); // the main method will wait for the other thread to complete

//        atObj.start();
//        System.out.println("state: " + ntObj.getState());  //state of the thread
        ntObj.setPriority(10); //maximum priority
//            ntObj.run(); // not running concurrently, 1st new thread executes and then the main

        // with setPriority we can define a running order
        // by default priority is 5
        for (int i = 0; i <= 5; i++) {
            System.out.println("Main Thread " + i + " running");
        }
    }
}
