package Strings;

public class duplicatesStr {
  public static void main(String[] args) {
      String Str1 ="w3resource tops technologies";
      char DStrArr[]=new char[Str1.length()];
      int DintArr[]=new int[Str1.length()];
      int count=1;
      int k=0;
      for (int i = 0; i < Str1.length(); i++) {
        for (int j = i+1; j < Str1.length(); j++) {
            if (Str1.charAt(i)==Str1.charAt(j)) {
                count++;
            }
        }
    if (count>1) {
        DStrArr[k]= Str1.charAt(i);
        DintArr[k]=count;
        k++;
    }
    count=1;
    }
    for (int i = 0; i < DStrArr.length; i++) {
        if (DintArr[i]!=0) {
            System.out.println(DStrArr[i] + " appears " + DintArr[i] + " Times"); 
        }
         
    }

  }
    
}
