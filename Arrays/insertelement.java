package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class insertelement {
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
    System.out.println("Enter Value for insert");
    int value = sc.nextInt();
    System.out.println("Enter the index");
    int index = sc.nextInt();
    Arr1[index]=value;
    System.out.println(Arrays.toString(Arr1));
    sc.close();
}
}
