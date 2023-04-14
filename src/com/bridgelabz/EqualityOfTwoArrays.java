package com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

public class EqualityOfTwoArrays {

    public static void main(String[] args) {
        //initialising the first Array
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Size of Array1 : ");
        int sizeArray1 = scanner.nextInt();

        int []array1 = new int[sizeArray1];
        for (int i=0; i<sizeArray1; i++) {
            System.out.println("Enter the Element in Array1 : ");
            array1[i] = scanner.nextInt();
        }
        //initialising the Second Array
        System.out.println("Enter the Size of Array2 : ");
        int sizeArray2 = scanner.nextInt();
        int []array2 = new int[sizeArray2];
        for (int i=0; i<sizeArray2; i++) {
            System.out.println("Enter the Element in Array2 : ");
            array2[i] = scanner.nextInt();
        }
        //whether 2 Arrays are Equal or Not
          boolean result = Arrays.equals(array1,array2);
        if (result == true)
            System.out.println("Two Arrays are Equal");
        else
            System.out.println("Two Arrays Are NOT Equal");

    }
}
