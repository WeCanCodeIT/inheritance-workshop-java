package project;

import java.util.ArrayList;
import java.util.Collection;

public class App {

    public static void main(String[] args) {
        Collection<Animal> zooAnimals = new ArrayList<>();

        Animal carp = new Carp("Muddy Fish", 15);
        zooAnimals.add(carp);
        Animal goldie = new Goldfish("Goldie", 2);
        zooAnimals.add(goldie);
        Animal robin = new Robin("Robin", 4);
        zooAnimals.add(robin);
        Animal squirrel = new Squirrel("Squirrel Dan", "Red", 3);
        zooAnimals.add(squirrel);


        System.out.println("Welcome to the WeCanCodeIT Zoo!");

        System.out.println("We have many different types of animals!");
        System.out.println();

        System.out.println("It's feeding time!");
        for (Animal animal : zooAnimals) {
            animal.eat();
        }
        System.out.println();

        System.out.println("Time to relax with a deep breath!");
        for (Animal animal : zooAnimals) {
            animal.breath();
        }
        System.out.println();

        System.out.println("Time to repopulate the world!");
        for (Animal animal : zooAnimals) {
            animal.reproduce();
        }
    }

}
