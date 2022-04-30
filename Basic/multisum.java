package Basic;
import java.util.Scanner;

public class multisum {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in); 
        System.out.println("Enter The Number");
        int num=sc.nextInt();
            System.out.println("The of " + num + "+" + num + num + "+" + num + num + num + " is " +(num + ((num*10) + num) + ((num*100) + (num*10) + num)));

        sc.close();
    }
}
