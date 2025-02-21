/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class StudentManage21 {

    Student21 s = new Student21();
    Scanner sc = new Scanner(System.in);
    private List<Student21> studentsList = new ArrayList<>();

    private boolean checkStu(Student21 s) {
    for (Student21 existStu : studentsList) {
        if (existStu.getId().equalsIgnoreCase(s.getId()) &&
            existStu.getSemester().equalsIgnoreCase(s.getSemester()) &&
            existStu.getCourse().equalsIgnoreCase(s.getCourse())) {
            return false; 
        }
    }
    return true; 
}

    public boolean Add(Student21 s) {
        if (checkStu(s)) {
            studentsList.add(s);
            return true;
        } else {
            return false;
        }
    }
    
    public void showStudent(){
        for(Student21 s:studentsList){
            System.out.println(s.toString());
        }
    }
    
    public List<Student21> findStudent(String name){
        List<Student21> findStu=new ArrayList<>();
        for(Student21 s: studentsList){
            if(s.getName().equalsIgnoreCase(name)){
                findStu.add(s);
            }
        }
        return findStu;
    }
    public boolean findStuById(String id){
        for(Student21 s:studentsList){
            if(s.getId().equalsIgnoreCase(id)){
                return true ;
            }
        }
        return false;
    }
    public int deleteStu(int id){
        for(Student21 s: studentsList){
            if(s.getId().equals(id)){
                studentsList.remove(s);
            }
        }
        return 0;
    }
    public boolean updateStu(Student21 o,String oldId){
        if(findStuById(oldId)){
            for(Student21 s:studentsList){
                if(s.getId().equalsIgnoreCase(oldId)){
                    s.setName(o.getName());
                    s.setSemester(o.getSemester());
                    s.setCourse(o.getCourse());
                    return true;
                }
            }
        }
        
        return false;
    }
    public void sortStu(){
        Collections.sort(studentsList,new Comparator<Student21>() {
            @Override
            public int compare(Student21 o1, Student21 o2) {
               return o1.getName().compareTo(o2.getName());
            }
        });
    }
    public void reportStu(){
        Map<String, Integer> report =new HashMap<>();
        for(Student21 s:studentsList){
            String key =s.getId()+" | "+s.getName()+ " | "+s.getCourse();
            report.put(key, report.getOrDefault(key,0)+1);
        }
        for(Map.Entry<String,Integer> entry:report.entrySet()){
            System.out.println(entry.getKey()+" | "+entry.getValue());
        }
    }

}

//    Student21 FindStudent(String name) {
//        for (Student21 s : studentsList) {
//            if (s.getName().toLowerCase().contains(name.toLowerCase())) {
//                return s;
//            }
//        }
//        return null;
//    }
//
////    Student FindStudent(int id) {
////        for (Student s : studentsList) {
////            if (s.getId() == id) {
////                return s;
////            }
////        }
////        return null;
////    }
//    void Sort(Student21 o) {
//        ArrayList<Student> fStudent = new ArrayList<>();
//        fStudent.add(o);
//        fStudent.sort(Comparator.comparing(s -> s.getName()));
//    }
//
////    boolean Update(Student student, String newName, String newSemester, String newCourse) {
////        if (student == null) {
////            return false;
////        } else {
////
////            if (newName != null && !newName.isEmpty()) {
////                Student.student.name = newName;
////            }
////            if (newSemester != null && !newSemester.isEmpty()) {
////                student.semester = newSemester;
////            }
////            if (newCourse != null && !newCourse.isEmpty()) {
////                student.course = newCourse;
////            }
////
////            return true;
////        }
////    }
//    boolean deleteStudent(Student21 student) {
//        if (student == null) {
//            return false;
//        }
//        return studentsList.remove(student);
//    }
//
//    public List<String> generateReport() {
//        Map<String, Integer> reportData = new HashMap<>();
//
//        // Duyệt danh sách sinh viên để đếm số lần đăng ký khóa học
//        for (Student21 s : studentsList) {
//            String key = s.getName() + " | " + s.getCourse();
//            reportData.put(key, reportData.getOrDefault(key, 0) + 1);
//        }
//
//        // Chuyển dữ liệu từ Map thành danh sách kết quả
//        List<String> reportLines = new ArrayList<>();
//        for (Map.Entry<String, Integer> entry : reportData.entrySet()) {
//            reportLines.add(entry.getKey() + " | " + entry.getValue());
//        }
//        return reportLines; // Trả về danh sách kết quả
//    }
//
//}
