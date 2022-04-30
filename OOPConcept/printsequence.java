package OOPConcept;

public class printsequence {
    public static void main(String[] args) {

    Printn(10, 'A');
    Printn('B', 5);

    }

    static void Printn(int i, char c){  

        System.out.println("Integer is: "+i+ "\t Char is: "+c);

    }    

     static void Printn(char c,int i){

        System.out.println("Char is: "+c+ "\tInteger is: "+i );

    }   
}
