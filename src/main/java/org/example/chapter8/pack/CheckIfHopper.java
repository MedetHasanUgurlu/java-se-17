package org.example.chapter8.pack;

public class CheckIfHopper implements Swimmable{
    @Override
    public boolean test(final Animal a) {
        return a.canHop();
    }
}
