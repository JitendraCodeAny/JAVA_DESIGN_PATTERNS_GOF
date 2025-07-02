package com.jitendra.dp.usecase.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *  Singleton pattern ensures that class implementing this pattern, has only one instance and accessed everywhere
 *  Database Connection Manager - Singleton class in Library Management System
 *  This help to centralize the control over DB connections to avoid opening duplicate connections.
 */

public class DBConnectionManager {
    //Make it volatile to ensure all threads see the same value, in a multi-threaded environment.
    private static volatile DBConnectionManager instance;
    private static final String URL = "jdbc:mysql://localhost:3306/library";
    private static final String USER = "root";
    private static final String PASSWORD = "yourpassword";
    private Connection connection;

    // Private constructor
    private DBConnectionManager() {
        try {
            // Loading driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    // Thread-safe lazy initialization
    // Double check locking
    public static DBConnectionManager getInstance() {
        // This check, avoids synchronization if instance already exists.
        if (instance == null) {
            synchronized (DBConnectionManager.class) {
                // This check, ensures only one thread creates the instance when it’s null
                if (instance == null) {
                    instance = new DBConnectionManager();
                }
            }
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
}
