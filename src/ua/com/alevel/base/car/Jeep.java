package ua.com.alevel.base.car;

/**
 * @author Iehor Funtusov, created 06/08/2020 - 8:35 PM
 */

public class Jeep implements Car {

    private String name;

    public Jeep(String name) {
        this.name = name;
    }

    public Jeep() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @Override
//    public String toString() {
//        return "Jeep{" +
//                "name='" + name + '\'' +
//                '}';
//    }

    @Override
    public void start() {
        System.out.println("jeep " + getName() + " start");
    }
}
