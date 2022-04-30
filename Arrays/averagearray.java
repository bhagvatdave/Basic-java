package Arrays;

import java.util.*;

public class averagearray {
    public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
System.out.println("Enter Array Length");
int len =sc.nextInt();
int Arr1[]= new int[len];
System.out.println("Enter Values in Array");
for (int i=0;i<len;i++){
    Arr1[i]=sc.nextInt();
}
Arrays.sort(Arr1);
System.out.println(Arrays.toString(Arr1));


int Arrsum=0;
if (len>1){
for(int l=0;l<len;l++){
    if (l != 0 || l != len-1) {
        Arrsum=Arrsum+Arr1[l]; 
    }
}
}else{
    Arrsum=Arr1[0];
}
System.out.println("Average of Array is " + ((len>1) ? (Arrsum/len) : Arrsum));
sc.close();
    }
}
