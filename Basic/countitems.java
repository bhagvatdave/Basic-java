package Basic;
import java.util.Scanner;

public class countitems {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your line");
        String ChrStr = sc.nextLine();
        String newstr = ChrStr;
        char ChrArr[] = ChrStr.toCharArray();
        int Vowel=0;
        int Consonant=0;
        int Number=0;
        int space=0;
        int Spacial=0;

for(int i =0;i<ChrStr.length();i++){

        if((ChrArr[i]>=65 && ChrArr[i]<=90) ||(ChrArr[i]>=97 && ChrArr[i]<=122)){
            if((ChrArr[i]==65 || ChrArr[i]==97) || 
            (ChrArr[i]==69 || ChrArr[i]==101) || 
            (ChrArr[i]==73 || ChrArr[i]==105) || 
            (ChrArr[i]==79 || ChrArr[i]==111) || 
            (ChrArr[i]==85 || ChrArr[i]==117)){
                Vowel++;
                //System.out.println("Your Character is Vowel " + ChrStr);
            }else{
                Consonant++;
                //System.out.println("Your Character is Consonant " + ChrStr);
            }
        }else if(ChrArr[i]>=48 && ChrArr[i]<=57){
            Number++;
            //System.out.println("Your Character is Number " + ChrStr);
        }else if(ChrArr[i]==32){
space++;
        }else{
            Spacial++;
            //System.out.println("Your Character is Spacial");
        }
    }
    System.out.println("The String is \"" + newstr + "\"");
    System.out.println("Total no of Vowel " + Vowel);
    System.out.println("Total no of Consonant " + Consonant);
    System.out.println("Total no of Number " + Number);
    System.out.println("Total no of space " + space);
    System.out.println("Total no of Spacial " + Spacial);

        sc.close();
            }
}
