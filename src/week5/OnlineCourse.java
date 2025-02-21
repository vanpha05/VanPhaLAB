/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

/**
 *
 * @author LENOVO
 */
public class OnlineCourse extends Course {
    private String platform;
    private String instructor;
    private String note;

    public OnlineCourse() {
        super();
        this.platform = "";
        this.instructor ="";
        this.note = "";
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void inputAll(String pf,String ins,String nt,String id, String name,int cre){
        super.inputAll(id, name, cre);
        this.platform=pf;
        this.instructor=ins;
        this.note=nt;
    }

    @Override
    public String toString() {
        return super.toString()+"OnlineCourse{" + "platform=" + platform + ", instructor=" + instructor + ", note=" + note + '}';
    }
    
}
