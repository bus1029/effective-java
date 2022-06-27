package chapter2.singleton;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ElvisTest {
  @Test
  void testPublicStaticFinalElvis() {
    PublicStaticFinalElvis instance1 = PublicStaticFinalElvis.INSTANCE;
    PublicStaticFinalElvis instance2 = PublicStaticFinalElvis.INSTANCE;
    instance1.leaveTheBuilding();
    instance2.leaveTheBuilding();
    assertThat(instance1).isSameAs(instance2);
  }

  @Test
  void testStaticFactoryElvis() {
    StaticFactoryElvis instance1 = StaticFactoryElvis.getInstance();
    StaticFactoryElvis instance2 = StaticFactoryElvis.getInstance();
    instance1.leaveTheBuilding();
    instance2.leaveTheBuilding();
    assertThat(instance1).isSameAs(instance2);
  }

  @Test
  void testEnumElvis() {
    Elvis instance1 = Elvis.INSTANCE;
    Elvis instance2 = Elvis.INSTANCE;
    instance1.leaveTheBuilding();
    instance2.leaveTheBuilding();
    assertThat(instance1).isSameAs(instance2);
  }
}
