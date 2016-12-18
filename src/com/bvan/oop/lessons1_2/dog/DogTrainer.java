package com.bvan.oop.lessons1_2.dog;

import java.util.ArrayList;

/**
 * @author bvanchuhov
 */
public class DogTrainer {

    private final ArrayList<Dog> dogs = new ArrayList<>();

    public DogTrainer() {}

    public void trainDog(Dog dog) {
        dogs.add(dog);
    }

    public void giveCommand() {
        for (Dog dog : dogs) {
            dog.bark();
        }
    }
}
