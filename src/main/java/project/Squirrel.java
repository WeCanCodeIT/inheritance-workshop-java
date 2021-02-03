package project;

public class Squirrel extends Mammal{
    public Squirrel(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void makeNoise() {
        System.out.println(name + "is too busy with foraging to make a noise.");
    }
}
