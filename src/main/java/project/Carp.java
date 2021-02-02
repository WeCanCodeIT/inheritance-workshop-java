package project;

public class Carp extends Fish{

    public Carp(String name, String color, int age) {
        super(name, color, age, true);
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " goes smack, smack, blub");
    }
}
