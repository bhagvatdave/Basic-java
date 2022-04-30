package Arrays;

import java.util.Arrays;

public class cyclicallyrotate {
    public static void main(String[] args) {
        int Arr1[]={10, 20, 30, 40, 50, 60};
        int temp=Arr1[Arr1.length-1];
        for (int i = Arr1.length-1; i > 0; i--) {
            Arr1[i]=Arr1[i-1];
        }
        Arr1[0]=temp;
        System.out.println(Arrays.toString(Arr1));
    }
}
