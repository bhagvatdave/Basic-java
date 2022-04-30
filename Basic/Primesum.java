package Basic;
public class Primesum {

    public static void main(String[] args) {
        int len =100;
        int Psum=0;
        int i=1;
        int k=0;
        while(k < len) {
            int count = 0;
            for (int j = 1; j < i; j++) {
            if (i%j == 0) {
                count++;
            }
        }
        if(count==1){
        Psum=Psum+i;
        k++;
        }
        i++;
        }
    System.out.println(Psum);
}
}