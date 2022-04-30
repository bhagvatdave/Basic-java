package Basic;
import java.util.Scanner;


public class StringOperation {

	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
System.out.println("Please Enter your Character\\s");
String ChrStr = sc.next();
if(ChrStr.length()>1){
	System.out.println("Sorry,we Only Need one Character");
}else if((ChrStr.charAt(0)>=65 && ChrStr.charAt(0)<=90) ||(ChrStr.charAt(0)>=97 && ChrStr.charAt(0)<=122)){
    if(ChrStr.toLowerCase().equals("a") || ChrStr.toLowerCase().equals("e") || ChrStr.toLowerCase().equals("i") || ChrStr.toLowerCase().equals("o") || ChrStr.toLowerCase().equals("u")){
        System.out.println("Your Character is Vowel " + ChrStr);
    }else{
        System.out.println("Your Character is Consonant " + ChrStr);
    }
}else if(ChrStr.charAt(0)>=48 && ChrStr.charAt(0)<=57){
    System.out.println("Your Character is Number " + ChrStr);
}else{
	System.out.println("Your Character is Spacial");
}
sc.close();
	}

}
