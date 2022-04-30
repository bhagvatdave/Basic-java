package Strings;

import java.util.Scanner;

public class CheckStr {
   public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter First String");
    String Str1 = sc.nextLine();
    System.out.println("Enter Second String");
    String Str2 = sc.nextLine();
if (Str1.substring(0,Str2.length()).equals(Str2)) {
    System.out.println("starts with "+Str2+"? True");
} else {
   System.out.println("starts with "+Str2+"? False");  
}
    sc.close();
   } 
}
