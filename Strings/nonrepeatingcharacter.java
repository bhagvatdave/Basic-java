package Strings;

import java.util.Scanner;

public class nonrepeatingcharacter {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter String");
        String Str1 = sc.nextLine();
        int count=1;
        char unique='0';
        for (int i = 0; i < Str1.length(); i++) {
            for (int j = i+1; j < Str1.length(); j++) {
                if (Str1.charAt(i)==Str1.charAt(j)) {
                    count++;
                }
            }
        if (count==1) {
            unique= Str1.charAt(i);
            break;
        }
        count=1;
        }
        System.out.println("first non-repeating character is " + unique);
        sc.close();
    } 
}
