package Les1.Oefeningen.WhatAlifeMultiThreadingProject;

public class Person implements Runnable {
    String name;
    int age;
    Thread heart;
    Thread breathing;
    Thread life;

    Thread person;






    public Person(String name, int age, int heartBeatMilliSeconds) {
        this.name = name;
        this.age = age;
        makeLife(heartBeatMilliSeconds);
        person= new Thread(this);



    }

    @Override
    public synchronized void run() {


        System.out.println(name + " has started to move.");


        for (int i = age; i < 100; i++) {

            System.out.println(name + " is " + i);
            try {
                Thread.sleep(1000);
                Thread.yield();
            } catch (InterruptedException e) {

                System.out.println("========== Sadly, "+name+ " will be leaving us. ===================");

                return;
            }

            if (((int) (Math.random() * 20)) == 13) {
                endLife();

            }

        }

    }

    private void makeLife(int heartBeatMilliSeconds) {


        Life newLife = new Life();
        this.life = new Thread(newLife);

        HeartBeat newHeart = new HeartBeat(heartBeatMilliSeconds);
        this.heart = new Thread(newHeart);

        Lungs newLungs = new Lungs();
        this.breathing = new Thread(newLungs);

    }

    public void startLife() {
        person.start();
        life.start();
        heart.start();
        breathing.start();
    }


    private void endLife() {

        if (life.isAlive())         { life.interrupt(); };
        if (heart.isAlive())        { heart.interrupt(); }
        if (breathing.isAlive())    { breathing.interrupt(); }

        person.interrupt();

        try {

        } catch (SecurityException e) {
            e.printStackTrace();
        }
    }


}
