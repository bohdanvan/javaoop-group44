package com.bvan.oop.lessons1_2.dog;

/**
 * @author bvanchuhov
 */
public class DogRunner {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark(3);
        System.out.println();

        Owner owner = new Owner("John", dog);
        owner.giveCommand();
        System.out.println();

        DogTrainer dogTrainer = new DogTrainer();
        dogTrainer.trainDog(dog);
        dogTrainer.trainDog(new Dog("Rex"));
        dogTrainer.trainDog(new Dog("Barsik"));
        dogTrainer.giveCommand();
    }
}
