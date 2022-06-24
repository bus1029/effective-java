package chapter2.builder;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NutritionFactsTest {
  @Test
  void testBuilder() {
    NutritionFacts nutrition = new NutritionFacts.Builder(240, 8)
            .calories(100).sodium(35).fat(11).carbohydrate(27).build();
    assertThat(nutrition.getServingSize()).isEqualTo(240);
    assertThat(nutrition.getServings()).isEqualTo(8);
    assertThat(nutrition.getCalories()).isEqualTo(100);
    assertThat(nutrition.getSodium()).isEqualTo(35);
    assertThat(nutrition.getFat()).isEqualTo(11);
    assertThat(nutrition.getCarbohydrate()).isEqualTo(27);
  }
}