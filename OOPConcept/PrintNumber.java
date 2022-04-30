package OOPConcept;

public class PrintNumber {
    public static void main(String[] args) {

    

        PrintNumber obj = new PrintNumber();

        obj.printn(5);

        obj.printn(5.5f);

        obj.printn("1234");

        obj.printn('B');

        obj.printn(55.555);

    }

    void printn(int a){

        System.out.println("Integer: " +a);

    }

    void printn(float a){

        System.out.println("float: " +a);

    }

    void printn(String a){

        System.out.println("String: " +a);   

    }

    void printn(char a){

        System.out.println("Char: " +a);

    }

    void printn(double a){

        System.out.println("Double: " +a);

    

    }
}
