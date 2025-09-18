package Aadhar;

//the process of creating only one object/one instance of the class - singleton class/single design pattern
//
//rules to develop singleton class
//rule1: declare private constructor
//rule2:declare private static non primitive variable to store object address
//rule3: declare public static helper method to create object.

public class Aadhar {

    int age;
    String name;
    private static Aadhar card;

    private Aadhar(int age,String name){
        System.out.println("Adhar card generated");
        this.age=age;
        this.name=name;
        System.out.println("your name: "+name+" your age: "+age);
    }
    public static void methodObject(int age,String name){
        if(card==null){
            card=new Aadhar(age,name);
        }else{
            System.out.println("Card already generated");
        }
    }
    public static void main(String[] args) {
        methodObject(20,"rani");
        methodObject(20,"rani");
    }

}
