package chapter2.singleton;

/**
 * public 필드 방식과 비슷하지만 더 간결하고, 추가 노력 없이 직렬화할 수 있고,
 * 아주 복잡한 직렬화 상황이나 리플렉션 공격에도 제2의 인스턴스가 생기는 일을 완벽히 막아준다.
 */
public enum Elvis {
  INSTANCE;

  public void leaveTheBuilding() {
    System.out.println("Leave the building. " + this.hashCode());
  }
}
