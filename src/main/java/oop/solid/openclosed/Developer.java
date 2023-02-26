package oop.solid.openclosed;

public class Developer {
    private String langName;

    private String getLangName() {
        return langName;
    }

    public void setLangName(String langName) {
        this.langName = langName;
    }

    public void writeCode() {
        System.out.println("dev lang syntax");
    }

    public void eat() {

    }
}