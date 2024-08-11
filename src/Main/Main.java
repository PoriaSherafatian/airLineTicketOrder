package Main;

import java.util.Scanner;
import dataBaseCode.*;

public class Main {

    public static void main(String[] args) {

        JDBC importAirLineData = new JDBC();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Welcome to Poria-AirWays to display all tickets at this week please enter 'TICKET' to show all of them: ");
        String airPlaneInformation = scanner.next();

        if (airPlaneInformation.toLowerCase().equals("ticket")) {
            importAirLineData.exportInformation();
        } else {
            System.out.println("Invalid key word \nTRY AGAIN");
        }
    }
}
