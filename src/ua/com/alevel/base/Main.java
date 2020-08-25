package ua.com.alevel.base;

import ua.com.alevel.base.car.*;
import ua.com.alevel.base.crud.UserRun;
import ua.com.alevel.base.pizza.Order;
import ua.com.alevel.base.pizza.Pizza;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Iehor Funtusov, created 06/08/2020 - 8:04 PM
 */

public class Main {

    private String g;

    public static void main(String[] args)  {

        UserRun userRun = new UserRun();
        userRun.run();

//        String s = " ";
//        System.out.println("s = " + s.isEmpty());
//        System.out.println("s = " + s.isBlank());


//        ForwardValueOrReference forwardValueOrReference = new ForwardValueOrReference();
//        forwardValueOrReference.run();


//        Order order = new Order();
//
//        Pizza pizza = order.getPizza();
//        if (pizza != null) {
//            String name = pizza.getName();
//            if (name != null) {
//                System.out.println("order = " + name);
//            }
//        }

//        String name = order
//                .getPizza()
//                .orElse(new Pizza())
//                .getName()
//                .orElse("test");
//
//        System.out.println("name = " + name);


//        try {
//            System.out.println("try");
//            System.exit(1);
//        } finally {
//            System.out.println("finally");
//        }


//        File file = new File("text.txt");
//        try {
//            file.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        try (FileReader fileReader = new FileReader(file)) {
//            fileReader.read();
////            System.out.println("res = " + res);
//
//            int[] ints = new int[10];
//            ints[10] = 0;
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("e = " + e.getMessage());
//        }  catch (ArithmeticException e) {
//            System.out.println("e = " + e.getMessage());
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            System.out.println("finally");
//        }

//        System.out.println("next");
//        int res = 10 / 0;
//        System.out.println("res = " + res);

//        System.exit(1);
//        car = new Audi();

//        Pizza pizza1 = new Pizza();
//        pizza1.setName("paperoni");
//        try {
//            System.out.println("pizza1 = " + pizza1.getName1());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        pizza1.setName("paperoni");
//        pizza1.name = "paperoni";
//        Pizza pizza2 = new Pizza();
//        pizza2.setName("paperoni");
//        pizza2.setName1("paperoni1");
//        System.out.println("equals = " + pizza1.equals(pizza2));
//
//        System.out.println(pizza1.hashCode());
//        System.out.println(pizza2.hashCode());

//        System.out.println("Main.main");
//        System.out.println(Audi.S);
//        SingletonCar singletonCar = SingletonCar.getSingletonCar();
//        Audi audi = new Audi();
//        audi.setName("A8");
//        System.out.println("audi = " + audi);
//        Bmw bmw = new Bmw();
//        bmw.setName("m3");
//        System.out.println("bmw = " + bmw);
//
//
//        Integer a = 0;
//        Integer b = 0;
//        int c = a + b;
//
//        List<Car> carList = new ArrayList<>();
//        carList.add(new Bmw("m1"));
//        carList.add(new Bmw("m2"));
//        carList.add(new Bmw("m3"));
//        carList.add(new Bmw("m4"));
//        carList.add(new Bmw("m5"));
//        carList.add(new Audi("a1"));
//        carList.add(new Audi("a2"));
//        carList.add(new Audi("a3"));
//        carList.add(new Jeep("Cherokee"));
//        carList.add(new Jeep("Grand Cherokee"));

//        carList.forEach(System.out::println);

//        for (Car car : carList) {
//            car.start();
//            if (car instanceof DeutschlandCar) {
//                System.out.println(car + " is Deutschland");
//            } else {
//                System.out.println(car + " is not Deutschland");
//            }
//        }

//        int a = 67;
//        System.out.println("a * 2 = " + a * 2);
//        System.out.println("a << 1 = " + (a << 1));
//        System.out.println("a / 2 = " + a / 2);
//        System.out.println("a >> 1 = " + (a >> 1));

//        System.out.println("res = " + (a * b));
//        System.out.println("res = " + (a >>> b));
    }

    public void a(Bmw bmw) {

    }

    public void b(Car car) {

    }
}
