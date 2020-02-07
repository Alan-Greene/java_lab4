package inclassex1;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        final double PI = Math.PI;
        double area = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the radius of your circle: ");
        double radius = in.nextDouble();

        while (radius < 0){
            System.out.println("Oops! The radius cannot be a negative number!");
            System.out.println("Please enter the radius of your circle: ");
            radius = in.nextDouble();
        }

        area = (PI * (radius*radius));

        System.out.printf("The area of the circle is: %.2f", area);
    }
}
