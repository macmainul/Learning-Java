package com.example.Challange_103;

public class PrintNumbers implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("The number is : %d\n",i+1);
        }
    }
}
