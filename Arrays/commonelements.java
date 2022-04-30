package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class commonelements {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter First Array Length");
    int len =sc.nextInt();
    String Arr1[]= new String[len];
    System.out.println("Enter Second Array Length");
    int len2 =sc.nextInt();
    String Arr2[] = new String[len2];
    String Arr3[] =new String[Math.max(len,len2)];
    System.out.println("Enter Values in First Array");
    for (int i=0;i<len;i++){
        Arr1[i]=sc.next();
    }
    System.out.println("Enter Values in Second Array");
    for (int i=0;i<len2;i++){
        Arr2[i]=sc.next();
    }
    int k=0;
    for (int i = 0; i < len; i++) {
      for (int j = 0; j < len2; j++) {
        if (Arr1[i]==Arr2[j]) {
          Arr3[k]=Arr1[i];
          k++;  
        }
      } 
    } 
    String Arr4[] = Arrays.copyOf(Arr3, k);
    System.out.println("The First Array is " + Arrays.toString(Arr1));
    System.out.println("The Second Array is " + Arrays.toString(Arr2));
System.out.println("The common value is " + Arrays.toString(Arr4));
    sc.close();
}  
}
