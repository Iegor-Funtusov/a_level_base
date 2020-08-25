package ua.com.alevel.base.crud;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/**
 * @author Iehor Funtusov, created 20/08/2020 - 8:55 PM
 */

public class UserRun {

    UserController controller = new UserController();

    public void run() {


        String strLine = "";
        String line = "";
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Please, select a method:");
            while ((line = reader.readLine() ) != null) {

                if (line.equals("0")) {
                    System.exit(1);
                }
                if (line.equals("1")) {
                    createUser(line, reader);
                }
                if (line.equals("2")) {
                    updateUser(line, reader);
                }
                if (line.equals("3")) {
                    deleteUser(line, reader);
                }
                if (line.equals("4")) {
                    findByName(line, reader);
                }
                System.out.println("Please, select a method:");
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createUser(String line, BufferedReader reader) {
        try {
            System.out.println("Please, input name: ");
            line = reader.readLine();
            String nane = line;
            System.out.println("Please, input age: ");
            line = reader.readLine();
            int age = Integer.parseInt(line);
            User user = new User();
            user.setName(nane);
            user.setAge(age);
            controller.create(user);
            controller.findAll().forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void updateUser(String line, BufferedReader reader) {
        try {
            System.out.println("Please, input id: ");
            line = reader.readLine();
            int id = Integer.parseInt(line);
            System.out.println("Please, input name: ");
            line = reader.readLine();
            String nane = line;
            System.out.println("Please, input age: ");
            line = reader.readLine();
            int age = Integer.parseInt(line);
            User user = controller.findById(id);
            user.setName(nane);
            user.setAge(age);
            controller.update(user);
            controller.findAll().forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void deleteUser(String line, BufferedReader reader) {
        try {
            System.out.println("Please, input id: ");
            line = reader.readLine();
            int id = Integer.parseInt(line);
            controller.delete(id);
            controller.findAll().forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void findByName(String line, BufferedReader reader) {
        try {
            System.out.println("Please, input name: ");
            line = reader.readLine();
            List<User> users = controller.findByName(line);
            users.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
