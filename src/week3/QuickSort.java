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
public class QuickSort {

    int[] array;

    public QuickSort(int n) {
        this.array = new int[n];
    }

    void addValue() {
        Random ran = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = ran.nextInt(array.length);
        }
    }

    void showArray() {
        for (int print : array) {
            System.out.print(print + " ");
        }
        System.out.println("");
    }

    public int Partition(int[] a, int l, int r) {
        int i = l;
        int j = r;
        int pv = a[(l + r) / 2];
        while (i <= j) {
            while (a[i] < pv) {
                i++;
            }
            while (a[j] > pv) {
                j--;
            }
            if (i <= j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
        return i;
    }

    void QuickSort(int[] a,int l,int r) {
        int i=Partition(a,l,r);
        if(i<r)QuickSort(a,l,r);
        if(l<i-1)QuickSort(a,l,i-1);
    }
}
