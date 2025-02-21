/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author LENOVO
 */
public class CalculateBMI {
    public String calculateBMI(double weight, double height) {
        double bmi = weight / Math.pow(height / 100, 2);
        if (bmi < 19) {
            return "Underweight";
        } else if (bmi <= 25) {
            return "Normal weight";
        } else if (bmi <= 30) {
            return "Overweight";
        } else if (bmi <= 40) {
            return "Obese";
        } else {
            return "Severely Obese";
        }
    }
}




