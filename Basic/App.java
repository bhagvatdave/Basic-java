package Basic;
import java.util.Arrays;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
Scanner sc =new Scanner(System.in);
System.out.println("Enter Array Length");
int len =sc.nextInt();
int Arr1[]= new int[len];
System.out.println("Enter Values in Array");
for (int i=0;i<len;i++){
    Arr1[i]=sc.nextInt();
}
//Arrays.sort(Arr1);

System.out.println(Arrays.toString(Arr1));
for (int j=0;j<len;j++){
    for(int k=j+1;k<len;k++){
        int temp=0;
        if(Arr1[j]>Arr1[k]){
            temp=Arr1[j];
            Arr1[j]=Arr1[k];
            Arr1[k]=temp;
        }
    }
}
System.out.println(Arrays.toString(Arr1));

System.out.println("Minimum value of Array is " + Arr1[0]);
System.out.println("Maximum value of Array is " + ((len>1) ? Arr1[len-1] : Arr1[0]));
System.out.println((len>1) ? "2nd Minimum value is " + Arr1[1] : "Your Array Length is 1");
System.out.println((len>1) ? "2nd Maximum value is " + Arr1[len-2] : "Your Array Length is 1");
int Arrsum=0;
if (len>1){
for(int l=0;l<len;l++){
Arrsum=Arrsum+Arr1[l];
}
}else{
    Arrsum=Arr1[0];
}
System.out.println("Sum of Array is " + Arrsum);
System.out.println("Average of Array is " + ((len>1) ? (Arrsum/len) : Arrsum));
sc.close();
    }
}

