package Arrays;

import java.util.Scanner;

public class minimax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter Array Length");
    int len =sc.nextInt();
    int Arr1[]= new int[len];
    System.out.println("Enter Values in Array");
    for (int i=0;i<len;i++){
        Arr1[i]=sc.nextInt();
    }
    int minmum=Arr1[0];
    int maximum=Arr1[0];
    for (int i = 0; i < len; i++) {
        if (minmum>Arr1[i]) {
        minmum=Arr1[i];
        }
        if (maximum<Arr1[i]) {
            maximum=Arr1[i];
        }

    }
    System.out.println("Minimum value is " + minmum);
    System.out.println("Maximum value is " + maximum);
    sc.close();
}  
}
