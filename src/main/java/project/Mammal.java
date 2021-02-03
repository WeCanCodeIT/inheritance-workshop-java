package project;

public abstract class Mammal extends Animal{
    public Mammal(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void reproduce() {
        System.out.println(name + "gives birth to a live baby.");
    }
}
