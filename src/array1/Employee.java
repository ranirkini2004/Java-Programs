package array1;

public class Employee {
    String name;
    int age;
    double sal;

    Employee(String name,int age,double sal){
        this.name=name;
        this.age=age;
        this.sal=sal;
    }
    @Override
    public String toString(){
        return "Name:"+name+" Age:"+age+" Salary:"+sal;
    }
}


