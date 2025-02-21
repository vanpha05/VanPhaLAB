/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4.bai2;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Teacher105 extends Person105 {

    private int yearProfession;
    private String contractType;
    private double salary;

    public Teacher105() {
        super();
        this.yearProfession = 0;
        this.contractType = "";
        this.salary = 0;
    }

    public int getYearProfession() {
        return yearProfession;
    }

    public void inputAll(Scanner sc) {
        super.inputAll(sc);
        while (true) {
            yearProfession = Utils.checkInt("Enter year in profession: ");
            if (yearProfession < 2025 - yearOfBirth) {
                break;
            } else {
                System.out.println("Data input is invalid.");
            }
        }

        while (true) {
            System.out.print("Enter contract type(Long and Short): ");
            contractType = sc.nextLine();
            if (contractType.equalsIgnoreCase("long") || contractType.equalsIgnoreCase("short")) {
                break;
            } else {
                System.out.println("Data input is invalid.");
            }
        }
        salary = Utils.checkDouble("Enter salary: ");

    }

    @Override
    public String toString() {
        return super.toString() + String.format("%-2d - %5s - %5s", yearProfession, contractType, salary);
    }

}
