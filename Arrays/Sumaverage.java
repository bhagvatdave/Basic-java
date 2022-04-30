package Arrays;
import java.util.Scanner;

public class Sumaverage {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int len =5;
        int Arr1[]= new int[len];
        System.out.println("Enter Values");
        int i;
        for (i=0;i<len;i++){
            Arr1[i]=sc.nextInt();
        }
		int Arrsum=0;
for(int l=0;l<len;l++){
Arrsum=Arrsum+Arr1[l];
}
System.out.println("Sum is " + Arrsum);
System.out.println("Average is " + (Arrsum/len));
sc.close();
    }
        
	}

