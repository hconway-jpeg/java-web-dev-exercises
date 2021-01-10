package exercises;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        RectangleArea rectangleArea = new RectangleArea();
        rectangleArea.calculateArea();
    }
    public void calculateArea() {
        Scanner input = new Scanner(System.in);
        System.out.println("Specify length of rectangle: ");
        Double length = input.nextDouble();
        System.out.println("Specify width of rectangle: ");
        Double width = input.nextDouble();
        input.close();
        Double area = length * width;
        System.out.println("Area of specified rectangle is: " + area.toString());
    }
}
