package project;

public class App {

    public static void main(String[] args) {
        Animal sampleAnimal = new Goldfish("Name", 10);

        Fish sampleFish = new Goldfish("Blub", 2);

        Carp sampleCarp = new Carp("Carpy", "Grey", 15);

        sampleFish.swim();
        sampleCarp.swim();
        sampleCarp.reproduce();
        sampleCarp.breath();
    }

}
