/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

import java.util.Random;

/**
 *
 * @author LENOVO
 */
public class LinearSearch {
      private int[] array;

    public LinearSearch(int n) {
        this.array = new int[n];
    }

    void addValue() {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(array.length);
        }
    }

    void showArray() {
        System.out.print("The array: ");
       
        for(int print: array){
            System.out.print(print+" ");          
        }
        System.out.println("");
        
    }

    int search(int number) {
        showArray();
     //
     
    for(int i=0;i<array.length;i++){
     if(number==array[i])
         return i;
    }     
     return -1;   
    }
}
