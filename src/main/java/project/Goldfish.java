package project;

public class Goldfish extends Fish {

    public Goldfish(String name, int age) {
        super(name, "Gold", age, true);
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " goes blub, blub");
    }

    @Override
    public void swim(){
        System.out.println(name + " swims around in a small tank");
    }
}
