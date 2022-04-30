package Basic;
import java.util.Arrays;
import java.util.Scanner;

public class break_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int num =sc.nextInt();
        int num2 =num;
        int num3 =num;
        //int len= String.valueOf(num).length();
        int k=0;
        while(num3>0){
            num3=num3/10;
            k++;
        }
        int IntArr[]= new int[k];
        for (int i = k-1; i >= 0; i--) {
        IntArr[i]  = num%10;
        num=num/10;     
        }
        System.out.println(Arrays.toString(IntArr));
        sc.close();
    }
}
