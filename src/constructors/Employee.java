package constructors;

public class Employee {
    String name="Tom";
    int id=2407;
    static String company="xyz";


    //Constructor is a non static member
    //constructor will not return anything

    Employee(){
        System.out.println("Constructor");
    }
    public static void work(){
        System.out.println("Employee is working");
    }
    public void dev(){
        System.out.println("developer");
    }
}
