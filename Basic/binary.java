package Basic;
import java.util.Scanner;

public class binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First Number");
        double num1 = sc.nextDouble();
        System.out.println("Enter The Second Number");
        double num2 = sc.nextDouble();        
        if ((num1>0.00 && num1<1.00) || ((num2>0.00 && num2<1.00))) {
          System.out.println("TRUE");  
        }else{
            System.out.println("FALSE");
        }
        sc.close();
    }
}
