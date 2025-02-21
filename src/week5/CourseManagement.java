/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class CourseManagement {

    List<OnlineCourse> onlineCourses = new ArrayList();

    public void add(OnlineCourse c) {
        onlineCourses.add(c);
    }

    public void delete(String idCourse) {
        for (OnlineCourse c : onlineCourses) {
            if (c.getCourseID().equalsIgnoreCase(idCourse)) {
                onlineCourses.remove(c);
            }
        }
    }

    public void update(String idCourse) {
        Scanner sc = new Scanner(System.in);
        for (OnlineCourse c : onlineCourses) {
            if (c.getCourseID().equalsIgnoreCase(idCourse)) {
                System.out.println(c.toString());
                System.out.println("Enter New Name : ");
                c.setCourseName(sc.nextLine());
                System.out.println("Enter New Credits: ");
                c.setCredits(sc.nextInt());
                System.out.println("Enter New Platform: ");
                c.setPlatform(sc.nextLine());
                System.out.println("Enter New Instructor: ");
                c.setInstructor(sc.nextLine());
                System.out.println("Enter New Note: ");
                c.setNote(sc.nextLine());
            }
        }

    }

    public void show() {
        for(OnlineCourse c:onlineCourses){
            System.out.println(c.toString());
        }
    }

}
