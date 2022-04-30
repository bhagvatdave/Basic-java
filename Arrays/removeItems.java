package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class removeItems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter Array Length");
    int len =sc.nextInt();
    int Arr1[]= new int[len];
    int Arr2[] = new int [len-1];
    int k=0;
    System.out.println("Enter Values in Array");
    for (int i=0;i<len;i++){
        Arr1[i]=sc.nextInt();
    }
    System.out.println("Enter Value for removing");
    int remove = sc.nextInt();
    for (int i = 0; i < len; i++) {
        if (Arr1[i]==remove) {
           continue;
        }
        Arr2[k]=Arr1[i];
        k++;    
    }
    System.out.println("Array after Removing");
    System.out.println(Arrays.toString(Arr2));
    sc.close();
} 
}
