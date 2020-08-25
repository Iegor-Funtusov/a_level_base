package ua.com.alevel.base.pizza;

import java.util.Optional;

/**
 * @author Iehor Funtusov, created 17/08/2020 - 7:34 PM
 */

public class Order {

    private Optional<Pizza> pizza;

    public Optional<Pizza> getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = Optional.of(pizza);
    }
}
