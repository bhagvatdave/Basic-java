package Basic;
import java.util.Scanner;

public class sumNcheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
System.out.println("Enter First Number");
int Firstno=sc.nextInt();
System.out.println("Enter second Number");
int secondno=sc.nextInt();
System.out.println("Enter Third Number");
int Thirdno=sc.nextInt();
if (Thirdno==Firstno+secondno){
    System.out.println("True");
}else{
    System.out.println("False");
}

        sc.close();
    }
}
