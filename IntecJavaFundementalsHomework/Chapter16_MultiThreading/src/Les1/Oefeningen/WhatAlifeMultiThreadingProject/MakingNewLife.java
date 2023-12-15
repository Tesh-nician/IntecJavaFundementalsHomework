package Les1.Oefeningen.WhatAlifeMultiThreadingProject;
public class MakingNewLife {
    public static void main(String[] args) {
        Person father = new Person("Igor", 36, 1000);
        Person mother = new Person("Imelda", 36, 1200);
        Person babyBoy = new Person("Son of Igor", 3, 1200);
        Person babyGirl = new Person("Daughter of Imelda", 1, 1200);

        father.startLife();
        mother.startLife();
        babyBoy.startLife();
        babyGirl.startLife();

    }
}

