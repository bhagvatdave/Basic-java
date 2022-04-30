package Strings;

import java.util.Scanner;

public class concatenateStr {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter First String");
        String Str1 = sc.nextLine();
        System.out.println("Enter Second String");
        String Str2 = sc.nextLine();
        System.out.println("The Concatenate is " + Str1 +" "+ Str2);
sc.close();
    }
}
