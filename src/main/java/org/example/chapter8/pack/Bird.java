package org.example.chapter8.pack;

import java.util.ArrayList;
import java.util.List;

public class Bird {
    public void fly() {
        System.out.println("Bird is flying");
    }
    public void eat(int food) {
        System.out.println("Bird is eating "+food+" units of food");
    }
    public Long getInt(){
        return 5L;
    }
    public List getList(){
        return List.of(1,2,3,4,5);
    }
}
