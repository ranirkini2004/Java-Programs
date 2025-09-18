package encapsulation;

public class Employee {
    private String name="Smith";
    private int sal=35000;
    private int age=28;

    public String getName(){
        return name;
    }

    public int getSal(){
        return sal;
    }
    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age=age;
    }
    public void setSal(int sal){
        this.sal=sal;
    }
}
