package project;

public class FlyingSquirrel extends Squirrel implements Flyable{
    public FlyingSquirrel(String name, String color, int age) {
        super(name, color, age);
    }

    public void fly(){
        System.out.println(name + " glides from tree to tree.");
    }

}
