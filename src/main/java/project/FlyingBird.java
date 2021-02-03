package project;

public abstract class FlyingBird extends Bird implements Flyable{

    public FlyingBird(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void fly() {
        System.out.println(name +" takes off on wings.");
    }
}
