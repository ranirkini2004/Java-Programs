package constructors;

public class non_parameterized {
    public static void main(String[] args) {
        Employee e=new Employee();
        System.out.println("Employee name: "+e.name);
        System.out.println("Employee id: "+e.id);
        System.out.println("Company name: "+Employee.company);

        Employee.work();
        e.dev();
    }
}
