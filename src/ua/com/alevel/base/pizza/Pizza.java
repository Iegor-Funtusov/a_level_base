package ua.com.alevel.base.pizza;

import java.util.Objects;
import java.util.Optional;

/**
 * @author Iehor Funtusov, created 10/08/2020 - 8:20 PM
 */

public class Pizza {

    private Optional<String> name;

    public Pizza() {
    }

    public Optional<String> getName() {
        return name;
    }

    public void setName(String name) {
        this.name = Optional.of(name);
    }


//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Pizza pizza = (Pizza) o;
//        return Objects.equals(name, pizza.name) &&
//                Objects.equals(name1, pizza.name1);
//    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(name, name1);
//    }
}
