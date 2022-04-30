package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SHORTSTRING {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Length");
int len =sc.nextInt();
String Arr1[]= new String[len];
System.out.println("Enter Values in Array");
for (int i=0;i<len;i++){
    Arr1[i]=sc.next();
}
for(int i=0;i<Arr1.length;i++) {
			
    for(int j=i+1;j<Arr1.length;j++) {
        String temp=Arr1[i];
        if(Arr1[i].compareTo(Arr1[j])>1) {
            
            Arr1[i]=Arr1[j];
            Arr1[j]=temp;
            
        }
        
    }
    
}
System.out.println(Arrays.toString(Arr1));
        sc.close();
}
}
