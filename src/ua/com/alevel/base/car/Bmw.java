package ua.com.alevel.base.car;

/**
 * @author Iehor Funtusov, created 06/08/2020 - 8:12 PM
 */

public class Bmw extends DeutschlandCar implements Car {

    private String name;

    public Bmw(String name) {
        this.name = name;
    }

    public Bmw() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bmw{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void start() {
        System.out.println("bmw " + getName() + " start");
    }

    @Override
    void isDeutschland() {
        System.out.println("Bmw " + getName() + " is Deutschland");
    }
}
