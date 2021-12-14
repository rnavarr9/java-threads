package com.midterm;

//using thread class
public class NewThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Another Thread " + i + " running");
        }
    }
}
