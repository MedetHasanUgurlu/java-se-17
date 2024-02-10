package org.example.chapter8.pack;

import java.util.ArrayList;
import java.util.List;

public class Eagle extends Bird {
  public int fly(int height) {
    System.out.println("Bird is flying at "+height+" meters");
    return height;
  }
  public void eat(int food) { // DOES NOT COMPILE
    System.out.println("Bird is eating "+food+" units of food");
  }

  @Override
  public Long getInt() {
    return 6L;
  }
  public Long getInt(int x) {
    return (long) x;
  }

  public List getList(){
    return new ArrayList();
  }
}