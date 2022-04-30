package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Duplicatevalue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter Array Length");
    int len =sc.nextInt();
    int Arr1[]= new int[len];
    int Arr2[] = new int[len];
    System.out.println("Enter Values in Array");
    for (int i=0;i<len;i++){
        Arr1[i]=sc.nextInt();
    }
    int k=0;
    for (int i = 0; i < len; i++) {
      for (int j = i+1; j < len; j++) {
        if (Arr1[i]==Arr1[j]) {
          Arr2[k]=Arr1[i];
          k++;  
        }
      } 
    } 
    int Arr3[] = Arrays.copyOf(Arr2, k);
    System.out.println("The Array is " + Arrays.toString(Arr1));
System.out.println("The Duplicate value is " + Arrays.toString(Arr3));
    sc.close();
}  
}
