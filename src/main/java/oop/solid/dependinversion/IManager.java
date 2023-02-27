package oop.solid.dependinversion;

import oop.solid.interfsegr.IDeveloper;
import oop.solid.liskov.JavaDeveloper;

public interface IManager {
    void speak(IDeveloper developer);
}
