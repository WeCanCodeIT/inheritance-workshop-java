package project;

public class Carp extends Fish {

    public Carp(String name, int age) {
        super(name, "grey", age, true);
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " goes smack, smack, blub");
    }
}
