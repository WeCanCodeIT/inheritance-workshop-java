package project;

public abstract class Animal {

    //instance variable, things a object knows:
    protected String name;
    private String color;
    private boolean isAlive;
    private int age;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.isAlive = true;
    }

    //methods, things a object does

    public abstract void reproduce();

    public void eat(){
        System.out.println(name + "eats food to live");
    }

    public void sleep(){
        System.out.println(name+ " goes to sleep");
    };



    public void breath(){
        System.out.println(name + "takes in oxygen.");
    }

    public abstract void makeNoise();

    public void die(){
        System.out.println( name + " passed away.");
        isAlive = false;
    }


    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public int getAge() {
        return age;
    }
}
