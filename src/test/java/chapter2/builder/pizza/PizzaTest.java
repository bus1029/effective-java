package chapter2.builder.pizza;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PizzaTest {
  @Test
  void testMakeNyPizza() {
    Pizza nyPizza = new NyPizza.Builder(NyPizza.Size.SMALL)
            .addTopping(Pizza.Topping.HAM).addTopping(Pizza.Topping.PEPPER).build();
    assertThat(nyPizza.toppings).contains(Pizza.Topping.HAM, Pizza.Topping.PEPPER);
  }

  @Test
  void testMakeCalzone() {
    Pizza calzone = new Calzone.Builder().addTopping(Pizza.Topping.MUSHROOM)
            .addTopping(Pizza.Topping.ONION).sauceInside().build();
    assertThat(calzone.toppings).contains(Pizza.Topping.ONION, Pizza.Topping.MUSHROOM);
  }
}
