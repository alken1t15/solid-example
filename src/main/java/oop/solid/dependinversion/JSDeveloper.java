package oop.solid.dependinversion;

public class JSDeveloper extends Developer implements IDeveloper {
    @Override
    public void writeCode() {
        System.out.println("use JS syntax");
    }

    @Override
    public void eat() {
        System.out.println("js eat");
    }

    @Override
    public void reaction() {
        System.out.println("not bad!");
    }
}