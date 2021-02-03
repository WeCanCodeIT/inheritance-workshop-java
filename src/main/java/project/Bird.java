package project;

public abstract class Bird extends Animal implements Flyable{


    public Bird(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void fly() {
        System.out.println(name +" takes off on wings.");
    }

    @Override
    public void reproduce() {
        System.out.println(name + " lays eggs");
    }
}
