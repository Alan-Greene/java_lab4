package inclassex1;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final double BASIC_HOURLY_WAGE = 10.0;
        final double OVER_TIME_WAGE = BASIC_HOURLY_WAGE + (BASIC_HOURLY_WAGE / 2);
        final double HOUR_CUTOFF = 8;
        double over_time_hours = 0;
        double take_home_pay = 0;
        int hours_worked = 0;

        System.out.println("Welcome to the wage calculator!\n" +
                "Please enter all times in 24h format!");

        System.out.println("Enter the start time: ");
        int start_time = in.nextInt();
        System.out.println("Enter the finish time: ");
        int finish_time = in.nextInt();

        start_time = start_time / 100;
        finish_time = finish_time / 100;
        hours_worked = (finish_time - start_time) - 1;

        while (hours_worked < 0){
            System.out.println("Oops!\n" +
                    "The hours worked cannot be less than 0!");

            System.out.println("Enter the start time: ");
            start_time = in.nextInt();
            System.out.println("Enter the finish time: ");
            finish_time = in.nextInt();

            start_time = start_time / 100;
            finish_time = finish_time / 100;

            hours_worked = (finish_time - start_time) - 1;
        }

        if (hours_worked > HOUR_CUTOFF){
            over_time_hours = hours_worked - HOUR_CUTOFF;
            take_home_pay = (HOUR_CUTOFF * BASIC_HOURLY_WAGE) + (over_time_hours * OVER_TIME_WAGE);
        } else if (hours_worked < HOUR_CUTOFF) {
            take_home_pay = hours_worked * BASIC_HOURLY_WAGE;
        } else {
            System.out.println("ERROR!");
        }

        System.out.printf("hours worked: %d%n", hours_worked);
        System.out.printf("Overtime hours worked: %.1f%n", over_time_hours);
        System.out.printf("Take home pay: €%.2f", take_home_pay);

    }
}
