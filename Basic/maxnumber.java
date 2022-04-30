package Basic;

import java.util.Scanner;

public class maxnumber {

	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
System.out.println("Enter The First Number");
int Firstno=sc.nextInt();
System.out.println("Enter The Second Number");
int Secondno=sc.nextInt();
System.out.println("Enter The Third Number");
int Thirdno=sc.nextInt();

if(Firstno==Secondno && Secondno==Thirdno){
    System.out.println("All the Numbers are the same");
}else if(Firstno>Secondno) {
if(Firstno>Thirdno){
	System.out.println("The max Number is the First Number Which is " + Firstno);
}else{
	System.out.println("The max Number is the Third Number Which is " + Thirdno);
}
}else if(Secondno>Thirdno){
	System.out.println("The max Number is the Second Number Which is " + Secondno);
}else{
	System.out.println("The max Number is the Third Number Which is " + Thirdno);
}
sc.close();

	}

}
