package OOPConcept;

public class MyPclass {
    public void pmethod(){
        System.out.println("This is parent class");
      }
}
class MyCclass extends MyPclass{
  public void cmethod(){
    System.out.println("This is child class");
  }
}

class Ans{
  public static void main(String[] args){
    MyPclass m = new MyPclass();
    MyCclass n = new MyCclass();
    m.pmethod();
    n.cmethod();
    n.pmethod();
  }
}	
