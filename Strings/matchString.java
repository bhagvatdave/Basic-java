package Strings;

import java.util.Scanner;

public class matchString {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter First String");
        String Str1 = sc.nextLine();
        System.out.println("Enter Second String");
        String Str2 = sc.nextLine();
        if (Str1.equals(Str2)) {
           System.out.println("True"); 
        }else{
            System.out.println("False");
        }
        sc.close();
    }
}
