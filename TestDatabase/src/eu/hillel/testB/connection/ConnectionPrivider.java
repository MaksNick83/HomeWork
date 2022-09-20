package eu.hillel.testB.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionPrivider {
    public static Connection provide() throws  Exception{
      Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/planets", "root", "root");
     return connection;
      /*  System.out.println(connection.getMetaData().getDatabaseProductName());
        connection.close();
        System.out.println("It is ok");*/


    }

}
