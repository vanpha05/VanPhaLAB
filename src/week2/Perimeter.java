/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author LENOVO
 */
public class Perimeter {
    public double calculateRectangle(double width, double length) {
        return 2 * (width + length);
    }

    public double calculateCircle(double radius) {
        return 2 * Math.PI * radius;
    }

    public double calculateTriangle(double sideA, double sideB, double sideC) {
        return sideA + sideB + sideC;
    }
}

