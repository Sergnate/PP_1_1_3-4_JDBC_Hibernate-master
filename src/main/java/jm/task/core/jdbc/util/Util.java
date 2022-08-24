package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    protected static final String URL = "jdbc:mysql://localhost:3306/usersDB";
    protected static final String USERNAME = "root";
    protected static final String PASSWORD = "Anya1995$";

    public static Connection connection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

}

