package Basic;
import java.util.Scanner;

public class ASCIIvalue {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your Character");
        String ChrStr = sc.nextLine();
        if(ChrStr.length()>1){
            System.out.println("Sorry,we Only Need one Character");
        }else{
           System.out.println("The Character's ASCII Value is " + (int) ChrStr.charAt(0)); 
        }
        sc.close();
    }
}

