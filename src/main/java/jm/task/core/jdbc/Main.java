package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserService userServiceimpl = new UserServiceImpl();
        userServiceimpl.createUsersTable();
        userServiceimpl.saveUser("Sergey", "Petrov", (byte) 45);
        System.out.println("User с именем – Sergey добавлен в базу данных");
        userServiceimpl.saveUser("Alexey", "Stepanov", (byte) 25);
        System.out.println("User с именем – Alexey добавлен в базу данных");
        userServiceimpl.saveUser("Vladimir", "Stoyanov", (byte) 55);
        System.out.println("User с именем – Vladimir добавлен в базу данных");
        userServiceimpl.saveUser("Maxim", "Smith", (byte) 34);
        System.out.println("User с именем – Maxim добавлен в базу данных");
        userServiceimpl.getAllUsers().forEach(System.out::println);
        userServiceimpl.cleanUsersTable();
        userServiceimpl.dropUsersTable();
    }
}
