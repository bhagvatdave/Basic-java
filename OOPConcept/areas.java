package OOPConcept;

public class areas {
    float area;

    public static void main(String[] args) {

        areas a =new areas();
        a.printarea(6.7f, 8.3f);
        a.printarea(5f);

    }

    void printarea(float length , float breadth){

        area = length * breadth;

        System.out.println("Area of rectangle is: " +area);

    }

    void printarea(float side){

         area = side * side;

        System.out.println("Area of square is: "+area);

     }
}
