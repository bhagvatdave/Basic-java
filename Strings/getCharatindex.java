package Strings;

import java.util.Scanner;

public class getCharatindex {
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter index no.");
    int i = sc.nextInt();
    String Str ="Tops Technologies!";
    System.out.println("The character at position " + i + " for " + Str + " is " + Str.charAt(i));
sc.close();
}
}
