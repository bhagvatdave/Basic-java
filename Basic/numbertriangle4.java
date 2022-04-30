package Basic;
import java.util.Scanner;

public class numbertriangle4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
System.out.println("Enter the last number");
int len =sc.nextInt();
for(int i=1;i<=len;i++){
    if (i==1){
        System.out.println(1);
    }else{
        System.out.println((int)Math.pow(11, i));
    }
    }
sc.close();
    }
}