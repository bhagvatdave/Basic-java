package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class reverceArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter Array Length");
    int len =sc.nextInt();
    int Arr1[]= new int[len];
    System.out.println("Enter Values in Array");
    for (int i=0;i<len;i++){
        Arr1[i]=sc.nextInt();
    }
    System.out.println(Arrays.toString(Arr1));
    int count=(len%2==0) ? len/2 : (len+1)/2;
    //int count = len/2;
    for (int i = 0; i < count; i++) {
        int temp=Arr1[i];
        Arr1[i]=Arr1[len-i-1];
        Arr1[len-i-1]=temp;
    }
    System.out.println("Reverced Arrays");
    System.out.println(Arrays.toString(Arr1)); 
    
    sc.close();
}
}
