package array1;

import java.util.ArrayList;
import java.util.Arrays;

public class Flipkart {
    public static void main(String[] args) {
        Employee e = new Employee("Ram", 34, 50000);
        Bike b = new Bike("KTM", 90000);
        Student s = new Student("Smith", 23);
        Mobile m = new Mobile("Vivo", 20000);
        Laptop l = new Laptop("HP", 45000);
        Books b1 = new Books("class", 185);


        ArrayList l1=new ArrayList();
        l1.add(e);
        l1.add(b);
        l1.add(s);
        l1.add(m);
        l1.add(l);
        l1.add(b1);
        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }





    }
}
