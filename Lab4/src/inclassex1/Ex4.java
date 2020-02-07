package inclassex1;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final double EXCHANGE_RATE = 1.27;
        double converted_to_euro = 0;
        System.out.println("Coin options:\n" +
                "100p\n" +
                "50p\n" +
                "20p\n" +
                "10p\n" +
                "5p\n" +
                "2p\n" +
                "1p\n");

        System.out.println("Please enter a coin to see its equivalent euro value: £");
        int choice = in.nextInt();

        switch (choice){
            case 100:
                converted_to_euro = 1.00 * EXCHANGE_RATE;
                break;
            case 50:
                converted_to_euro = 0.50 * EXCHANGE_RATE;
                break;
            case 20:
                converted_to_euro = 0.20 * EXCHANGE_RATE;
                break;
            case 10:
                converted_to_euro = 0.10 * EXCHANGE_RATE;
                break;
            case 5:
                converted_to_euro = 0.05 * EXCHANGE_RATE;
                break;
            case 2:
                converted_to_euro = 0.02 * EXCHANGE_RATE;
                break;
            case 1:
                converted_to_euro = 0.01 * EXCHANGE_RATE;
                break;
            default:
                System.out.println("The value entered was not one of the valid options!");
        }

        System.out.printf("The value of the chosen coin is: € %.2f", converted_to_euro);
    }
}
