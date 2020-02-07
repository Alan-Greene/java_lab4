package inclassex1;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String choice = "";

        System.out.println("List of possible operators:");
        System.out.println("||\n" +
                "&&\n" +
                "!\n");
        System.out.println("Please enter your logical operator of choice: ");
        choice = in.nextLine();

        if (choice.equals("||")) {
            System.out.printf("The %s operator represents a logical OR!", choice);
        } else if (choice.equals("&&")){
            System.out.printf("The %s operator represents a logical AND!", choice);
        } else if (choice.equals("!")){
            System.out.printf("The %s operator represents a logical NOT", choice);
        } else {
            System.out.println("We are sorry, but the input was not recognised");
        }

    }
}
