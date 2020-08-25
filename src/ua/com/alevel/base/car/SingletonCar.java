package ua.com.alevel.base.car;

/**
 * @author Iehor Funtusov, created 10/08/2020 - 7:47 PM
 */
public class SingletonCar {

    private static SingletonCar instance;

    private SingletonCar() {}

    public static SingletonCar getSingletonCar() {
        if (instance == null) {
            instance = new SingletonCar();
        }
        return instance;
    }
}
