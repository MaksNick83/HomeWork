package eu.hillel.hw20.connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionProvider {
    private ConnectionProvider() {
    }

    private static ConnectionProvider instance = null;

    public static ConnectionProvider getInstance() {
        if (instance == null)
            instance = new ConnectionProvider();
        return instance;
    }

    public static Connection getConnection() {
        try {
            Context envContext = (Context) new InitialContext().lookup("java:/comp/env");
            DataSource ds = (DataSource) envContext.lookup("jdbc/shop");
            return ds.getConnection();
        } catch (SQLException | NamingException e) {
            System.err.println("Cannot get connection");
            return null;
        }
    }
}
