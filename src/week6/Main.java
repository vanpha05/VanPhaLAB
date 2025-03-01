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
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Contact c;
        ContactManage cM = new ContactManage();
        int choice;
        while (true) {
            System.out.println("=========== CONTACT PROGRAM ========");
            System.out.println("1. Add A Contact");
            System.out.println("2. Display All Contact");
            System.out.println("3. Delete");
            System.out.println("4. Exit!!!");
            System.out.print("Choose An Option: ");
            choice = sc.nextInt();
            System.out.println();
            switch (choice) {
                case 1:
                    c = new Contact();
                    c.setId(Utils.checkId("Enter ID: "));
                    c.setFirstName(Utils.checkEmpty("Enter First Name: "));
                    c.setLastName(Utils.checkEmpty("Enter Last Name: "));
                    c.setGroup(Utils.checkEmpty("Enter Group: "));
                    System.out.println("Please input Phone flow\n"
                            + "1234567890\n"
                            + "123-456-7890\n"
                            + "123-456-7890 x1234\n"
                            + "123-456-7890 ext1234\n"
                            + "123.456.7890\n"
                            + "123 456 7890");
                    c.setPhone(Utils.checkEmpty("Enter Phone: "));
                    if(cM.add(c)){
                        System.out.println("Successful!!!");
                    }
                   else System.out.println("Add Failed!!!");
                    break;
                case 2:
                    cM.dis();
                    System.out.println();
                    break;
                case 3:
                    int id=Utils.checkId("Enter An ID You Want To Delete: ");
                    
                    cM.delete(id);
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid Choice!!! Please Try Again...");
                    System.out.println();

            }

        }
    }
}
