package Basic;
import java.util.Scanner;

public class numbertriangle3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
System.out.println("Enter the last number");
int len =sc.nextInt();
int k=1;
for(int i =1;i<=len;i++){
    for(int j=1;j<=i;j++) {
System.out.print(k);
k=(k==1) ? 0 : 1 ;
    }
System.out.print("\n");
}
sc.close();
    }
}