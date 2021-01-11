package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Specify radius of circle: ");
        Double radius = input.nextDouble();
        input.close();

        Double area = Circle.getArea(radius);
        System.out.println("The area of a circle with the specified dimensions is " + area);
    }
}
