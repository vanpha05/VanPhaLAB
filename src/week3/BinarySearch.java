/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

import java.util.Random;

/**
 *
 * @author LENOVO
 */
public class BinarySearch {

    private int[] array;

    public BinarySearch(int n) {
        this.array = new int[n];
    }

    void addValue() {
        Random ran = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = ran.nextInt(array.length);
        }
    }

    void showArray() {
        BubbleSort b=new BubbleSort();
        b.bubbleSort();
        for (int print : array) {
            System.out.print(print + " ");
        }
        System.out.println("");
    }

    int binarySearch(int[] ar, int search, int left, int right) {
        if (left > right) {
            return -1;
        }
        int middle = (left + right) / 2;
        if (ar[middle] == search) {
            return middle;
        } else if (ar[middle] > search) {
            return binarySearch(ar, search, left, middle - 1);
        } else {
            return binarySearch(ar, search, middle + 1, right);
        }

    }

    int search(int search) {
        int idx = binarySearch(array, search, 0, array.length - 1);
        if (idx >= 0) {
            System.out.println("Found " + search + " at index " +idx);
        }
        return -1;
    }

}
