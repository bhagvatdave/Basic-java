package Basic;
import java.util.Scanner;

public class countnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("Enter The Number");
int Nthno=sc.nextInt();
int newnum=Nthno;
int count=0;
while(Nthno>0){
Nthno=Nthno/10;
count++;
}
System.out.println(newnum + " is containing " + count + " digits");
      sc.close();  
    }
}
