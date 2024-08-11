package dataBaseCode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC {

    public static void exportInformation() {

        String url = "jdbc:mysql://localhost:3306/airlinedb";
        String user = "root";
        String password = "Poria1382";

    try {

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/airLinedb", "root", "Poria1382");

        Statement statement = connection.createStatement();

        ResultSet resultSetairPlaneTickets = statement.executeQuery("select * from airPlaneTickets ");

        while (resultSetairPlaneTickets.next()) {

            System.out.println(resultSetairPlaneTickets.getInt(1) + " " + resultSetairPlaneTickets.getString(2) + " " + resultSetairPlaneTickets.getString(3) + " " + resultSetairPlaneTickets.getString(4));

        }

        connection.close();
    }

    catch (Exception e) {

        System.out.println(e);

        }
    }
}
