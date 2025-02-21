/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NormalCal normalCal = new NormalCal();
        CalculateBMI bmi = new CalculateBMI();
        Perimeter peri = new Perimeter();
        Matrix matrix1, matrix2, resultMatrix;

        while (true) {
            System.out.println("========= Calculator Program =========");
            System.out.println("1. Matrix Operations");
            System.out.println("2. Perimeter Calculator");
            System.out.println("3. BMI Calculator");
            System.out.println("4. Normal Calculator");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the number of rows for the matrix: ");
                    int rows = scanner.nextInt();
                    System.out.print("Enter the number of columns for the matrix: ");
                    int cols = scanner.nextInt();
                    matrix1 = new Matrix(rows, cols);
                    System.out.println("Enter the elements for the first matrix:");
                    matrix1.inputData();

                    matrix2 = new Matrix(rows, cols);
                    System.out.println("Enter the elements for the second matrix:");
                    matrix2.inputData();

                    System.out.println("1. Add matrices");
                    System.out.println("2. Subtract matrices");
                    System.out.println("3. Multiply matrices");
                    System.out.print("Choose an operation: ");
                    int matrixChoice = scanner.nextInt();

                    switch (matrixChoice) {
                        case 1:
                            resultMatrix = matrix1.add(matrix2);
                            System.out.println("Result of addition:");
                            resultMatrix.display();
                            break;
                        case 2:
                            resultMatrix = matrix1.subtract(matrix2);
                            System.out.println("Result of subtraction:");
                            resultMatrix.display();
                            break;
                        case 3:
                            resultMatrix = matrix1.multiply(matrix2);
                            System.out.println("Result of multiplication:");
                            resultMatrix.display();
                            break;
                        default:
                            System.out.println("Invalid choice for matrix operation!");
                    }
                    break;

                case 2:
                    System.out.println("1. Rectangle");
                    System.out.println("2. Circle");
                    System.out.println("3. Triangle");
                    System.out.print("Choose a shape: ");
                    int shapeChoice = scanner.nextInt();

                    switch (shapeChoice) {
                        case 1:
                            System.out.print("Enter the width of the rectangle: ");
                            double width = scanner.nextDouble();
                            System.out.print("Enter the length of the rectangle: ");
                            double length = scanner.nextDouble();
                            System.out.println("Perimeter of Rectangle: " + peri.calculateRectangle(width, length));
                            break;
                        case 2:
                            System.out.print("Enter the radius of the circle: ");
                            double radius = scanner.nextDouble();
                            System.out.println("Perimeter of Circle: " + peri.calculateCircle(radius));
                            break;
                        case 3:
                            System.out.print("Enter side A of the triangle: ");
                            double sideA = scanner.nextDouble();
                            System.out.print("Enter side B of the triangle: ");
                            double sideB = scanner.nextDouble();
                            System.out.print("Enter side C of the triangle: ");
                            double sideC = scanner.nextDouble();
                            System.out.println("Perimeter of Triangle: " + peri.calculateTriangle(sideA, sideB, sideC));
                            break;
                        default:
                            System.out.println("Invalid choice for perimeter operation!");
                    }
                    break;

                case 3:
                    System.out.print("Enter weight (kg): ");
                    double weight = scanner.nextDouble();
                    System.out.print("Enter height (cm): ");
                    double height = scanner.nextDouble();
                    System.out.println("BMI Status: " + bmi.calculateBMI(weight, height));
                    break;

                case 4:
                    System.out.print("Enter first number: ");
                    double a = scanner.nextDouble();
                    System.out.print("Enter operator (+, -, *, /, ^): ");
                    String operator = scanner.next();
                    System.out.print("Enter second number: ");
                    double b = scanner.nextDouble();
                    double result = normalCal.calculate(a, operator, b);
                    System.out.println("Result: " + result);
                    break;

                case 5:
                    // Exit
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please choose a valid option.");
            }
        }
    }
}
