package Basic;
import java.util.Scanner;

public class find_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int num =sc.nextInt();
        int num2 =num;
        int k=0;
        while(num>0){
            num=num/10;
            k++;
        }
        System.out.println("Digits in number " + num2 + " is " + k);
    sc.close();
    }
}
