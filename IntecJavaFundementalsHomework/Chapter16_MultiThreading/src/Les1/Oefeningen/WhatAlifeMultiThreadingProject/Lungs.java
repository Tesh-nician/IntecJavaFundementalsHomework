package Les1.Oefeningen.WhatAlifeMultiThreadingProject;
public class Lungs implements Runnable {

    private boolean lungsFull;

    public Lungs() {}


    @Override
    public synchronized void run() {

        try {

            System.out.println(Thread.currentThread().getName()+" is starting to BREATHE!!!");
            while (true) {
                System.out.println(Thread.currentThread().getName()+" is breathing IN");
                Thread.sleep(1000);
                Thread.yield();
                System.out.println(Thread.currentThread().getName()+" is breathing OUT");
                Thread.yield();
            }
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName()+" has STOPPED Breathing !");
        }

    }
}
