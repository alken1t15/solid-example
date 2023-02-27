package oop.solid.interfsegr;

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

    public void reaction() {
        System.out.println("def reaction");
    }
}