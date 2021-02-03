package project;

public class Penguin extends Bird {
    public Penguin(String name, int age) {
        super(name, "Black and white", age);
    }


    @Override
    public void makeNoise() {
        System.out.println(name + " goes brrr.");
    }
}
