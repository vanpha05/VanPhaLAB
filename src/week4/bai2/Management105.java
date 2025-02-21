/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4.bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Management105 {

    Scanner sc = new Scanner(System.in);
    List<Student105> manageStudent = new ArrayList<>();
    List<Teacher105> manageTeacher = new ArrayList<>();
    List<Person105> person = new ArrayList<>();

    public void inputStudent() {
        int n = Utils.checkInt("How Many People You Want To Input: ");
        for (int i = 0; i < n; i++) {
            Student105 student = new Student105();
            student.inputAll(sc);
            manageStudent.add(student);
        }
    }

    public void showStudent() {
        if (manageStudent.isEmpty()) {
            System.out.println("Empty!!!");
        } else {
            sortStudent();
            for (Student105 student : manageStudent) {
                System.out.println(student);
            }
        }
    }

    private void sortStudent() {
        Collections.sort(manageStudent, new Comparator<Student105>() {
            @Override
            public int compare(Student105 o1, Student105 o2) {
                return Integer.compare(o1.getYearOfAdmission(), o2.getYearOfAdmission());
            }

        });
    }

    public void inputTeacher() {
        int n = Utils.checkInt("How Many People You Want To Input: ");
        for (int i = 0; i < n; i++) {
            Teacher105 teacher = new Teacher105();
            teacher.inputAll(sc);
            manageTeacher.add(teacher);
        }
    }

    public void showTeacher() {
        if (manageTeacher.isEmpty()) {
            System.out.println("Empty!!!");
        } else {
            sortTeacher();
            for (Teacher105 teacher : manageTeacher) {
                System.out.println(teacher);
            }
        }
    }

    private void sortTeacher() {
        Collections.sort(manageTeacher, new Comparator<Teacher105>() {
            @Override
            public int compare(Teacher105 o1, Teacher105 o2) {
                return Integer.compare(o2.getYearProfession(), o1.getYearProfession());
            }

        });
    }

    public void searchPerson() {
        String name = Utils.checkName("Enter Name To Find: ");
        for (Person105 p : manageTeacher) {
            if (p.getName().equalsIgnoreCase(name)) {
                System.out.println(p.toString());
            }
        }
        for (Person105 p : manageStudent) {
            if (p.getName().equalsIgnoreCase(name)) {
                System.out.println(p.toString());
            }
        }

    }
    public void printAllPerson(){
        person.addAll(manageTeacher);
        person.addAll(manageStudent);
        sortPerson();
        for(Person105 p: person){
            System.out.println(p.getId()+" - "+p.getName()+" - "+p.getPhone()+" - "+p.getYearOfBirth()+" - "+p.getMajor());
        }
    }
    private void sortPerson(){
        Collections.sort(person, new Comparator<Person105>(){
                @Override
                public int compare(Person105 o1, Person105 o2) {
                    return Integer.compare(o1.yearOfBirth, o2.yearOfBirth);
                }
                
            });
    }
    
}
