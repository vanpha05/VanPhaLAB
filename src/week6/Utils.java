/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Utils {

    private static Scanner sc = new Scanner(System.in);

    public static String checkEmpty(String string) {
        while (true) {
            System.out.print(string);
            String check = sc.nextLine();
            if (check.isEmpty()) {
                System.out.println("Data input is invalid.");
            } else {
                return check;
            }
        }

    }

    public static int checkId(String string) {
        while (true) {
            System.out.print(string);
            String check = sc.nextLine();
            try {
                int id = Integer.parseInt(check);
                return id;
            } catch (NumberFormatException e) {
                return -1;
            }
        }
    }
}
