package project;

public abstract class Fish extends Animal{

    private boolean livesInFreshWater;

    public Fish(String name, String color, int age, boolean livesInFreshWater) {
        super(name, color, age);
        this.livesInFreshWater = livesInFreshWater;
    }

    @Override
    public void reproduce() {
        System.out.println(name + "lays eggs");
    }

    public void swim(){
        System.out.println(name +" swims in a body of water.");
    }

}
