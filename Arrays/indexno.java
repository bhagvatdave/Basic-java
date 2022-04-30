package Arrays;

import java.util.Scanner;

public class indexno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Length");
        int len =sc.nextInt();
        int Arr1[]= new int[len];
        System.out.println("Enter Values in Array");
        for (int i=0;i<len;i++){
            Arr1[i]=sc.nextInt();
        }
        System.out.println("Enter Value for Checking");
        int look = sc.nextInt();
        for (int j=0;j<len;j++){
        if (look==Arr1[j]) {
            System.out.println("Index No of value is " + j); 
        }
    }
        sc.close();
    }  
} 

