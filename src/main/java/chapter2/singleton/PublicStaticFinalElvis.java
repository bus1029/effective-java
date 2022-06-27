package chapter2.singleton;

public class PublicStaticFinalElvis {
  public static final PublicStaticFinalElvis INSTANCE = new PublicStaticFinalElvis();
  private PublicStaticFinalElvis() {
    System.out.println("Initialize.");
  }
  public void leaveTheBuilding() {
    System.out.println("Leave the building. " + this.hashCode());
  }
}
