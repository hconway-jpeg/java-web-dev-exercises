package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        MilesPerGallon milesPerGallon = new MilesPerGallon();
        milesPerGallon.calculateMilesPerGallon();
    }
    public void calculateMilesPerGallon() {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?: ");
        Double miles = input.nextDouble();
        System.out.println("How much gas has been consumed (in gallons)?: ");
        Double gallon = input.nextDouble();
        Double mpg = miles / gallon;
        System.out.println("Your mpg rating is: " + mpg.toString());
    }
}
