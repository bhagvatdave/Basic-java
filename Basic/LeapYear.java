package Basic;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Year");
        int LYear =sc.nextInt();
if(LYear%4==0){
    System.out.println(LYear + " is Leap Year");
}else{
    System.out.println(LYear + " is not Leap Year");
}
      sc.close();  
    }
}
