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
public class Main105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Management105 manage = new Management105();
        
        while (true) {
            System.out.println("\n*** Information Management ***");
            System.out.println("1. Teacher Management");
            System.out.println("2. Student Management");
            System.out.println("3. Person Management");
            System.out.println("4. Exit");
            System.out.print("You choose: ");
            
            int choice = sc.nextInt();
            sc.nextLine(); // Clear buffer
            
            switch (choice) {
                case 1:
                    teacherMenu(manage, sc);
                    break;
                case 2:
                    studentMenu(manage, sc);
                    break;
                case 3:
                    personMenu(manage, sc);
                    break;
                case 4:
                    System.out.println("BYE AND SEE YOU NEXT TIME");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice, please try again!");
            }
        }
    }
    
    private static void teacherMenu(Management105 manage, Scanner sc) {
        while (true) {
            System.out.println("\n*** Teacher Management ***");
            System.out.println("1. Input");
            System.out.println("2. Print");
            System.out.println("3. Exit");
            System.out.print("You choose: ");
            
            int choice = sc.nextInt();
            sc.nextLine(); // Clear buffer
            
            switch (choice) {
                case 1:
                    manage.inputTeacher();
                    break;
                case 2:
                    manage.showTeacher();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice, please try again!");
            }
        }
    }
    
    private static void studentMenu(Management105 manage, Scanner sc) {
        while (true) {
            System.out.println("\n*** Student Management ***");
            System.out.println("1. Input");
            System.out.println("2. Print");
            System.out.println("3. Exit");
            System.out.print("You choose: ");
            
            int choice = sc.nextInt();
            sc.nextLine(); // Clear buffer
            
            switch (choice) {
                case 1:
                    manage.inputStudent();
                    break;
                case 2:
                    manage.showStudent();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice, please try again!");
            }
        }
    }
    
    private static void personMenu(Management105 manage, Scanner sc) {
        while (true) {
            System.out.println("\n*** Person Management ***");
            System.out.println("1. Search Person");
            System.out.println("2. Print All");
            System.out.println("3. Exit");
            System.out.print("You choose: ");
            
            int choice = sc.nextInt();
            sc.nextLine(); // Clear buffer
            
            switch (choice) {
                case 1:
                    manage.searchPerson();
                    break;
                case 2:
                    manage.printAllPerson();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice, please try again!");
            }
        }
    }
}
