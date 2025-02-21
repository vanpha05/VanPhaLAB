/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author LENOVO
 */
public class NormalCal {
    public double calculate(double a, String operator, double b) {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b == 0) {
                    System.out.println("Cannot divide by zero!");
                    return 0;
                }
                return a / b;
            case "^":
                return Math.pow(a, b);
            default:
                System.out.println("Invalid operator!");
                return 0;
        }
    }
}
