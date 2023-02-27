package oop.solid.dependinversion;

public class KotlinDeveloper extends Developer implements IDeveloper, ITester {

    @Override
    public void writeCode() {
        System.out.println("kotlin code");
    }

    @Override
    public void reaction() {
        System.out.println("kotlin dev");
    }

    @Override
    public void eat() {
        System.out.println("kotlin eat");
    }

    @Override
    public void stressTest() {

    }

    @Override
    public void funcTest() {

    }
}
