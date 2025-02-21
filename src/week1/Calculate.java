/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;


/**
 *
 * @author LENOVO
 */
public class Calculate {

   private double a;
    private double b;
    private double c;

    public Calculate(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Calculate(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public void calculateLinearEquation() {
        if (a == 0) {
            System.out.println("No solution (a = 0).");
            return;
        }
        double x = -b / a;
        System.out.println("Solution: x = " + x);
        printNumberProperties();
    }


    public void calculateQuadraticEquation() {
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("No solution.");
        } else if (delta == 0) {
            double x1 = -b / (2 * a);
            System.out.println("The equation has a double root: x1 = x2 = " + x1);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Solutions: x1 = " + x1 + ", x2 = " + x2);
        }
        printNumberProperties();
    }


    private void printNumberProperties() {
        System.out.print("Even numbers: ");
        if (a % 2 == 0) System.out.print(a + " ");
        if (b % 2 == 0) System.out.print(b + " ");
        if (c % 2 == 0) System.out.print(c + " ");
        System.out.println();

        System.out.print("Odd numbers: ");
        if (a % 2 != 0) System.out.print(a + " ");
        if (b % 2 != 0) System.out.print(b + " ");
        if (c % 2 != 0) System.out.print(c + " ");
        System.out.println();

        System.out.print("Perfect square numbers: ");
        if (isPerfectSquare(a)) System.out.print(a + " ");
        if (isPerfectSquare(b)) System.out.print(b + " ");
        if (isPerfectSquare(c)) System.out.print(c + " ");
        System.out.println();
    }

    private boolean isPerfectSquare(double number) {
        return Math.sqrt(number) == (int) Math.sqrt(number);
    }
}

