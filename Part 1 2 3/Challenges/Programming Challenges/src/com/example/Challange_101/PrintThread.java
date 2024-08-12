package com.example.Challange_101;

public class PrintThread extends Thread {
    private final int threadNumber;

    public PrintThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        System.out.printf("%s Thread starting -%d\n",
                Thread.currentThread().getName(),
                threadNumber);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.printf("%s Thread Ended - %d\n",
                Thread.currentThread().getName(),
                threadNumber);
    }
}
