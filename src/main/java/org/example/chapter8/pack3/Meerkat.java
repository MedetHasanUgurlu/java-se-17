package org.example.chapter8.pack3;

class Carnivore {
  String name = "Carnivore";
  protected boolean hasFur = false;

  public Carnivore(final String name) {
    this.name = "Carnivore";
  }
}
public class Meerkat extends Carnivore {

  public Meerkat(final String name) {
    super(name);
  }

  public static void main(String[] args) {
  Meerkat m = new Meerkat("Meerkat");
  m.hasFur = false;
  Carnivore c = m;
  System.out.println(m.name);
  System.out.println(c.name);
  }
}