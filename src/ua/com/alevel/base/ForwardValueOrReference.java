package ua.com.alevel.base;

import org.jetbrains.annotations.*;
import ua.com.alevel.base.car.Jeep;

/**
 * @author Iehor Funtusov, created 17/08/2020 - 8:06 PM
 */

public class ForwardValueOrReference {

    public void run() {

//        int a = 10;
//        test1(a);
//        System.out.println("a = " + a);
//        System.out.println(10);
//        Integer integer = 10;
//        test2(10);
//        System.out.println("integer = " + integer);
//        int[] ints = {10};
//        int[] ints = null;
//        test3(ints);
//        System.out.println("ints = " + ints[0]);
//        Jeep jeep = new Jeep();
        Jeep jeep = null;
//        jeep.setName("jeep1");
        test4(jeep);
        System.out.println("jeep = " + jeep.getName());

//        String s1 = "test1";
//        test6(s1);
//        System.out.println("s1 = " + s1);
    }

    private void test4(@NotNull Jeep jeep) {
        jeep.setName("jeep2");
    }

    private void test6(String s) {
        System.out.println("s = " + s);
        s = "test2";
    }

    private void test5(StringBuilder s) {
        s.append("test2");
    }

    private void test3(int[] ints) {
        ints[0] = 11;
    }





    private void test1(int a) {
        ++a;
        System.out.println("a inner = " + a);
//        a++;
    }

    private void test2(Integer integer) {
        ++integer;
    }




}
