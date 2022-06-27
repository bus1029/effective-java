package chapter2.singleton;

import java.io.Serializable;

public class StaticFactoryElvis implements Serializable {
  private static final StaticFactoryElvis INSTANCE = new StaticFactoryElvis();
  private StaticFactoryElvis() {
    System.out.println("Initialize.");
  }
  public static StaticFactoryElvis getInstance() {
    return INSTANCE;
  }

  public void leaveTheBuilding() {
    System.out.println("Leave the building. " + this.hashCode());
  }
}
