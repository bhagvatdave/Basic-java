package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class secondminimax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter Array Length");
    int len =sc.nextInt();
    int Arr1[]= new int[len];
    System.out.println("Enter Values in Array");
    for (int i=0;i<len;i++){
        Arr1[i]=sc.nextInt();
    }
    Arrays.sort(Arr1);

    System.out.println("2nd Minimum value is " + Arr1[1]);
    System.out.println("2nd Maximum value is " + Arr1[len-2]);  
    sc.close();
}  
}
