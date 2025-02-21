
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BubbleSort bubbleSort = null;
        BinarySearch binarySearch = null;
        QuickSort quickSort = null;
        MyStack myStack = new MyStack();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Bubble Sort");
            System.out.println("2. Quick Sort");
            System.out.println("3. Binary Search");
            System.out.println("4. Stack Operations");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter array size: ");
                    int n1 = sc.nextInt();
                    bubbleSort = new BubbleSort(n1);
                    bubbleSort.bubbleSort();
                    break;

                case 2:
                    System.out.print("Enter array size: ");
                    int n2 = sc.nextInt();
                    quickSort = new QuickSort(n2);
                    quickSort.addValue();
                    System.out.print("Unsorted array: ");
                    quickSort.showArray();
                    quickSort.QuickSort(quickSort.array, 0, n2 - 1);
                    System.out.print("Sorted array: ");
                    quickSort.showArray();
                    break;

                case 3:
                    System.out.print("Enter array size: ");
                    int n3 = sc.nextInt();
                    binarySearch = new BinarySearch(n3);
                    binarySearch.addValue();
                    binarySearch.showArray();
                    System.out.print("Enter value to search: ");
                    int searchVal = sc.nextInt();
                    int result = binarySearch.search(searchVal);
                    if (result == -1) {
                        System.out.println(searchVal + " not found in array.");
                    }
                    break;

                case 4:
                    while (true) {
                        System.out.println("\nStack Operations:");
                        System.out.println("1. Push");
                        System.out.println("2. Pop");
                        System.out.println("3. GetAt Index");
                        System.out.println("4. Back to Main Menu");
                        System.out.print("Choose an option: ");
                        int stackChoice = sc.nextInt();

                        switch (stackChoice) {
                            case 1:
                                System.out.print("Enter value to push: ");
                                int pushVal = sc.nextInt();
                                myStack.push(pushVal);
                                break;
                            case 2:
                                myStack.pop();
                                break;
                            case 3:
                                System.out.print("Enter index: ");
                                int index = sc.nextInt();
                                myStack.getAt(index);
                                break;
                            case 4:
                                break;
                            default:
                                System.out.println("Invalid choice.");
                        }
                        if (stackChoice == 4) break;
                    }
                    break;
                
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
