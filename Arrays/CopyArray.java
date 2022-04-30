package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter Array Length");
    int len =sc.nextInt();
    int Arr1[]= new int[len];
    System.out.println("Enter Values in Array");
    for (int i=0;i<len;i++){
        Arr1[i]=sc.nextInt();
    }
    int Arr2[] = new int [len];
    for (int i = 0; i < len; i++) {
        Arr1[i]=Arr2[i];
    }
    System.out.println(Arrays.toString(Arr2));
    sc.close();
} 
}
