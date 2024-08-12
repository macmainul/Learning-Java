package com.example.Challange_102;

public class TrafficLightThread extends Thread{
    private final TrafficColor color;

    public TrafficLightThread(TrafficColor color) {
        this.color = color;
    }

    @Override
    public void run() {
        System.out.printf("%s Active \n",color);
        try {
            Thread.sleep(color.getOnTimeMills());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("%s Inactive \n",color);
    }
}
