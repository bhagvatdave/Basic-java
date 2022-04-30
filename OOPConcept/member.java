package OOPConcept;

public class member {
        String name;
        int age;
        String number;
        String address;
        int salary;
        public void printSalary() {
            System.out.println(salary); 
        }

}
    class Employee extends member{
        String specialization;
    }
    class Manager extends member{
        String department;
    }
    class Solution{
        public static void main(String[]args){
            Employee e=new Employee();
            e.name="Bhagvat";
            e.age= 26;
            e.number="1029384756";
            e.address="405 sector b/b";
            e.salary= 50000;
            e.specialization="AutoCad";
            e.printSalary();
            Manager m=new Manager();
            m.name="Dr. john smith";
            m.age= 43;
            m.number="5647382910";
            m.address="Gallifrey";
            m.salary= 85000;
            m.department="Science";
            m.printSalary();
        }
    }
