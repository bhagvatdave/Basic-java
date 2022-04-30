package Basic;
import java.util.Scanner;

public class evennumbers {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
System.out.println("Enter The Last Number");
int Nthno=sc.nextInt();
System.out.println("Even Number");
for (int i=1;i<Nthno;i++){
if(i%2==0){
System.out.println(i);
}
}
sc.close();
}
}
