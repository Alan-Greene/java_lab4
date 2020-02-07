package inclassex1;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        // Declaring the constants
        final double BASIC_HOURLY_WAGE = 7.25;
        final double OVER_TIME_WAGE = (BASIC_HOURLY_WAGE + (BASIC_HOURLY_WAGE / 2));
        final int HOUR_LIMIT = 40;
        final double SALES_LIMIT = 50.00;
        final double COMMISSION = 0.05;

        // Declaring the variables
        double wage = 0;
        double commission = 0;
        double over_time_hours = 0;
        double over_time_pay = 0;
        double basic_pay = 0;

        // Declaring a new scanner object
        Scanner in = new Scanner(System.in);


        // Prompting the user for input
        System.out.println("Welcome to the wage calculator!\n" +
                "Please enter your hours worked: ");
        double hours_worked = in.nextDouble();
        System.out.println("Please enter your total sales: ");
        double total_sales = in.nextDouble();

        // Calculating the commission
        if (total_sales > SALES_LIMIT){
            commission = total_sales * COMMISSION;
        } else {
            commission = 0;
        }

        // Calculating the wage
        if (hours_worked > HOUR_LIMIT){
            basic_pay = HOUR_LIMIT * BASIC_HOURLY_WAGE;
            over_time_hours = hours_worked - HOUR_LIMIT;
            over_time_pay = over_time_hours * OVER_TIME_WAGE;
            wage += (basic_pay + over_time_pay);
        } else {
            wage += hours_worked * BASIC_HOURLY_WAGE;
        }

        // adding the commission if it exists
        if (commission > 0){
            wage += commission;
        }

        // Casting the number of hours worked to an int
        int display_hours_worked = (int) hours_worked;

        // Displaying the required values to the screen
        System.out.printf("Number of hours worked: %d%nTotal sales: €%.2f%nWages: €%.2f", display_hours_worked, total_sales, wage);
    }
}
