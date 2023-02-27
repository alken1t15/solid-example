package oop.solid.dependinversion;

import oop.solid.interfsegr.IDeveloper;
import oop.solid.interfsegr.JavaDeveloper;
import oop.solid.interfsegr.KotlinDeveloper;

import java.util.ArrayList;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        IDeveloper developer1 = new JavaDeveloper();
        IDeveloper developer2 = new KotlinDeveloper();

        IManager manager = new BestManager();
        manager.speak(developer1);

    }
}