package inclassex1;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double total_payment = 0.0;

        System.out.println("Loan Calculator!");
        System.out.println("Please enter the loan amount: ");
        double loan_amount = in.nextDouble();
        System.out.println("Please enter the annual interest rate: ");
        double annual_interest_rate = in.nextDouble();
        System.out.println("Please enter the loan duration (years): ");
        double loan_duration = in.nextDouble();

        double monthly_interest_rate = annual_interest_rate / 100.00 / 12;
        double number_of_payments = loan_duration * 12;

        double monthly_payment = (loan_amount*monthly_interest_rate) / (1-Math.pow(1+monthly_interest_rate, -number_of_payments));

        total_payment = monthly_payment * number_of_payments;

        int display_loan_duration = (int) loan_duration;

        System.out.printf("Loan amount: €%,.2f%n", loan_amount);
        System.out.printf("Annual interest rate: €%.1f%n", annual_interest_rate);
        System.out.printf("Loan period in years: %d%n", display_loan_duration);
        System.out.printf("Monthly payment: €%,.2f%n", monthly_payment);
        System.out.printf("Total payment: €%,.2f%n", total_payment);

    }
}
