package Basic;
import java.util.Scanner;

public class findcommondigit {
    public static void main(String[] args) {
boolean match=false; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int Firstno=sc.nextInt();
        int Fno=Firstno;
        System.out.println("Enter second Number");
        int secondno=sc.nextInt();
        int Sno=secondno;
        if((Firstno>24 && Firstno<76) || (secondno>24 && secondno<76)){
         while (Fno>0 && match==false) {
             int k=Fno%10;
             while (Sno>0 && match==false) {
                int j=Sno%10;
                if (k==j) {
                  match=true;  
                }
                Sno=Sno/10;
             }
             Sno=secondno;
             Fno=Fno/10;
         }   
        }
        System.out.println(match);
        sc.close();
    }
}
