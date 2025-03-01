/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class ContactManage {

    List<Contact> contactList = new ArrayList<>();

    public ContactManage() {
        contactList.add(new Contact(1, "Iker", "Casillas", "star", "Spain", "1234567890"));
        contactList.add(new Contact(2, "John", "Terry", "star", "England", "1234567890"));
        contactList.add(new Contact(3, "Raul", "Gonzalez", "star", "Spain", "1234567890"));
    }

    public boolean add(Contact c) {
        contactList.add(c);
        return true;
    }

    public boolean delete(int id) {
  //
    for(Contact c: contactList){
        if(c.getId()==id){
            contactList.remove(c);
            return true;
        }
    }
    return false;
    }

    public void dis() {
        for (Contact c : contactList) {
            System.out.println(c);
        }
    }
}
