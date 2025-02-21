/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("------Main Menu------");
            System.out.println("1. Change Base Number");
            System.out.println("2. Linear Search");
            System.out.println("3. Calculate Equations");
            System.out.println("4. Count Letters and Words");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int mainChoice = sc.nextInt();

            switch (mainChoice) {
                case 1:         
                    changeBaseMenu(sc);
                    break;
                case 2:
                    linearSearchMenu(sc);
                    break;
                case 3:
                    calculateMenu(sc);
                    break;
                case 4:
                    lettCharCountMenu(sc);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }

    public static void changeBaseMenu(Scanner sc) {
        System.out.println("Change Base Number Menu:");
        System.out.println("1. Convert Binary to Decimal");
        System.out.println("2. Convert Decimal to Binary");
        System.out.println("3. Convert Decimal to Hexadecimal");
        System.out.println("4. Convert Hexadecimal to Decimal");
        System.out.println("5. Convert Hexadecimal to Binary");
        System.out.println("6. Convert Binary to Hexadecimal");
        System.out.print("Choose an option: ");
        int choice = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter the number: ");
        String input = sc.nextLine();
        ChangeBaseNum baseNum = new ChangeBaseNum(2, 10, input);

        switch (choice) {
            case 1:
                System.out.println("Decimal: " + baseNum.binToDec());
                System.out.println();
                break;
            case 2:
                System.out.println("Binary: " + baseNum.decToBin());
                System.out.println();
                break;
            case 3:
                System.out.println("Hexadecimal: " + baseNum.decToHex());
                System.out.println();
                break;
            case 4:
                baseNum = new ChangeBaseNum(16, 10, input);
                System.out.println("Decimal: " + baseNum.hexToDec());
                System.out.println();
                break;
            case 5:
                baseNum = new ChangeBaseNum(16, 2, input);
                System.out.println("Binary: " + baseNum.hexToBin());
                System.out.println();
                break;
            case 6:
                baseNum = new ChangeBaseNum(2, 16, input);
                System.out.println("Hexadecimal: " + baseNum.binToHex());
                System.out.println();
                break;
            default:
                System.out.println("Invalid choice.");
                System.out.println();
        }
    }

    public static void linearSearchMenu(Scanner sc) {
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        LinearSearch search = new LinearSearch(size);
        search.addValue();
        search.showArray();

        System.out.print("Enter the number to search for: ");
        int number = sc.nextInt();
        search.search(number);
    }


    public static void calculateMenu(Scanner sc) {
        System.out.println("Choose the equation type:");
        System.out.println("1. Linear Equation");
        System.out.println("2. Quadratic Equation");
        System.out.print("Choose an option: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter a: ");
            double a = sc.nextDouble();
            System.out.print("Enter b: ");
            double b = sc.nextDouble();
            Calculate calc = new Calculate(a, b);
            calc.calculateLinearEquation();
        } else if (choice == 2) {
            System.out.print("Enter a: ");
            double a = sc.nextDouble();
            System.out.print("Enter b: ");
            double b = sc.nextDouble();
            System.out.print("Enter c: ");
            double c = sc.nextDouble();
            Calculate calc = new Calculate(a, b, c);
            calc.calculateQuadraticEquation();
        } else {
            System.out.println("Invalid choice.");
        }
    }


    public static void lettCharCountMenu(Scanner sc) {
        sc.nextLine();
        System.out.print("Enter the string: ");
        String input = sc.nextLine();
        LettCharCount count = new LettCharCount(input);

        System.out.println("Word count: " + count.countWord());
        System.out.println("Character count: " + count.countChar());
        System.out.println();
    }
    
}
