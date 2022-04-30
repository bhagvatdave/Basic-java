package Strings;

public class matchStr {
    public static void main(String[] args) {
     String Str1 = "Java Exercise";
     String Str2 = "se";
     if (Str1.substring(Str1.length()-2, Str1.length()).equals(Str2)) {
        System.out.println("True");
     } else {
        System.out.println("False");  
     }

    }
}

