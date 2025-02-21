/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class MainLong21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManage21 sM;
        Student21 s;
        int choice;
        while (true) {
            System.out.println("WELCOME TO STUDENT MANAGEMENT");
            System.out.println("1. Add");
            System.out.println("2. Find And Sort");
            System.out.println("3. Update Or Delete");
            System.out.println("4. Report");
            System.out.println("5. Exit!!!");
            System.out.print("Choose An Option: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    s = new Student21();
                    sM = new StudentManage21();

                    System.out.println("Enter ID: ");
                    s.setId(sc.next());

                    System.out.println("Enter Name: ");
                    s.setName(sc.next());

                    System.out.println("Enter Semester: ");
                    s.setSemester(sc.next());

                    System.out.println("Enter Course: ");
                    s.setCourse(sc.next());

                    if (sM.Add(s) == true) {
                        System.out.println("Succesful.");
                    } else {
                        System.out.println("Error...");
                    }

                    System.out.println();
                    break;
                case 2:
                    sM = new StudentManage21();

                    System.out.println("Name Of The Student: ");
                    String fName = sc.next();

                    List<Student21> found = sM.findStudent(fName);
                    sM.sortStu();
                    for (Student21 stu : found) {
                        System.out.println(stu);
                    }
                    break;
                case 3:
                    sM = new StudentManage21();
                    System.out.println("Update Or Delete - Enter Student ID: ");
                    String id = sc.next();
                    if (sM.findStuById(id)) {
                        System.out.println("1. Update   2. Delete");
                        choice = sc.nextInt();
                        if (choice == 1) {
                            Student21 newStu = new Student21();
                            System.out.println("Enter New Name: ");
                            newStu.setName(sc.next());
                            System.out.println("Enter New Semester: ");
                            newStu.setSemester(sc.next());
                            System.out.println("Enter New Course: ");
                            newStu.setCourse(sc.next());
                            System.out.println(sM.updateStu(newStu, id) ? "Update Successful" : "Update Failed");
                        } else if (choice == 2) {
                            sM.deleteStu(Integer.parseInt(id));
                            System.out.println("Delete Successful");
                        }
                    } else {
                        System.out.println("Student Not Found");
                    }
                    break;
                case 4:
                    sM=new StudentManage21();
                    sM.reportStu();
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid Choice!!! Please Try Again...");
                    System.out.println();

            }

        }
    }
}
