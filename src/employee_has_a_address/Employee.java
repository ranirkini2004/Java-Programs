package employee_has_a_address;

public class Employee {
    String name;
    int age;

    Address a;
    Employee(String name,int age,Address a){
        this.name=name;
        this.age=age;
        this.a=a;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Address: "+a.address);
    }
}
