/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.List;
import java.util.Scanner;
import week5.Course;

/**
 *
 * @author LENOVO
 */
public class Utils {

    private static Scanner sc = new Scanner(System.in);
    
    public static String input(String string){
        System.out.print(string);   
        return sc.nextLine();
    }

    public static String checkId(String string, List<Course> courseList) {
        while (true) {
            System.out.print(string);
            String id = sc.nextLine();
            for (Course c : courseList) {
                if (c.getCourseID().equalsIgnoreCase(id)) {
                    System.out.println("Data input is invalid, ID must be unique");
                }
            }
            if (id.isEmpty()) {
                System.out.println("Data input is invalid.");
            } else {
                return id;
            }
        }
    }

    public static String checkName(String string, List<Course> courseList) {
        while (true) {
            System.out.print(string);
            String name = sc.nextLine();
            for (Course c : courseList) {
                if (c.getCourseName().equalsIgnoreCase(name)) {
                    System.out.println("Data input is invalid, Name must be unique");
                }
            }
            if (name.isEmpty()) {
                System.out.println("Data input is invalid.");
            } else {
                return name;
            }
        }
    }

    public static int checkCredit(String string) {
        while (true) {
            System.out.print(string);
            int credit = Integer.parseInt(sc.nextLine());
            if (credit <= 0) {
                System.out.println("Data input is invalid.");
            } else {
                return credit;
            }
        }
    }

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
    
    public static String checkDate(String string){
        while(true){
            System.out.print(string);
            String date = sc.nextLine();
            if(!date.matches("\\d{2}/\\d{2}/\\d{4}")){
                System.out.println("Data input is invalid.");
            }else{
                String[] split = date.split("/");
                int day = Integer.parseInt(split[0]);
                String month= split[1];
                int year= Integer.parseInt(split[2]);
                
                if(year<=2025&&day<=24){
                    if(month.equals("02")) System.out.println("Data input is invalid.");
                    continue;
}
                
                if(year<2025){
                    System.out.println("Data input is invalid.");
                    continue;
                }
                
                if(month.equals("01") || month.equals("02") || month.equals("03") || month.equals("04") 
                  || month.equals("05") || month.equals("06") || month.equals("07") || month.equals("08") 
                  || month.equals("09") || !month.equals("10") || month.equals("11") || month.equals("12")){    
                }else{
                    System.out.println("Data input is invalid.");
                    continue;
                }
                
                int[] dayInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
                if(day < 1 || day > dayInMonth[Integer.parseInt(month) - 1]){
                    System.out.println("Data input is invalid.");
                    continue;
                }
                
                return date;
            }
            
        }
    }
}