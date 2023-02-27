package oop.solid.interfsegr;

public class JavaDeveloper extends Developer implements IDeveloper,ITester {
    @Override
    public void writeCode() {
        System.out.println("use java syntax");
    }

    @Override
    public void eat() {
        System.out.println("java eat");
    }

    @Override
    public void reaction() {
        System.out.println("cool");
    }

    @Override
    public void stressTest() {

    }

    @Override
    public void funcTest() {

    }
}