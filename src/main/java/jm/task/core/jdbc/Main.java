package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl service = new UserServiceImpl();
        service.createUsersTable();
        service.saveUser("Odin", "GodFather", (byte) 99);
        service.saveUser("Tor", "Odinson", (byte) 25);
        service.saveUser("Vladdy", "Daddy", (byte) 75);
        service.saveUser("Kat", "Katov", (byte) 38);

        service.removeUserById(1);
        service.getAllUsers();
        //service.cleanUsersTable();
        //service.dropUsersTable();

        // реализуйте алгоритм здесь
    }
}
