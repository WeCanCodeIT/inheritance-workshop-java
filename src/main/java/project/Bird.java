package project;

public abstract class Bird extends Animal {


    public Bird(String name, String color, int age) {
        super(name, color, age);
    }



    @Override
    public void reproduce() {
        System.out.println(name + " lays eggs");
    }
}
