package Basic;
import java.util.Scanner;

public class sum_n_numbers {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int Arrsum=0;
        System.out.println("Enter the Nth number");
        int len=sc.nextInt();
        for (int i=0;i<=len;i++){
            Arrsum=Arrsum+i;
        }
System.out.println("Sum is " + Arrsum);
sc.close();
    }
        
	}    
