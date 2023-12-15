package Les1.Oefeningen.WhatAlifeMultiThreadingProject;

public class HeartBeat implements Runnable {

    int millisecondsBetweenBeats;

    public HeartBeat(int millisecondsBetweenBeats) {

        this.millisecondsBetweenBeats = millisecondsBetweenBeats;
    }

    @Override
    public synchronized void run() {

        try {
            System.out.println(Thread.currentThread().getName()+ " The heart is starting to beat!");
            while (true) {
                System.out.println(Thread.currentThread().getName()+ "'s heart Beats ...");
                Thread.sleep(millisecondsBetweenBeats);
                Thread.yield();


            }
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName()+ "'s heart has stopped!");;
        }
    }

}