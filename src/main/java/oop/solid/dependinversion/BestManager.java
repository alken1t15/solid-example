package oop.solid.dependinversion;

import oop.solid.interfsegr.IDeveloper;

public class BestManager implements IManager {
    @Override
    public void speak(IDeveloper developer) {
        System.out.println("speak manager with developer");
        developer.writeCode();
    }
}
