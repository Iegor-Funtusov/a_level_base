package ua.com.alevel.base.car;

import java.util.List;

/**
 * @author Iehor Funtusov, created 06/08/2020 - 8:10 PM
 */

public class Audi extends DeutschlandCar implements Car {

    private String name;
    private Bmw bmw;
    private final String n = "test n";
    public static String S = "test n";
    private List<Audi> audis;

    public Audi(String name) {
        super();
        this.name = name;
        String s = new String("test s");
        s = n;
        System.out.println("Audi: String name");
        System.out.println("n = " + n);
        System.out.println("s = " + s);
    }

    public Audi(String name, String s) {
        this(name);
        this.name = name;
        System.out.println("Audi: String name, String s");
    }

    public Audi() {
        this("a", "s");
        System.out.println("Audi: default");
    }

    public static String getName() {
        String name;
//        return this.name;
        return "";
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Audi{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void start() {
        System.out.println("Audi " + getName() + " start");
    }

    @Override
    void isDeutschland() {
        System.out.println("Audi " + getName() + " is Deutschland");
    }
}
