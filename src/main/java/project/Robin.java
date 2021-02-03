package project;

public class Robin extends FlyingBird{


    public Robin(String name, int age) {
        super(name, "black and orange", age);
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " goes chrip");
    }


}
