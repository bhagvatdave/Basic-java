package Basic;

import java.util.Scanner;

public class multiplication_of_n_number {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int Arrsum=1;
        System.out.println("Enter the Nth number");
        int len=sc.nextInt();
        for (int i=1;i<=len;i++){
            Arrsum=Arrsum*i;
        }
        
System.out.println("Multiplication is " + Arrsum);
sc.close();
    } 
}
