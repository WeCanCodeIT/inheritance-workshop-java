package project;

public class FlyingFish extends Fish implements Flyable{
    public FlyingFish(String name, String color, int age) {
        super(name, color, age, false);
    }

    @Override
    public void makeNoise() {
        System.out.println(name + "weee!");
    }

    @Override
    public void fly() {
        System.out.println(name + "glides over the waves!");
    }
}
