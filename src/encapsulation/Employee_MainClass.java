package encapsulation;

public class Employee_MainClass {
    public static void main(String[] args) {
//        Employee e=new Employee();
//
//        System.out.println("Employee name: "+e.getName());
//        System.out.println("Employee age: "+e.getAge());
//        System.out.println("Employee salary: "+e.getSal());
//
//        System.out.println("After one year");
//        e.setAge(30);
//        e.setSal(45000);
//        System.out.println("Employee name: "+e.getName());
//        System.out.println("Employee age: "+e.getAge());
//        System.out.println("Employee salary: "+e.getSal());

        Student s=new Student();
        System.out.println(s.getName());
        System.out.println(s.getUsn());
        System.out.println(s.getMarks());
        System.out.println(s.getAge());

        System.out.println('\n');
        System.out.println("After next semester");
        s.setAge(21);
        s.setMarks(98);
        System.out.println(s.getName());
        System.out.println(s.getUsn());
        System.out.println(s.getMarks());
        System.out.println(s.getAge());


    }
}
