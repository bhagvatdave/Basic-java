package Strings;

public class divideString {
    public static void main(String[] args) { 
   String abc ="abcdefghijklmnopqrstuvwxy";
   for (int i = 0; i > abc.length(); i++) {
      if (i%5==0 && i>0) {
          System.out.println(abc.substring(i-5, i)); 
      }
          
       
   }
   
    }
}
