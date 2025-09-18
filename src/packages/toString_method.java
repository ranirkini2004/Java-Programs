package packages;

import constructors.parameterized_const.Student;

public class toString_method {
    String name;
    int age;

    toString_method(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String toString(){
        return "Name:"+name+"\nAge:"+age;
    }
    public static void main(String[] args) {
        toString_method t=new toString_method("rani",20);
        System.out.println(t);
        System.out.println(t.toString());

        String s=new String("hello");
        System.out.println(s);
        System.out.println(s.toString());



    }
}
