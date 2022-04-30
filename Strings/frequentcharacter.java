package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class frequentcharacter {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter First String");
        String Str1 = sc.nextLine();
        char[] chrarr =Str1.toCharArray();
        Arrays.sort(chrarr);
        System.out.println(chrarr);
        int count=0;
        int max2 =0;
        int max1 =0;
        char chr='0';
        for (int i = 1; i < chrarr.length; i++) {
         if (chrarr[i-1] == chrarr[i]){
            count++;
         }else{
             max1=count;
             if (max1>max2) {
                 max2=max1;
                 chr=chrarr[i];
             }
             count=0;
         }

        }
        System.out.println(max2);
        System.out.println(max1);
        System.out.println(chr);
        sc.close();
    }  
}
